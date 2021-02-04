package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderResponseDTO {

    private Long id;
    private String name;
    private String base;
    private String topping;
    private String status;
}
