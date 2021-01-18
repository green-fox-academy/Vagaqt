package com.example.demo.controller;

import com.example.demo.model.ToDo;
import com.example.demo.repository.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToDoController {
    private ToDoRepo toDoRepo;

    @Autowired
    public ToDoController(ToDoRepo toDoRepo) {
        this.toDoRepo = toDoRepo;
    }

    @GetMapping(value = {"/", "/list"})
    public String list(Model model) {
        model.addAttribute("todoList", getAllTodos());
        return "index";
    }

    @PostMapping("add-todo")
    public String addPizza(@ModelAttribute ToDo toDo) {
        addTodo(toDo);
        return "redirect:/";
    }

    @GetMapping("/todo")
    public String todo(Model model) {
        return "redirect:/";
    }

    @GetMapping("delete-todo/{id}")
    public String deleteTodoPathVariable(@PathVariable Long id) {
        deleteTodo(id);
        return "redirect:/";
    }

    @GetMapping("edit-todo/{id}")
    public String editTodoPathVariable(@PathVariable Long id, Model model) {
        model.addAttribute("todo", toDoRepo.findById(id).orElse(null));
        return "edit";
    }

    @PostMapping("edit-todo/{id}")
    public String editTodoPathVariablePost(@PathVariable Long id, String title, Boolean urgent, Boolean done, Model model) {
        if (urgent == null) {
            urgent = false;
        }
        if (done == null) {
            done = false;
        }
        editTodo(id, title, urgent, done);
        model.addAttribute("todoList", getAllTodos());
        return "redirect:/";
    }


    public List<ToDo> getAllTodos() {
        return (List<ToDo>) toDoRepo.findAll();
    }

    public void addTodo(ToDo toDo) {
        toDoRepo.save(toDo);
    }

    public void deleteTodo(Long id) {
        toDoRepo.deleteById(id);
    }

    public void editTodo(Long id, String title, Boolean urgent, Boolean done) {
        toDoRepo.save(new ToDo(id, title, urgent, done));
    }

}
