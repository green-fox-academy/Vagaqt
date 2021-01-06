package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong c = new AtomicLong(1);

//    @RequestMapping
//    public Object greeting() {
//        return new Greetings(1L, "Hello World");
//    }

    @RequestMapping
    public Object greetingYou(@RequestParam String name) {
        return new Greetings(1L, "Hello " + name);
    }

    @RequestMapping(value = "/greeting")
    public Object greetingWithCounter(@RequestParam String name) {
        c.getAndIncrement();
        return new GreetingsWithCounter(c, "Hello " + name);

    }
}
