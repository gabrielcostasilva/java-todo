# MONOLITHIC JAVA WEB TO-DO APP
This project introduces a web To-Do app that allows adding, removing, and marking tasks as completed. 

We use this project in the [online certification Java program](http://pos-graduacao-ead.cp.utfpr.edu.br/java/), for the module I teach on Java for Web applications.

## Project Overview
This project is identitical to the persistence project, but with all changes required for using MongoDB.

These are the steps to add MongoDB onto the project:
1. [Add MongoDB dependency](https://github.com/gabrielcostasilva/java-todo/commit/ea7b767bc8783b399a0e8e35eaab52b484c20df7)
2. [Create ID representation](https://github.com/gabrielcostasilva/java-todo/commit/3cb215b8088afb80f281cb132f3d2b8299297221)
3. [Create persistence layer](https://github.com/gabrielcostasilva/java-todo/commit/f34e3c18458c34bfa163f3da73ecc9bfa74e5bf4)
4. [Update existing controller](https://github.com/gabrielcostasilva/java-todo/commit/cbb03de2815eed5b15b4370f97620bc7002828d3)
5. [Update existing view](https://github.com/gabrielcostasilva/java-todo/commit/1e9be14133644747291f7e19b6d27ec23253d226)

> To running this project, you need to get MongoDB running first. You can use docker with: `docker run -d -p 27017:27017 mongo`