package com.example.demo.controller;

import com.example.demo.model.ErrorMessage;
import com.example.demo.model.GuardianMessage;
import com.example.demo.model.YondusArrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.GuardianService;

@RestController
public class GuardianController {
    private GuardianService guardianService;

    @Autowired
    public GuardianController(GuardianService guardianService) {
        this.guardianService = guardianService;
    }

    @GetMapping("/groot")
    public ResponseEntity<?> whatever(@RequestParam(required = false) String message){
        if (message==null){
            return new ResponseEntity(guardianService.error("I am Groot!"), HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(new GuardianMessage(message));
    }

    @GetMapping("/yondu")
    public ResponseEntity<?> yonduCalc(@RequestParam(required = false) Double distance, Double time){
        Double nullDouble = null;
        if (distance == nullDouble || time == nullDouble){
            return new ResponseEntity(guardianService.error("Please provide values"), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(new YondusArrow(distance,time));
    }
}
