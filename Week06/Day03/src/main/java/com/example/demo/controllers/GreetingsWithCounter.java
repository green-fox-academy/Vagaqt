package com.example.demo.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingsWithCounter {
    AtomicLong counter;
    String content;


    public AtomicLong getCounter() {
        return counter;
    }

    public String getContent() {
        return content;
    }

    public GreetingsWithCounter(AtomicLong counter, String content) {
        this.counter = counter;
        this.content = content;
    }
}
