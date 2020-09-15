![Java CI](https://github.com/batspike/ci-cd-process-maven/workflows/Java%20CI/badge.svg?branch=master)
[![codecov](https://codecov.io/github/batspike/ci-cd-process-maven/coverage.svg?branch=master)](https://codecov.io/github/batspike/ci-cd-process-maven?branch=master)

# ci-cd-process-maven
## A Spring Boot project to demonstrate CI/CD process with Dockerizing of the application.
This project make use of GitHub action and workflow to perform CI/CD operation. 
The .github/workflows/my-workflow.yml is used to trigger CI. It is triggered on each push to the master branch.
This workflow will compile, test, and package the codes using maven build system. Upon successful build
and test, maven will package the app into a executable jar. This is then build into a Docker Image and publish
in DockerHub as batspike/ci-cd-process-maven.

To run the docker image,<br>
    <p>docker run -dp 8080:8080 batspike/ci-cd-process-maven:latest</p>

<br>
<p>
Another workflow, env-variable-workflow.yml is created to demonstrate how to use GitHub API to start the
workflow remotely. The workflow is triggered on workflow_dispatch event which is initiated via a http
POST call to GitHub API,<br>
https://api.github.com/repos/batspike/ci-cd-process-maven/actions/workflows/env-variable-workflow.yml/dispatches
</p>

Technology used:
1. Spring Boot
2. Maven Build System
2. GitHub Action & Workflow
3. CodeCov
4. DockerHub
