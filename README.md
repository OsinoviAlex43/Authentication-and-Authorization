# Spring Security Authentication & Authorization 🚀

A Spring Boot application showcasing secure user authentication and role-based authorization using Spring Security. This project provides a REST API to manage applications and users, with endpoints protected by `ROLE_USER` and `ROLE_ADMIN` roles.

## 📋 Table of Contents
- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Setup](#setup)



## 🌟 Features
- 🔐 **Secure Authentication**: Login with username and password using Spring Security.
- 🛡️ **Role-Based Access**: Restrict API access based on user roles (`ROLE_USER`, `ROLE_ADMIN`).
- 📡 **REST API**: Manage applications and register users.
- 🔒 **Password Encryption**: Securely hash passwords with BCrypt.
- 📊 **Fake Data**: Generate sample application data using JavaFaker.
- 🗄️ **JPA Integration**: Persist user data with Spring Data JPA.

## 🛠️ Technologies
- **Spring Boot**: Core framework for the application.
- **Spring Security**: Authentication and authorization.
- **Spring Data JPA**: Database operations.
- **H2 Database**: In-memory database for development.
- **JavaFaker**: Fake data generation.
- **Maven**: Build and dependency management.

## 📦 Prerequisites
- Java 17 or higher
- Maven 3.6+
- IDE (e.g., IntelliJ IDEA, Eclipse)
- (Optional) MySQL/PostgreSQL for production
## ⚙️ Setup
```Clone the Repository
git clone https://github.com/your-username/spring-security-authentication-authorization.git
cd spring-security-authentication-authorization
```


# Configure the Database
Uses H2 in-memory database by default.
For PostgreSQL, 
update src/main/resources/application.properties:
```
spring.datasource.url=jdbc:postgres://localhost:5432/your_database 
spring.datasource.username=your_username 
spring.datasource.password=your_password 
spring.jpa.hibernate.ddl-auto=update
```


# Build the Project
```
mvn clean install
Run the Application
mvn spring-boot:run
The app runs on http://localhost:8080.
```
