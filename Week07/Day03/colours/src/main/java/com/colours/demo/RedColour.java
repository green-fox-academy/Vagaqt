package com.colours.demo;

import org.springframework.stereotype.Service;

@Service
public class RedColour implements MyColour{
    @Override
    public void printColour() {
        System.out.println("it is red in colour...");
    }
}
