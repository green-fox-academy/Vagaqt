package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzHello {
    AtomicLong c = new AtomicLong();
    String fizzbuzzwoof = "";
    String fontsize = "12";


    @RequestMapping(value = "/web/fizzbuzz")

    public String GreetingWithCounter(Model model, @RequestParam String name) {

        Random random = new Random();
        int randomColor = random.nextInt(0xffffff + 1);
        String colorCode = String.format("#%06x", randomColor);
        int d = c.intValue() + 1;

        if ((d % 3 == 0) && (d % 5 == 0) && (d % 7 == 0)) {
            fontsize = "72";
            fizzbuzzwoof = "FizzBuzzWoof";
        } else if ((d % 3 == 0 && d % 5 == 0) || (d % 3 == 0 && d % 7 == 0) || (d % 5 == 0 && d % 7 == 0)) {
            fontsize = "48";
            fizzbuzzwoof = "FizzBuzz";
        } else if ((d % 3 == 0) || (d % 5 == 0) || (d % 7 == 0)) {
            fontsize = "24";
            fizzbuzzwoof = "Fizz";
        } else {
            fontsize = "12";
            fizzbuzzwoof = "";
        }

        model.addAttribute("rgb", colorCode);
        model.addAttribute("name", name);
        model.addAttribute("fontsize", fontsize);
        c.getAndIncrement();
        model.addAttribute("counter", "(" + c + ")" + fizzbuzzwoof);
        return "FizzBuzzGreeting";
    }


}