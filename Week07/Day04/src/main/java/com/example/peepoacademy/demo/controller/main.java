package com.example.peepoacademy.demo.controller;

import com.example.peepoacademy.demo.model.Pepe;
import com.example.peepoacademy.demo.model.PepeDollar;
import com.example.peepoacademy.demo.model.PepeTreat;
import com.example.peepoacademy.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Timer;

@Controller
public class main {
    TaskService taskService;
    TreatService treatService;
    ShopService shopService;
    StatusService statusService;
    CSSService cssService;


    @Autowired
    public main(TaskService taskService, TreatService treatService, ShopService shopService, StatusService statusService, CSSService cssService) {
        this.taskService = taskService;
        this.treatService = treatService;
        this.shopService = shopService;
        this.statusService = statusService;
        this.cssService = cssService;
        Pepe pepe = new Pepe();
        Timer timer = new Timer();
//        timer.schedule(new PepeDollar(shopService.getCurrentDolla()), 0, 20000);
    }


    @GetMapping("/")
    public String show(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("HOME"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("pepegSit"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/coffee")
    public String drinkCoffee(Model model) {
        statusService.setPepeHunger(-5);
        statusService.setPepeThirst(+5);
        statusService.setPepeHappiness(+7);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("HOME"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("peepoCoffee"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/travel")
    public String travel(Model model) {
        statusService.setPepeHunger(-10);
        statusService.setPepeThirst(-5);
        statusService.setPepeHappiness(-6);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("ROAD"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("monkaSteer"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/arriving")
    public String arriving(Model model) {
        statusService.setPepeHunger(-8);
        statusService.setPepeThirst(-7);
        statusService.setPepeHappiness(-5);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("NASA"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("ez"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/readyforwork")
    public String readyforwork(Model model) {
        statusService.setPepeHunger(0);
        statusService.setPepeThirst(0);
        statusService.setPepeHappiness(-10);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("NASA"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("monkaWash"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/work")
    public String work(Model model) {
        statusService.setPepeHunger(-14);
        statusService.setPepeThirst(-3);
        statusService.setPepeHappiness(+10);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("NASA"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("hackerPepe"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/workcoffee")
    public String workcoffee(Model model) {
        statusService.setPepeHunger(-5);
        statusService.setPepeThirst(+4);
        statusService.setPepeHappiness(+2);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("NASA"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("peepoCoffeev2"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/smokes")
    public String smokes(Model model) {
        statusService.setPepeHunger(-4);
        statusService.setPepeThirst(0);
        statusService.setPepeHappiness(+15);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("SMOKES"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("pepegaCredit"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/pepejam")
    public String pepejam(Model model) {
        statusService.setPepeHunger(-2);
        statusService.setPepeThirst(-2);
        statusService.setPepeHappiness(+10);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("ROOM"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("pepejam"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }
    @GetMapping("/arrivingHome")
    public String arrivingHome(Model model) {
        statusService.setPepeHunger(-15);
        statusService.setPepeThirst(-2);
        statusService.setPepeHappiness(+4);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("HOME"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("Smoge"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/FeelsLitMan")
    public String FeelsLitMan(Model model) {
        statusService.setPepeHunger(-10);
        statusService.setPepeThirst(-10);
        statusService.setPepeHappiness(+25);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("HOME"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("FeelsLitMan"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/peepoChill")
    public String peepoChill(Model model) {
        statusService.setPepeHunger(0);
        statusService.setPepeThirst(0);
        statusService.setPepeHappiness(+5);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("ROOM"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("peepoChill"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }
    @GetMapping("/peepoPizza")
    public String peepoPizza(Model model) {
        statusService.setPepeHunger(+25);
        statusService.setPepeThirst(-2);
        statusService.setPepeHappiness(+10);
        treatService.eating();
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("ROOM"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("peepoPizza"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }
    @GetMapping("/peepoJuice")
    public String peepoJuice(Model model) {
        statusService.setPepeHunger(+2);
        statusService.setPepeThirst(+25);
        statusService.setPepeHappiness(+10);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("ROOM"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("peepoJuice"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }
    @PostMapping("/peeposhop")
    public String peeposhop(String type, Integer quantity, Model model) {
        treatService.shopping(type, quantity);
        List<PepeTreat> asd = treatService.getPepeTreatsList();
        model.addAttribute("itemlist", asd);
        model.addAttribute("name", "Pepe");
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("dollar", shopService.getCurrentDolla());
        model.addAttribute("background", cssService.getBackgroundImageHashmap().get("SMOKES"));
        model.addAttribute("gif", cssService.getPeepoTaskGifMap().get("pepegaCredit"));
        model.addAttribute("mood", cssService.getPepeEmotionMap().get("yep"));
        return "index";
    }

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "redirect:/?name=" + name;
    }



}
