# Amigoscode Spring Boot Exercises

Guided hands-on exercises for the Spring Boot learning path on
[Amigoscode Academy](https://skool.com/amigoscode).

## Tech Stack

- Java 25
- Spring Boot 4
- H2 In-Memory Database
- Maven

## Courses

This repository contains exercises for the following courses:

| Branch | Course | TODOs |
|--------|--------|-------|
| `spring-framework-exercises` | Spring Framework | 5 |
| `spring-boot-exercises` | Spring Boot | 6 |
| `spring-data-jpa-exercises` | Spring Data JPA | 25 |
| `building-apis-with-spring-boot-exercises` | Building APIs with Spring Boot | 20 |
| `advanced-spring-boot-exercises` | Advanced Spring Boot | 20 |

Each course has a matching `-solutions` branch with completed code.

## How to Use

1. Pick a course and checkout the exercises branch:
   ```bash
   git checkout spring-boot-exercises
   ```
2. Open the project in IntelliJ IDEA
3. Open the TODO tool window: **View > Tool Windows > TODO**
4. Follow the TODOs in order - each one builds on the previous
5. Stuck? Check the solutions branch:
   ```bash
   git checkout spring-boot-solutions
   ```

## How TODOs Work

Every exercise is marked with a numbered TODO comment:

```java
// TODO: 1 - Create a GET endpoint mapped to "/api/v1/books"
//  that returns all books from the database
```

IntelliJ will list all TODOs in order so you can work through them step by step.

## Prerequisites

Each course builds on the previous. We recommend this order:

1. Spring Framework
2. Spring Boot
3. Spring Data JPA
4. Building APIs with Spring Boot
5. Advanced Spring Boot

## Community

Join the [Amigoscode Academy](https://skool.com/amigoscode) to get help,
share your progress, and connect with other learners.
