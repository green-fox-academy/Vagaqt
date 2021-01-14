package com.example.peepoacademy.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Pepe {
    private String name;
    private Integer hunger = 100;
    private Integer thirst = 80;
    private Integer happiness = 60;
}
