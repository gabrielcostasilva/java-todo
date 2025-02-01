package com.example.demo;

import java.io.Serializable;
import java.util.UUID;

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

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Id: " + this.getId() + "; Task: " + this.getTask() + "; Status: " + this.isStatus();
    }
}
