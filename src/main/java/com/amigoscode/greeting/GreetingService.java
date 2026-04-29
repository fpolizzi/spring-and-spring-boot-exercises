package com.amigoscode.greeting;

// DONE: 01 - Add @Component annotation to this class so Spring manages it as a bean

// DONE: 03 - Add @Qualifier("greetingMessage") to the constructor parameter

// DONE: 04 - Add @PostConstruct and @PreDestroy lifecycle hooks

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {

    private final String greeting;

    public GreetingService(@Qualifier("greetingMessage") String greeting) {
        this.greeting = greeting;
    }

    public String greet(String name) {
        return greeting + ", " + name + "!";
    }

    @PostConstruct
    public void init() {

        System.out.println("Initializing GreetingService");
    }

    @PreDestroy
    public void destroy() {

        System.out.println("Destroying GreetingService");
    }
}
