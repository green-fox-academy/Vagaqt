package com.example.peepoacademy.demo.service;

import com.example.peepoacademy.demo.model.Pepe;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<String> pepeTaskList = new ArrayList<>();


    public void addTask(String task) {
        pepeTaskList.add(task);
    }

    public List<String> getPepeTaskListList() {
        return pepeTaskList;
    }

    public void haveFun(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() + 20);
        pepe.setHunger(pepe.getHunger() - 10);
        pepe.setThirst(pepe.getThirst() - 15);
    }

    public void doWork(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() - 30);
        pepe.setHunger(pepe.getHunger() - 20);
        pepe.setThirst(pepe.getThirst() - 25);
    }

    public void eatSomething(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() + 10);
        pepe.setHunger(pepe.getHunger() + 30);
        pepe.setThirst(pepe.getThirst() - 5);
    }

    public void drinkSomething(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() + 5);
        pepe.setHunger(pepe.getHunger() + 5);
        pepe.setThirst(pepe.getThirst() + 35);
    }

    public void doMiscGoodTask(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() + 5);
        pepe.setHunger(pepe.getHunger() - 5);
        pepe.setThirst(pepe.getThirst() - 5);
    }

    public void doMiscbadTask(Pepe pepe) {
        pepe.setHappiness(pepe.getHappiness() + 5);
        pepe.setHunger(pepe.getHunger() - 5);
        pepe.setThirst(pepe.getThirst() - 5);
    }
}
