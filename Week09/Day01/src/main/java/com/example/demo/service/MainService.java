package com.example.demo.service;

import com.example.demo.model.*;
import com.example.demo.repository.LogEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private LogEntryRepo logEntryRepo;

    @Autowired
    public MainService(LogEntryRepo logEntryRepo) {
        this.logEntryRepo = logEntryRepo;
    }

    public ErrorMessage error(String message) {
        return new ErrorMessage(message);
    }

    public DoublingValue doubledInteger(Integer input) {
        DoublingValue doublingValue = new DoublingValue();
        doublingValue.setReceived(input);
        doublingValue.setResult(input * 2);
        return doublingValue;
    }

    public Greeter getGreetingMessage(String name, String title) {
        Greeter greeter = new Greeter();
        greeter.setWelcome_message(name, title);
        return greeter;
    }

    public Appenda appendable(String appendable) {
        Appenda appenda = new Appenda();
        appenda.setAppended(appendable);
        return appenda;
    }

    public SumValue sumValueFunc(UntilNumber number) {
        SumValue sumValue = new SumValue();
        int one = 1;
        int temp = 0;

        for (int i = 0; i < number.getUntil(); i++) {
            temp += one;
            one++;
        }
        sumValue.setResult(temp);
        return sumValue;
    }


    public FactorValue factorValueFunc(UntilNumber number) {
        FactorValue factorValue = new FactorValue();
        int one = 1;
        int temp = 1;

        for (int i = 0; i < number.getUntil(); i++) {
            temp = temp * one;
            one++;
        }
        factorValue.setResult(temp);
        return factorValue;
    }

    public ArrayHandler arrayHandlerSum(ArrayNumbers arrayNumbers) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int temp = 0;
        for (int i = 0; i < arrayNumbers.getNumbers().length; i++) {
            temp = temp + arrayNumbers.getNumbers()[i];
        }
        arrayHandler.setResult(temp);
        return arrayHandler;
    }

    public ArrayHandler arrayHandlerMultiply(ArrayNumbers arrayNumbers) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int temp = 1;
        for (int i = 0; i < arrayNumbers.getNumbers().length; i++) {
            temp = temp * arrayNumbers.getNumbers()[i];
        }
        arrayHandler.setResult(temp);
        return arrayHandler;
    }

    public ArrayHandlerResultArray arrayHandlerDouble(ArrayNumbers arrayNumbers) {
        ArrayHandlerResultArray arrayHandlerResultArray = new ArrayHandlerResultArray();
        int[] temp = new int[arrayNumbers.getNumbers().length];
        int tempNumber = 0;
        for (int i = 0; i < arrayNumbers.getNumbers().length; i++) {
            tempNumber = arrayNumbers.getNumbers()[i];
            temp[i] = tempNumber * 2;
        }
        arrayHandlerResultArray.setResult(temp);
        return arrayHandlerResultArray;
    }

    public void addLogEntry(LogEntry logEntry) {
        logEntryRepo.save(logEntry);

    }

    public Log getAllLogEntries() {
        Log log = new Log();
        log.setEntries((List<LogEntry>) logEntryRepo.findAll());
        log.setEntryCount(log.getEntries().size());
        return log;
    }


}
