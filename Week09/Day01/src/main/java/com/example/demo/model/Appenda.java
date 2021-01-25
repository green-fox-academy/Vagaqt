package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter


public class Appenda {
    private String appended;

    public void setAppended(String appendable) {
        this.appended = appendable + "a";
    }

}
