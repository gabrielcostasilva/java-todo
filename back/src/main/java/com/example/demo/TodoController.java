package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private final TodoRepository repository;

    @GetMapping("/")
    public ResponseEntity<List<Todo>> getTodos(Model memory) {
        return ResponseEntity.ok(repository.findAll());

    }

    @PostMapping("/add") 
    public ResponseEntity<Todo> createTodo(@RequestBody Todo aTodo) {
        return ResponseEntity.ok(repository.save(aTodo));

    }

    @GetMapping("/remove/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable int id) {
        repository.deleteById(Long.parseLong(id+""));

        return ResponseEntity.ok(null);
    }

    @GetMapping("/update/{id}")
    public ResponseEntity<Void> updateTodo(@PathVariable int id) {
        repository.findById(Long.parseLong(id + "")).ifPresent(todo -> todo.setStatus(true));
        repository.flush();

        return ResponseEntity.ok(null);
    }
}
