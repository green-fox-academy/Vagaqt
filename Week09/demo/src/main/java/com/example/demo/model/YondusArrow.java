package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class YondusArrow {
    private Double distance;
    private Double time;
    private Double speed;

    public YondusArrow(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        this.speed = distance/time;
    }
}
