package com.amigoscode.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

// TODO: 9 - Add @RequestMapping("/api/v1/orders") at the class level
//  Then simplify all endpoint paths below (remove "/api/v1/orders" prefix)
@RestController
public class OrderController {

    // TODO: 13 - Inject OrderService via constructor injection
    //  (replace direct data access with service calls)

    // DONE: 1 - Create a GET endpoint mapped to "/api/v1/orders/welcome"
    //  that returns the string "Welcome to the Orders API"
    @GetMapping("/api/v1/orders/welcome")
    public String welcome() {

        return "Welcome to the Orders API";
    }

    // DONE: 2 - Create a GET endpoint mapped to "/api/v1/orders/sample"
    //  that returns a single hardcoded Order object
    //  Hint: new Order(1L, "Laptop", "PENDING", 999.99, "john@mail.com", LocalDate.now(), "rush")
    @GetMapping("/api/v1/orders/sample")
    public Order sample() {

        Order sample = new Order(
                1L,
                "Laptop",
                "PENDING",
                999.99,
                "john@mail.com",
                LocalDate.now(), "rush");

        return sample;
    }

    // DONE: 3 - Create a GET endpoint mapped to "/api/v1/orders"
    //  that returns a hardcoded List of Order objects
    //  Hint: use List.of(...)
    @GetMapping("/api/v1/orders")
    public List<Order> orders() {

        List ordersList = List.of(
                new Order(
                    1L,
                    "Laptop",
                    "PENDING",
                    999.99,
                    "john@mail.com",
                    LocalDate.now(), "rush"),
                new Order(
                        2L,
                        "Desktop",
                        "PENDING",
                        1599.99,
                        "mary@mail.com",
                        LocalDate.now(), "rush"),
                new Order(
                        3L,
                        "Mouse",
                        "PENDING",
                        29.99,
                        "anna@funmail.org",
                        LocalDate.now(), "rush"),
                new Order(
                        4L,
                        "Keyboard (wireless)",
                        "PENDING",
                        139.99,
                        "harry@mailhost.eu",
                        LocalDate.now(), "rush")
                );

        return ordersList;
    }

    // DONE: 4 - Create a GET endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and returns an Order
    //  For now, return ((a hardcoded Order with the given id
    @GetMapping("/api/v1/orders/{id}")
    public Order getOrderById(@PathVariable Long id) {

        Order order = new Order(
                2L,
                "Desktop",
                "PENDING",
                1599.99,
                "mary@mail.com",
                LocalDate.now(), "rush");

        if (Objects.equals(order.getId(), id)) {

            return order;
        } else {

            return null;
        }
    }

    // TODO: 5 - Create a GET endpoint mapped to "/api/v1/orders/filter"
    //  that takes a @RequestParam(required = false) String status
    //  Return a filtered list if status is provided, otherwise return all

    // TODO: 6 - Create a POST endpoint mapped to "/api/v1/orders"
    //  that takes an Order @RequestBody and returns the saved order

    // TODO: 7 - Create a PUT endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and @RequestBody Order
    //  Set the id on the order and update it

    // TODO: 8 - Create a DELETE endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and deletes the order

    // TODO: 10 - Refactor all endpoints to return ResponseEntity<> with proper status codes:
    //  - GET returns 200 (OK)
    //  - POST returns 201 (Created)
    //  - PUT returns 204 (No Content)
    //  - DELETE returns 204 or 404
    //  Hint: look at CustomerController for reference

}
