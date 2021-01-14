package com.example.peepoacademy.demo.controller;

import com.example.peepoacademy.demo.model.Pepe;
import com.example.peepoacademy.demo.model.PepeDollar;
import com.example.peepoacademy.demo.model.PepeTreat;
import com.example.peepoacademy.demo.service.ShopService;
import com.example.peepoacademy.demo.service.StatusService;
import com.example.peepoacademy.demo.service.TaskService;
import com.example.peepoacademy.demo.service.TreatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Timer;

@Controller
public class main {
    TaskService taskService;
    TreatService treatService;
    ShopService shopService;
    StatusService statusService;


    @Autowired
    public main(TaskService taskService, TreatService treatService, ShopService shopService, StatusService statusService) {
        this.taskService = taskService;
        this.treatService = treatService;
        this.shopService = shopService;
        this.statusService = statusService;
        Pepe pepe = new Pepe();
        Timer timer = new Timer();
        timer.schedule(new PepeDollar(shopService.getCurrentDolla()), 0, 20000);

    }


    @GetMapping("/")
    public String show(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("hunger", statusService.getPepeHunger());
        model.addAttribute("thirst", statusService.getPepeThirst());
        model.addAttribute("happiness", statusService.getPepeHappiness());
        model.addAttribute("itemlist", treatService.getPepeTreatsList());
        model.addAttribute("dollar", shopService.getCurrentDolla());
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

    @PostMapping("/add-trick")
    public String addTrick(String trick) {
        taskService.addTask(trick);
        return "redirect:/";
    }

}
