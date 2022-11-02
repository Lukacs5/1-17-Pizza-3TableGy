package com.example.pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
@SpringBootApplication
public class PizzaApplication {

    public static void main(String[] args) {

        Feltolt fel = new Feltolt("jdbc:mysql://localhost/pizzatabla?user=root");
        ArrayList<pizza> pizzaList = fel.getAllPizza();
        ArrayList<kategoria> kategList = fel.getAllKategoria();
        ArrayList<rendeles> rendelesList = fel.getAllRendeles();
        //System.out.println(pizzaList);
        //System.out.println(kategList);
        //System.out.println(rendelesList);
        //SpringApplication.run(PizzaApplication.class, args);
    }

    @GetMapping("/")
    public String Index()
    {
        return "Index";
    }
}
