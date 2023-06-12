package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kong.unirest.GenericType;
import kong.unirest.Unirest;

@Controller
public class TodoController {

    private final String url = "http://localhost:8080";

    @GetMapping("/")
    public String getTodos(Model memory) {
        Unirest
                .config()
                .defaultBaseUrl(url);

        List<Todo> todos = Unirest
                .get("/")
                .asObject(new GenericType<List<Todo>>() {
                })
                .getBody();

        memory.addAttribute("todos", todos);

        return "/todo";
    }

    @PostMapping("/add")
    public String createTodo(Todo aTodo) {
        Unirest
                .config()
                .defaultBaseUrl(url);

        Unirest
                .post("/add")
                .header("Content-Type", "application/json")
                .body(aTodo)
                .asObject(Todo.class)
                .getBody();

        return "redirect:/";
    }

}
