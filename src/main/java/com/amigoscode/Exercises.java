package com.amigoscode;

/**
 * Spring Framework - Exercises
 *
 * Follow the TODOs below in order.
 * Each exercise tells you which file to edit.
 *
 * Use IntelliJ's TODO tool window (View > Tool Windows > TODO)
 * to navigate through the exercises.
 */
public class Exercises {

    // TODO: 01 - Annotate GreetingService with @Component
    //  File: greeting/GreetingService.java
    //  Make Spring manage GreetingService as a bean by adding @Component annotation

    // TODO: 02 - Inject GreetingService into GreetingController
    //  File: greeting/GreetingController.java
    //  Add a private final GreetingService field and constructor parameter
    //  Then use it in the greet() method to return greetingService.greet(name)

    // TODO: 03 - Define a String bean and use @Qualifier
    //  File: greeting/GreetingConfig.java
    //  Create a @Bean("greetingMessage") method that returns "Hello"
    //  Then in GreetingService, add @Qualifier("greetingMessage") to the constructor parameter

    // TODO: 04 - Add lifecycle hooks to GreetingService
    //  File: greeting/GreetingService.java
    //  Add a method annotated with @PostConstruct that prints "GreetingService has been initialized"
    //  Add a method annotated with @PreDestroy that prints "GreetingService is being destroyed"

    // TODO: 05 - Use stereotype annotations and wiring
    //  File: user/UserRepository.java and user/UserService.java
    //  Annotate UserRepository with @Repository
    //  Annotate UserService with @Service
    //  Inject UserRepository into UserService via constructor injection
    //  Use the injected repository in getAllUsers() to return userRepository.findAllUsers()

}
