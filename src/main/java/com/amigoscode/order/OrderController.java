package com.amigoscode.order;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// DONE: 9 - Add @RequestMapping("/api/v1/orders") at the class level
//  Then simplify all endpoint paths below (remove "/api/v1/orders" prefix)
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    // create temporary a dummy ordersList
    private final List<Order> ordersList = new ArrayList<>(List.of(
            new Order(
                    1L,
                    "Laptop",
                    "PENDING",
                    999.99,
                    "john@mail.com",
                    LocalDate.now(),
                    "rush"),
            new Order(
                    2L,
                    "Desktop",
                    "MANUAL_REVIEW",
                    1599.99,
                    "mary@mail.com",
                    LocalDate.now(),
                    "rush"),
            new Order(
                    3L,
                    "Mouse",
                    "MANUAL_REVIEW",
                    29.99,
                    "anna@funmail.org",
                    LocalDate.now(),
                    "rush"),
            new Order(
                    4L,
                    "Keyboard (wireless)",
                    "PENDING",
                    139.99,
                    "harry@mailhost.eu",
                    LocalDate.now(),
                    "rush")
    ));

    // TODO: 13 - Inject OrderService via constructor injection
    //  (replace direct data access with service calls)

    // DONE: 1 - Create a GET endpoint mapped to "/api/v1/orders/welcome"
    //  that returns the string "Welcome to the Orders API"
    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome to the Orders API";
    }

    // DONE: 2 - Create a GET endpoint mapped to "/api/v1/orders/sample"
    //  that returns a single hardcoded Order object
    //  Hint: new Order(1L, "Laptop", "PENDING", 999.99, "john@mail.com", LocalDate.now(), "rush")
    @GetMapping("/sample")
    public Order sample() {

        Order sample = new Order(
                1L,
                "Laptop",
                "PENDING",
                999.99,
                "john@mail.com",
                LocalDate.now(),
                "rush");

        return sample;
    }

    // DONE: 3 - Create a GET endpoint mapped to "/api/v1/orders"
    //  that returns a hardcoded List of Order objects
    //  Hint: use List.of(...)
    @GetMapping()
    public List<Order> orders() {

        return ordersList;
    }

    // DONE: 4 - Create a GET endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and returns an Order
    //  For now, return ((a hardcoded Order with the given id
    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {

        Order order = new Order(
                2L,
                "Desktop",
                "PENDING",
                1599.99,
                "mary@mail.com",
                LocalDate.now(),
                "rush");

        if (Objects.equals(order.getId(), id)) {

            return order;
        } else {

            return null;
        }
    }

    // DONE: 5 - Create a GET endpoint mapped to "/api/v1/orders/filter"
    //  that takes a @RequestParam(required = false) String status
    //  Return a filtered list if status is provided, otherwise return all
    @GetMapping("/filter")
    public List<Order> getOrdersByStatus(
            @RequestParam(required = false) String status) {

        if (status != null) {
            return ordersList.stream()
                    .filter(o -> o.getStatus().equalsIgnoreCase(status))
                    .toList();
        }

        return ordersList;
    }

    // DONE: 6 - Create a POST endpoint mapped to "/api/v1/orders"
    //  that takes an Order @RequestBody and returns the saved order
    @PostMapping()
    public Order createOrder(
            @RequestBody Order order) {

        ordersList.add(order);

        return order;
    }

    // DONE: 7 - Create a PUT endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and @RequestBody Order
    //  Set the id on the order and update it
    @PutMapping("/{id}")
    public void updateOrder(
            @PathVariable Long id,
            @RequestBody Order updateOrder
    ) {

        for (int i = 0; i < ordersList.size(); i++) {
            if (ordersList.get(i).getId().equals(id)) {
                updateOrder.setId(id); // ensure ID is set
                ordersList.set(i, updateOrder); // update at index
                return;
            }
        }
    }

    // DONE: 8 - Create a DELETE endpoint mapped to "/api/v1/orders/{id}"
    //  that takes a @PathVariable Long id and deletes the order
    @DeleteMapping("/{id}")
    public void deleteOrder(
            @PathVariable Long id
    ) {

        ordersList.removeIf(order -> order.getId() == id);
    }


    // TODO: 10 - Refactor all endpoints to return ResponseEntity<> with proper status codes:
    //  - GET returns 200 (OK)
    //  - POST returns 201 (Created)
    //  - PUT returns 204 (No Content)
    //  - DELETE returns 204 or 404
    //  Hint: look at CustomerController for reference
}
