package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter

public class GuardianMessage {
    private String received;
    private String translated;

    public GuardianMessage(String received) {
        this.received = received;
        this.translated = "I am Groot!";
    }
}
