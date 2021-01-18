package com.example.peepoacademy.demo.service;

import com.example.peepoacademy.demo.model.Pepe;
import com.example.peepoacademy.demo.model.PepeDollar;
import com.example.peepoacademy.demo.model.PepeTreat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class ShopService {
    Integer currentDolla = 0;
    private TreatService treatService;
    private Integer actualDolla;

    public ShopService(TreatService treatService) {
        this.treatService = treatService;
    }


    public void buyFood(PepeTreat pepeTreat) {
        currentDolla = currentDolla - pepeTreat.getPrice();
    }

    public void payBills(Pepe pepe) {
        currentDolla -= 1500;
        pepe.setHappiness(pepe.getHappiness() - 50);
    }

    public void buySmokes(Pepe pepe) {
        currentDolla -= 1000;
        pepe.setHappiness(pepe.getHappiness() + 40);
    }

}
