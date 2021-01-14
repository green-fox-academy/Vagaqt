package com.example.peepoacademy.demo.service;

import com.example.peepoacademy.demo.model.Pepe;
import org.springframework.stereotype.Service;

@Service
public class StatusService {
    Pepe pepe = new Pepe();

    public Integer getPepeHunger(){
        return pepe.getHunger();
    }
    public Integer getPepeThirst(){
        return pepe.getThirst();
    }
    public Integer getPepeHappiness(){
        return pepe.getHappiness();
    }
}
