package com.example.demo;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class Todo implements Serializable {

    private String id;
    private String task;
    private boolean status;

    public Todo() {
        this.id = UUID.randomUUID().toString();
    }

    public Todo(String task, boolean status) {
        this();

        this.task = task;
        this.status = status;
    }
}
