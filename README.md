![Java CI](https://github.com/batspike/ci-cd-process-maven/workflows/Java%20CI/badge.svg?branch=master)
[![codecov](https://codecov.io/github/batspike/ci-cd-process-maven/coverage.svg?branch=master)](https://codecov.io/github/batspike/ci-cd-process-maven?branch=master)

# ci-cd-process-maven
## A Spring Boot project to demonstrate CI/CD process with Dockerizing of the application.
This project make use of GitHub action and workflow to perform CI/CD operation. 
The .github/workflows/my-workflow.yml is used to trigger CI. It is triggered on each push to the master branch.
This workflow will compile, test, and package the codes using maven build system. Upon successful build
and test, maven will package the app into a executable jar. This is then build into a Docker Image and publish
in DockerHub as batspike/ci-cd-process-maven.

To run the docker image,
    docker run -dp 8080:8080 batspike/ci-cd-process-maven:latest

Technology used:
1. Spring Boot
2. Maven Build System
2. GitHub Action & Workflow
3. CodeCov
4. DockerHub
