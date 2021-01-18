package com.example.demo.controller;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ToDoController {
    private ToDoRepo toDoRepo;

    @Autowired
    public ToDoController(ToDoRepo toDoRepo){
        this.toDoRepo = toDoRepo;
    }

    @GetMapping(value = { "/","/list" })
    public String list(Model model){
        model.addAttribute("todoList", getAllTodos());
        return "index";
    }

    @PostMapping("add-todo")
    public String addPizza(@ModelAttribute ToDo toDo){
        addTodo(toDo);
        return "redirect:/";
    }

    @GetMapping("/todo")
    public String todo(Model model){
        return "redirect:/";
    }


    public List<ToDo> getAllTodos(){
        return (List<ToDo>) toDoRepo.findAll();
    }

    public void addTodo (ToDo toDo){
        toDoRepo.save(toDo);
    }

}
