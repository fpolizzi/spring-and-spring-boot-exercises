package com.amigoscode;

/**
 * Building APIs with Spring Boot - Exercises
 *
 * Follow the TODOs below in order.
 * Each exercise tells you which file to edit.
 *
 * The Customer domain (customer/) is fully implemented as a working reference.
 * Use it as a guide when building the Order domain.
 *
 * Use IntelliJ's TODO tool window (View > Tool Windows > TODO)
 * to navigate through the exercises.
 */
public class Exercises {

    // TODO: 01 - Create your first endpoint
    //  File: order/OrderController.java
    //  Add a @GetMapping("/api/v1/orders/welcome") that returns "Welcome to the Orders API"

    // TODO: 02 - Return an object
    //  File: order/OrderController.java
    //  Add a @GetMapping("/api/v1/orders/sample") that returns a hardcoded Order object
    //  Hint: new Order(1L, "Laptop", "PENDING", 999.99, "john@mail.com", LocalDate.now(), "rush")

    // TODO: 03 - Return a list of orders
    //  File: order/OrderController.java
    //  Add a @GetMapping("/api/v1/orders") that returns a hardcoded List<Order>

    // TODO: 04 - Use @PathVariable
    //  File: order/OrderController.java
    //  Add a @GetMapping("/api/v1/orders/{id}") with @PathVariable Long id
    //  Return a hardcoded Order with the given id

    // TODO: 05 - Use @RequestParam
    //  File: order/OrderController.java
    //  Add a @GetMapping("/api/v1/orders/filter") with @RequestParam(required = false) String status
    //  Return filtered orders if status provided, all orders otherwise

    // TODO: 06 - Create a @PostMapping
    //  File: order/OrderController.java
    //  Add a @PostMapping("/api/v1/orders") with @RequestBody Order
    //  Return the received order

    // TODO: 07 - Create a @PutMapping
    //  File: order/OrderController.java
    //  Add a @PutMapping("/api/v1/orders/{id}") with @PathVariable and @RequestBody

    // TODO: 08 - Create a @DeleteMapping
    //  File: order/OrderController.java
    //  Add a @DeleteMapping("/api/v1/orders/{id}") with @PathVariable Long id

    // TODO: 09 - Use @RequestMapping at class level
    //  File: order/OrderController.java
    //  Add @RequestMapping("/api/v1/orders") to the class
    //  Simplify all endpoint paths (remove the "/api/v1/orders" prefix)

    // TODO: 10 - Return ResponseEntity with proper status codes
    //  File: order/OrderController.java
    //  Refactor all endpoints to return ResponseEntity<>
    //  GET -> 200 (OK), POST -> 201 (Created), PUT -> 204 (No Content), DELETE -> 204 or 404
    //  Hint: look at CustomerController for reference

    // TODO: 11 - Create the OrderService
    //  File: order/OrderService.java
    //  Annotate with @Service
    //  Inject OrderRepository via constructor
    //  Add methods: getAllOrders(), getOrderById(), getOrdersByStatus(), createOrder(), updateOrder(), deleteOrder()
    //  Hint: look at CustomerService for reference

    // TODO: 12 - Create the OrderRepository
    //  File: order/OrderRepository.java
    //  Annotate with @Repository
    //  Use an ArrayList<Order> to store orders (initialize with sample data)
    //  Add methods: findAll(), findById(), findByStatus(), save(), update(), deleteById()
    //  Hint: look at CustomerRepository for reference

    // TODO: 13 - Wire layers with constructor injection
    //  File: order/OrderController.java
    //  Replace direct data access with OrderService injection
    //  Update all endpoints to use the service methods

    // TODO: 14 - Use @JsonProperty to rename a field
    //  File: order/Order.java
    //  Add @JsonProperty("order_date") to the orderDate field

    // TODO: 15 - Use @JsonIgnore to hide a field
    //  File: order/Order.java
    //  Add @JsonIgnore to the internalNotes field

    // TODO: 16 - Customize JSON serialization
    //  File: order/Order.java
    //  Add @JsonFormat(pattern = "dd-MM-yyyy") to orderDate
    //  Add @JsonInclude(JsonInclude.Include.NON_NULL) to the class

    // TODO: 17 - Implement a logging filter
    //  File: filter/LoggingFilter.java
    //  Add @Component and implement Filter (jakarta.servlet.Filter)
    //  In doFilter(): log req.getMethod() + req.getRequestURI() before chain.doFilter()
    //  Log res.getStatus() after chain.doFilter()

    // TODO: 18 - Create a functional endpoint
    //  File: config/RouterConfig.java
    //  Add @Configuration
    //  Create a @Bean returning RouterFunction<ServerResponse>
    //  Define GET "/api/v1/orders/summary" returning a Map with totalOrders and pendingOrders

    // TODO: 19 - Change embedded server to Jetty
    //  File: pom.xml
    //  Exclude spring-boot-starter-tomcat from spring-boot-starter-web
    //  Add spring-boot-starter-jetty dependency

    // TODO: 20 - Configure server properties
    //  File: src/main/resources/application.yml
    //  Set server.port to 9090
    //  Set server.servlet.context-path to /amigoscode
    //  Set server.jetty.connection-idle-timeout to 30s

}
