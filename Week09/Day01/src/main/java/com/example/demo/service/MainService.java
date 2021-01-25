package com.example.demo.service;

import com.example.demo.model.*;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public ErrorMessage error(String message){
        return new ErrorMessage(message);
    }

    public DoublingValue doubledInteger(Integer input){
        DoublingValue doublingValue = new DoublingValue();
        doublingValue.setReceived(input);
        doublingValue.setResult(input*2);
        return doublingValue;
    }

    public Greeter getGreetingMessage (String name, String title){
        Greeter greeter = new Greeter();
        greeter.setWelcome_message(name, title);
        return greeter;
    }

    public Appenda appendable (String appendable){
        Appenda appenda = new Appenda();
        appenda.setAppended(appendable);
        return appenda;
    }

    public SumValue sumValueFunc (UntilNumber number){
        SumValue sumValue = new SumValue();
        int one = 1;
        int temp = 0;

        for (int i = 0; i < number.getUntil(); i++) {
            temp+=one;
            one++;
        }
        sumValue.setResult(temp);
        return sumValue;
    }


    public FactorValue factorValueFunc (UntilNumber number){
        FactorValue factorValue = new FactorValue();
        int one = 1;
        int temp = 1;

        for (int i = 0; i < number.getUntil(); i++) {
            temp=temp*one;
            one++;
        }
        factorValue.setResult(temp);
        return factorValue;
    }

}
