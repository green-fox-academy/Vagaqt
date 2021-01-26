package com.example.demo.repository;

import com.example.demo.model.LogEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogEntryRepo extends CrudRepository<LogEntry, Long> {
}
