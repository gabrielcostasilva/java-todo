package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class TodoController {

    private TodoRepository todos;

    @GetMapping("/")
    public String getTodos(Model memory) {
        memory.addAttribute("todos", todos.findAll());

        return "/todo";
    }

    @PostMapping("/add") 
    public String createTodo(Todo aTodo) {
        todos.save(aTodo);

        return "redirect:/";
    }

    @GetMapping("/remove")
    public String deleteTodo(@RequestParam String id) {
        todos.deleteById(id);

        return "redirect:/";
    }

    @GetMapping("/update")
    public String updateTodo(@RequestParam String id) {
        var foundTodo = todos.findById(id);
        
        if (foundTodo.isPresent()) {
            var aTodo = foundTodo.get();
            aTodo.setStatus(!aTodo.isStatus());
            todos.save(aTodo);
        }

        return "redirect:/";
    }
}
