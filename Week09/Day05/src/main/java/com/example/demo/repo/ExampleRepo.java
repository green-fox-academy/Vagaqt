package com.example.demo.repo;

import com.example.demo.model.ExampleLink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepo extends CrudRepository<ExampleLink, Long> {
}
