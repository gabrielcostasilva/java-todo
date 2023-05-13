# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

**This branch adds infrastructure as code (IaC) and CI features**.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
This branch adds two new files:

- [`infra.yaml`](./infra.yaml) describes the required AWS infrastructure for the project. The file uses the YAML language and the AWS CloudFormation syntax for describing a virtual machine, MySQL database, security group, and access permissions.

- [`buildspec.yml`](./buildspec.yml) describes the build phase for this project as required by AWS CodeBuild service.
