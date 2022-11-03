package com.example.pizza;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BigController {

    Feltolt dataBase = new Feltolt("jdbc:mysql://localhost/pizzatabla?user=root");
    felhasznalok a;
    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("loggedInUser",a);
        return "Index";
    }
    @GetMapping("/reg")
    public String reg(Model model)
    {
        model.addAttribute("loggedInUser",a);
        model.addAttribute("felh",new felhasznalok());
        return "Reg";
    }
    @GetMapping("/login")
    public String login(Model model)
    {
        model.addAttribute("loggedInUser",a);
        model.addAttribute("loginFelh",new felhasznalok());
        return "Login";
    }

    @PostMapping("/regUser")
    public String regUser(@ModelAttribute felhasznalok user,Model model)
    {
        model.addAttribute("loggedInUser",a);
        dataBase.insertUser(user);
        user = null;
        return "redirect:/";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute felhasznalok loginUser,Model model)
    {
        model.addAttribute("loggedInUser",a);
        a = dataBase.Login(loginUser);
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logout()
    {
        a = null;
        return "Index";
    }
}
