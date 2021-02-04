package com.example.demo.repository;

import com.example.demo.model.ExampleClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExampleRepo extends CrudRepository<ExampleClass, Long> {
    List<ExampleClass> findAllByStatus(String status);

}
