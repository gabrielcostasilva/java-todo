package com.example.demo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Todo implements Serializable {

    private Long id;

    private String task;
    private boolean status;

    public Todo(String task, boolean status) {
        this();

        this.task = task;
        this.status = status;
    }
}
