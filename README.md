# simple maven web app | hello-devops

This is a simple Maven-based web application that demonstrates how to create and serve multiple pages using servlets. It includes three servlets, each serving different content, along with a RESTful API that returns data in JSON format.


## Prerequisites

Make sure you have the following installed:

- **Java 8+**
- **Apache Maven**
- **An IDE (optional)** such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

## Setup

1. Clone this repository to your local machine:

   ```bash
   git clone https://github.com/srtimsina/hello-devops.git
   cd hello-devops
   ```

2. Build the project using Maven:

    ```bash
    mvn clean package
    ```
    This will compile the code and generate a `hello-devops.war` file in the `target/` directory.

## Running the Application
To run the application, you need to deploy it to a Servlet container, such as Apache Tomcat.

1. **Deploying to Apache Tomcat:**
    - Copy the techaxis-webapp.war file from the target/ folder to your webapps/ directory in Tomcat.
    - Start Tomcat by running the bin/startup.sh script (on Linux/Mac) or bin/startup.bat (on Windows).

2. **Access the application:** Open a browser and go to the following URL:

    ```bash
    http://localhost:8080/hello-devops/
    ```

## Features
1. **Hello Servlet**: Displays a simple "Hello DevOps" message.

    - Access it by visiting: http://localhost:8080/hello-devops/hello
2. **Another Page Servlet**: Displays another page with a different message.

    - Access it by visiting: http://localhost:8080/hello-devops/anotherPage
3. **API Servlet**: Provides a JSON response with a message.

    - Access it by visiting: http://localhost:8080/hello-devops/api/data

## Running Unit Tests
This project includes unit tests for each servlet. To run the tests, use the following Maven command:
   ```bash
   mvn test
   ```
This will run all the JUnit tests, which include tests for the `HelloServlet`, `AnotherPageServlet`, and `ApiServlet`.

## Dependencies
- **Jakarta Servlet API**: Required for servlet-based development.
- **JUnit 5**: Used for unit testing.
- **Mockito**: Used for mocking HTTP request and response objects.
- **Gson**: Used to convert Java objects to JSON format.