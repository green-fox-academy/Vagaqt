package com.example.peepoacademy.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PepeTask {
    private String treatName;
    private Integer foodValue;
    private Integer drinkValue;
    private Integer happinessValue;

}