# MONOLITHIC JAVA WEB TO-DO APP - CLIENT-SERVER ARCHITECTURE
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch breaks down the application into a client-server architecture**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
The original project is a monolithic architecture. A monolithic _deployment_ architecture means that the whole application is packed as a single deployment file. Thus, UI and application logic are in the same project.

A client-server _deployment_ architecture means the application is broken down into two parts. This project breaks down the application into front- and back-end. Therefore, the UI and application logic are in two different projects.

We use REST to enable UI and application logic communication.

Changes from the original project can be summarised as follows:
- Created two projects for front- and back-end;
- Deleted UI code from the back-end project;
- Deleted application logic code from the front-end project;
- Transformed MVC controllers into REST controllers for the back-end project;
- Changed the server port for the front-end project to prevent conflict with the back-end project when both are run on the same computer;
- Added REST client library to the front-end project;
- Added REST client code to enable communication between front- and back-end projects. 

## Running the project
Start the back-end project (`cd back && mvn spring-boot:run`), then start the front-end project (`cd front && mvn spring-boot:run`).