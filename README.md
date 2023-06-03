# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch adds a very simple end-to-end test with Selenide**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
[Selenide](https://selenide.org) is an abstraction layer on top of [Selenium](https://www.selenium.dev) - a well-known browser automation tool for testing purposes. As result, Selenide simplifies the task of creating end-to-end (E2E) tests. [E2E testing](https://martinfowler.com/articles/practical-test-pyramid.html) is a test type that aims checking the entire application stack, starting from the UI.

This branch introduces three changes from the main branch:
- Adds Selenide dependency, and update Spring Boot to version 3.1.0 (previous version presented problems with Selenide);
- Adds ID for the _add_ button on the UI; and
- Creates an E2E test.