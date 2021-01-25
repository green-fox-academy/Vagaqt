package com.example.demo.controller;

import com.example.demo.model.UntilNumber;
import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private MainService mainService;


    @GetMapping("/doubling")
    public ResponseEntity<?> doubling(@RequestParam(required = false)Integer input){
        if (input==null){
            return ResponseEntity.ok(mainService.error("Please provide an input!"));
        }
        return ResponseEntity.ok(mainService.doubledInteger(input));
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false)String name,@RequestParam(required = false) String title){
        if (name == null && title == null) {
            return new ResponseEntity(mainService.error("Please provide a name and a title!"), HttpStatus.BAD_REQUEST);
        }
        if (name == null) {
            return new ResponseEntity(mainService.error("Please provide a name!"), HttpStatus.BAD_REQUEST);
        }
        if (title == null) {
            return new ResponseEntity(mainService.error("Please provide a title!"), HttpStatus.BAD_REQUEST);
        }
        return ResponseEntity.ok(mainService.getGreetingMessage(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appenda(@PathVariable String appendable){
      if (appendable == null){
          return new ResponseEntity(HttpStatus.NOT_FOUND);
      }
      return ResponseEntity.ok(mainService.appendable(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody UntilNumber untilNumber){
        if (action.equals("sum")){
            return ResponseEntity.ok(mainService.sumValueFunc(untilNumber));
        }
        if (action.equals("factor")){
            return ResponseEntity.ok(mainService.factorValueFunc(untilNumber));
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


}