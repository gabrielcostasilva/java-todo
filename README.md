# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch containerises the application with Docker**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
This branch adds a new file:

- [`Dockerfile`](./Dockerfile) describes the process for containerising the application.

> The easiest way to create Docker images with Spring Boot is running `mvn spring-boot:build-image`. Then you can run the container like so: `docker run -d -p 8080:8080 docker.io/library/todo:0.0.1-SNAPSHOT`. But remember Docker Desktop must be installed and running!
