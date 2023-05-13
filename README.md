# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch sets the application infrastructure using containers**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
This branch adds a new file:

- [`docker-compose.yaml`](./docker-compose.yaml) describes the infrastructure required for this application. In particular, it starts two containers: one for the application, and another one for the database.
