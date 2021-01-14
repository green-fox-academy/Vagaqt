package com.example.peepoacademy.demo.service;

import com.example.peepoacademy.demo.model.PepeTreat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TreatService {
    private List<PepeTreat> pepeTreatList = new ArrayList<>();

    public TreatService(){
        pepeTreatList.add(cricket);
        pepeTreatList.add(waxworm);
        pepeTreatList.add(grasshopper);
        pepeTreatList.add(brineShrimp);
        pepeTreatList.add(mouse);
    }

    PepeTreat cricket = new PepeTreat("Cricket", 30, 20, 55,0);
    PepeTreat waxworm = new PepeTreat("Waxworm", 20, 40, 75,0);
    PepeTreat grasshopper = new PepeTreat("Grasshopper", 50, 30, 120,0);
    PepeTreat brineShrimp = new PepeTreat("Brine Shrimp", 40, 60, 185,0);
    PepeTreat mouse = new PepeTreat("Mouse", 80, 60, 200,0);

    public void buyItem(Integer quant, PepeTreat pepeTreat){
        pepeTreat.setBoughtQuant(pepeTreat.getBoughtQuant()+quant);
    }

    public List<PepeTreat> getPepeTreatsList() {
        return pepeTreatList;
    }
}
