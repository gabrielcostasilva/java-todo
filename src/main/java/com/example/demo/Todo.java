package com.example.demo;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Todo implements Serializable {

    private String task;
    private boolean status;

    public Todo(String task, boolean status) {
        this();

        this.task = task;
        this.status = status;
    }
}
