package com.amigoscode.order;

import org.springframework.web.bind.annotation.RestController;

// Exercise: 9 - Add @RequestMapping("/api/v1/orders") at the class level
//  Then simplify all endpoint paths below (remove "/api/v1/orders" prefix)
@RestController
public class OrderController {

    // Exercise: 13 - Inject OrderService via constructor injection
    //  (replace direct data access with service calls)

    // Exercise: 1 - Create a GET endpoint mapped to "/api/v1/orders/welcome"
    //  that returns the string "Welcome to the Orders API"

    // Exercise: 2 - Create a GET endpoint mapped to "/api/v1/orders/sample"
    //  that returns a single hardcoded Order object
    //  Hint: new Order(1L, "Laptop", "PENDING", 999.99, "john@mail.com", LocalDate.now(), "rush")

    // Exercise: 3 - Create a GET endpoint mapped to "/api/v1/orders"
    //  that returns a hardcoded List of Order objects
    //  Hint: use List.of(...)

    // Exercise: 4 - Create a GET endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and returns an Order
    //  For now, return a hardcoded Order with the given id

    // Exercise: 5 - Create a GET endpoint mapped to "/api/v1/orders/filter"
    //  that takes a @RequestParam(required = false) String status
    //  Return a filtered list if status is provided, otherwise return all

    // Exercise: 6 - Create a POST endpoint mapped to "/api/v1/orders"
    //  that takes an Order @RequestBody and returns the saved order

    // Exercise: 7 - Create a PUT endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and @RequestBody Order
    //  Set the id on the order and update it

    // Exercise: 8 - Create a DELETE endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and deletes the order

    // Exercise: 10 - Refactor all endpoints to return ResponseEntity<> with proper status codes:
    //  - GET returns 200 (OK)
    //  - POST returns 201 (Created)
    //  - PUT returns 204 (No Content)
    //  - DELETE returns 204 or 404
    //  Hint: look at CustomerController for reference

}
