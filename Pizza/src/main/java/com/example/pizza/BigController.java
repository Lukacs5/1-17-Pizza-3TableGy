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

    Feltolt dataBase = new Feltolt("jdbc:mysql://localhost/pizzatabla?user=root");

    ArrayList<osszRendeles> rendelesek = dataBase.Rendelesek();
    boolean error = false;

    felhasznalok a;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("loggedInUser", a);
        return "Index";
    }

    @GetMapping("/reg")
    public String reg(Model model) {
        model.addAttribute("loggedInUser", a);
        model.addAttribute("felh", new felhasznalok());
        return "Reg";
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("loggedInUser", a);
        model.addAttribute("loginFelh", new felhasznalok());
        return "Login";
    }

    @PostMapping("/regUser")
    public String regUser(@ModelAttribute felhasznalok user, Model model) {
        model.addAttribute("loggedInUser", a);
        dataBase.insertUser(user);
        user = null;
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute felhasznalok loginUser, Model model) {
        model.addAttribute("loggedInUser", a);
        a = dataBase.Login(loginUser);
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout() {
        a = null;
        return "Index";
    }

    @GetMapping("/rend")
    public String Rendelesek(Model model) {
        model.addAttribute("loggedInUser", a);
        model.addAttribute("rendeles", rendelesek);
        return "Rendelesek";
    }

    @GetMapping("/kapcs")
    public String Kapcsolat(Model model) {

        model.addAttribute("loggedInUser", a);
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
            if (a == null) {
                komm.setDatum(ido);
                komm.setFelhNev("Vendég");
                komm.setEmail("Vendég");
            } else {
                komm.setDatum(ido);
                komm.setFelhNev(a.getFelh());
                komm.setEmail(a.getEmail());
            }
            dataBase.insertKomm(komm);
            komm = null;
            return "redirect:/";
        }
    }

    @GetMapping("/uzenetek")
    public String Uzenetek(Model model) {
        model.addAttribute("loggedInUser", a);
        ArrayList<Komment> komments = dataBase.getKomments();
        model.addAttribute("kommentek", komments);
        return "Uzenetek";
    }
}
