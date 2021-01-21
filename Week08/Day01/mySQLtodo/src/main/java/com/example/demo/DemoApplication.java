package com.example.demo;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private ToDoRepo toDoRepo;

    @Autowired
    public DemoApplication(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
