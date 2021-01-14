package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilitiesController {
    public UtilitiesDependency dependency;

    @Autowired
    UtilitiesController(UtilitiesDependency dependency) {
        this.dependency = dependency;

    }

    @GetMapping("")
    public String show(){
        return "index";
    }

    @GetMapping("/useful")
    public String show(Model model) {
        return "index";
    }

    @GetMapping("/useful/colored")
    public String showColored(Model model) {
        model.addAttribute("randomColor", dependency.randomColor());
        return "index";
    }
}
