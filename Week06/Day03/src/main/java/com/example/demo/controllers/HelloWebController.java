package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
    AtomicLong c = new AtomicLong();

    @RequestMapping(value = "/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping(value = "/web/greetingwithcounter")
    public String GreetingWithCounter(Model model, @RequestParam String name) {
        model.addAttribute("name", name);
        c.getAndIncrement();
        model.addAttribute("counter", c);
        return "greetingWithCounter";
    }


}
