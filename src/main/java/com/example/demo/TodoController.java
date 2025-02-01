package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoController {

    private List<Todo> todos;

    public TodoController() {
        todos = new ArrayList<>();
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public Todo createTodo(Todo aTodo) {
        todos.add(aTodo);

        return aTodo;
    }

    public void deleteTodo(String id) {
        todos.removeIf(item -> item.getId().equals(id));
    }

    public Optional<Todo> updateTodo(String id) {
        Optional<Todo> aTodo = todos.stream().filter(item -> item.getId().equals(id)).findFirst();

        aTodo.ifPresent(todo -> todo.setStatus(!todo.isStatus()));

        return aTodo;
    }
}
