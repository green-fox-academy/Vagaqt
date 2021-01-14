package com.colours.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoursApplication implements CommandLineRunner{
    public Printer printer;
    public MyColour red;

    @Autowired
    ColoursApplication(Printer printer, MyColour red) {
        this.printer = printer;
        this.red = red;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        red.printColour();
        printer.log("stringmessage");
    }

}
