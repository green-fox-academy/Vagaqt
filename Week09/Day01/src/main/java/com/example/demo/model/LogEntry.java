package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Timestamp createdAt;
    private String endpoint;
    private String data;

    public LogEntry(){
        Date date = new Date();
        this.createdAt = new Timestamp(date.getTime());
    }

    public LogEntry(String endpoint, String data) {
        Date date = new Date();
        this.createdAt = new Timestamp(date.getTime());
        this.endpoint = endpoint;
        this.data = data;
    }
}
