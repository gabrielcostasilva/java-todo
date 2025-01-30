package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@PostConstruct
	public void init() {
		TodoController controller = new TodoController();
		controller.createTodo(new Todo("Lavar louça", false));
		controller.createTodo(new Todo("Escovar dentes", true));
		controller.createTodo(new Todo("Almoçar", false));

		controller.getTodos().forEach(todo -> System.out.println(todo.getTask()));
	}

}
