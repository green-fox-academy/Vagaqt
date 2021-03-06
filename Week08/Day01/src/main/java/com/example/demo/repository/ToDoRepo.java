package com.example.demo.repository;

import com.example.demo.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoRepo extends CrudRepository<ToDo, Long> {
}
