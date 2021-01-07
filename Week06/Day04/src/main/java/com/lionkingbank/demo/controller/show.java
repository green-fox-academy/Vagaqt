package com.lionkingbank.demo.controller;

import com.lionkingbank.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class show {
    private List<BankAccount> accounts = new ArrayList<>();

    public show(){
        accounts.add(new BankAccount("Ze",200.00,"zebra", false));
        accounts.add(new BankAccount("Lee",150.00,"lion", false));
        accounts.add(new BankAccount("Eliott",350.00,"elephant", false));
        accounts.add(new BankAccount("Mr. T",220.00,"turtle", false));
        accounts.add(new BankAccount("Fridgey",305.00,"refrigerator", true));
    }

    @GetMapping("")
    public String show(@RequestParam(required = false, defaultValue = "World!") String name, Model model) {
        model.addAttribute("name", name);
//        BankAccount zebra = new BankAccount("Ze", 200.00, "zebra");
//        model.addAttribute("animalName", zebra.getName());
//        model.addAttribute("balance", zebra.getBalance());
//        model.addAttribute("animalType", zebra.getAnimalType());
        model.addAttribute("accounts", accounts);
        return "index";
    }
    private double moneyInBank(){
        return accounts
                .stream()
                .mapToDouble(f -> f.getBalance())
                .sum();
    }
    @PostMapping("/save-account")
    public String saveFood(BankAccount account){
        accounts.add(account);
        return "redirect:/";
    }

}