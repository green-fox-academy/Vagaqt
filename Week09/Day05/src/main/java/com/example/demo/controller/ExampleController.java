package com.example.demo.controller;


import com.example.demo.model.ExampleLink;
import com.example.demo.repo.ExampleRepo;
import com.example.demo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExampleController {

    private ExampleRepo exampleRepo;
    private ExampleService exampleService;
    private int aliasCounter = 0;

    @Autowired
    public ExampleController(ExampleRepo exampleRepo, ExampleService exampleService) {
        this.exampleRepo = exampleRepo;
        this.exampleService = exampleService;
    }

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("linkList", exampleService.getAllLinks());
        return "index";
    }

    @PostMapping("/save-link")
    public String addLink(@ModelAttribute ExampleLink exampleLink) {
        for (int i = 0; i < exampleService.getAllLinks().size(); i++) {
            if (exampleLink.getAlias().equals(exampleService.getAllLinks().get(i).getAlias())) {
                aliasCounter++;
            }
        }
        if (aliasCounter > 0) {

        } else {
            
            exampleService.createLink(exampleLink);
        }
        return "redirect:/";
    }

    @GetMapping("/a/{alias}")
    public ResponseEntity<?> viewLink(@PathVariable String alias) {
        exampleService.findByAlias(alias).setHitCount(exampleService.findByAlias(alias).getHitCount() + 1);
        return ResponseEntity.ok(exampleService.findByAlias(alias));
    }

    @GetMapping("/api/links")
    public ResponseEntity<?> getAllLinks() {
        return ResponseEntity.ok(exampleService.getAllLinks());
    }
}
