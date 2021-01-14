package com.colours.demo;

import org.springframework.stereotype.Service;

public class BlueColour implements MyColour{
    @Override
    public void printColour() {
        System.out.println("It is blue in colour...");
    }
}
