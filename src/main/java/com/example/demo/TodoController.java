package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

    private List<Todo> todos;

    public TodoController() {
        todos = new ArrayList<>();
    }

    @GetMapping("/")
    public String getTodos(Model memory) {
        memory.addAttribute("todos", todos);

        return "/todo";
    }

    @PostMapping("/add") 
    public String createTodo(Todo aTodo) {
        todos.add(aTodo);

        return "redirect:/";
    }

    @GetMapping("/remove")
    public String deleteTodo(@RequestParam String id) {
        todos.removeIf(item -> item.getId().equals(id));

        return "redirect:/";
    }

    @GetMapping("/update")
    public String updateTodo(@RequestParam String id) {
        todos.stream().filter(item -> item.getId().equals(id)).findFirst().ifPresent(todo -> todo.setStatus(!todo.isStatus()));

        return "redirect:/";
    }
}
