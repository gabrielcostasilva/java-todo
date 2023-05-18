# MONOLITHIC JAVA WEB TO-DO APP - BEANSTALK CONTAINER DEPLOYMENT
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch sets specific configuration for deploying the project using the Amazon Beanstalk console**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
This project:
- Changes the Spring Boot default port to 5000, which is the [Amazon Beanstalk](https://aws.amazon.com/elasticbeanstalk/) default port for exposing applications;
- Changes the [`Dockerfile`](./Dockerfile) for exposing the port 5000;
- Adds [`java-todo.zip`](./java-todo.zip) file for deployment convenience (instead of creating your own zip file);
- Adds the [`.mvn`](./mvn) folder, necessary for building a Docker image.