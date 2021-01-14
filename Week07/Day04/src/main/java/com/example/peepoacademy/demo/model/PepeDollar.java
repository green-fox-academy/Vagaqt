package com.example.peepoacademy.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.TimerTask;

@Setter
@Getter
@NoArgsConstructor
public class PepeDollar extends TimerTask {
    private Integer currentPepeDollar;


    public PepeDollar(Integer currentPepeDollar){
        this.currentPepeDollar = currentPepeDollar;
    }

    @Override
    public void run() {
        currentPepeDollar++;
        System.out.println(currentPepeDollar);
    }
}
