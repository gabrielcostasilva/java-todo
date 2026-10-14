# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

> [!NOTE]
> This branch automates the CI process using Github Actions. Two independent workflows show how to publish a (i) [Jar with Maven](/.github/worflows/build-publish.yaml), and (ii) [Docker container](/.github/workflows/docker-ci.yaml) in Github registry.

> If you want to understand the underlying application, please check out the [main branch](https://github.com/gabrielcostasilva/java-todo.git).

## Project Overview
This branch adds two new files, representing the workflows. Both can be found in [`/.github/workflows`](/.github/workflows) folder.

> [!IMPORTANT]
> Both workflows are set to run manually. Therefore, to run the actions you should turn this branch into the main using the repo `Settings`.
