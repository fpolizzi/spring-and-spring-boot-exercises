# Building APIs with Spring Boot - Exercises

Hands-on exercises for the **Building APIs with Spring Boot** course on
[Amigoscode Academy](https://skool.com/amigoscode).

## What You'll Practice

- Building REST endpoints with Spring MVC
- Path variables, query parameters, and request bodies
- ResponseEntity and HTTP status codes
- N-Tier architecture (Controller > Service > Repository)
- JSON serialization with Jackson
- Filters and functional endpoints
- Embedded web server configuration

## Reference Code

The `Customer` domain (`CustomerController`, `CustomerService`, `CustomerRepository`)
is fully implemented as a working reference. Use it as a guide when building the
`Order` domain.

## Exercises (20 TODOs)

| # | Topic |
|---|-------|
| 1 | First endpoint |
| 2 | Return an object |
| 3 | Return a list |
| 4 | `@PathVariable` |
| 5 | `@RequestParam` |
| 6 | `@PostMapping` |
| 7 | `@PutMapping` |
| 8 | `@DeleteMapping` |
| 9 | `@RequestMapping` at class level |
| 10 | `ResponseEntity` |
| 11 | Service layer |
| 12 | Repository layer |
| 13 | Wire layers with constructor injection |
| 14 | `@JsonProperty` |
| 15 | `@JsonIgnore` |
| 16 | Custom serialization |
| 17 | Logging filter |
| 18 | Functional endpoint |
| 19 | Change embedded server |
| 20 | Configure server properties |

## Getting Started

1. Open the project in IntelliJ IDEA
2. Open the TODO tool window: **View > Tool Windows > TODO**
3. Start at TODO 1 and work your way through

## Solutions

```bash
git checkout building-apis-with-spring-boot-solutions
```

## Community

Join the [Amigoscode Academy](https://skool.com/amigoscode) to get help
and share your progress.
