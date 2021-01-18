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


    public void setPepeHunger(int n){
        pepe.setHunger(getPepeHunger()+n);
    }
    public void setPepeThirst(int n){
        pepe.setThirst(getPepeThirst()+n);
    }
    public void setPepeHappiness(int n){
        pepe.setHappiness(getPepeHappiness()+n);
    }
}
