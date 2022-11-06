package com.example.pizza;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@Controller
public class BigController {

    AdatbazisFuggvenyek dataBase = new AdatbazisFuggvenyek("jdbc:mysql://localhost/pizzatabla?user=root");

    ArrayList<osszRendeles> rendelesek = dataBase.Rendelesek();
    boolean error = false;

    felhasznalok mainUser;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("loggedInUser", mainUser);
        return "Index";
    }

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("loggedInUser", mainUser);
        model.addAttribute("felh", new felhasznalok());
        return "Reg";
    }

    @GetMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("Error", error);
        model.addAttribute("loggedInUser", mainUser);
        model.addAttribute("loginFelh",new felhasznalok());
        error = false;
        return "Login";
    }

    @PostMapping("/regUser")
    public String regUser(@ModelAttribute felhasznalok user,Model model)
    {
        boolean b = dataBase.userChechName(user);
        if(b) error = true;
        else {
            model.addAttribute("loggedInUser", mainUser);
            dataBase.insertUser(user);
            user = null;
        }
        return "redirect:/reg";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute felhasznalok loginUser,Model model)
    {
        mainUser = dataBase.Login(loginUser);
        if(mainUser == null)
        {
            error = true;
        }
        model.addAttribute("loggedInUser", mainUser);
        return "redirect:/login";
    }

    @GetMapping("/logout")
    public String logout() {
        mainUser = null;
        return "Index";
    }

    @GetMapping("/rend")
    public String Rendelesek(Model model) {
        model.addAttribute("loggedInUser", mainUser);
        model.addAttribute("rendeles", rendelesek);
        return "Rendelesek";
    }

    @GetMapping("/kapcs")
    public String Kapcsolat(Model model) {

        model.addAttribute("loggedInUser", mainUser);
        model.addAttribute("error", error);
        model.addAttribute("komm", new Komment());
        error = false;
        return "Kapcsolat";
    }

    @PostMapping("/kommBe")
    public String regUser(@ModelAttribute Komment komm, Model model) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String ido = dtf.format(now);
        if (komm.getSzoveg() == "") {
            error = true;
            return "redirect:/kapcs";
        } else {
            if (mainUser == null) {
                komm.setDatum(ido);
                komm.setFelhNev("Vendég");
                komm.setEmail("Vendég");
            } else {
                komm.setDatum(ido);
                komm.setFelhNev(mainUser.getFelh());
                komm.setEmail(mainUser.getEmail());
            }
            dataBase.insertKomm(komm);
            komm = null;
            return "redirect:/";
        }
    }

    @GetMapping("/uzenetek")
    public String Uzenetek(Model model) {
        model.addAttribute("loggedInUser", mainUser);
        ArrayList<Komment> komments = dataBase.getKomments();
        model.addAttribute("kommentek", komments);
        return "Uzenetek";
    }
}
