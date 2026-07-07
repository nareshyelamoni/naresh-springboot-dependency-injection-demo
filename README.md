# Spring Boot Dependency Injection Demo

## Overview

This project demonstrates Dependency Injection (DI) in Spring Boot using different injection techniques and bean selection mechanisms.

The application simulates an Amazon delivery service where different delivery partners implement a common interface. Spring injects the required implementation using annotations such as `@Autowired`, `@Primary`, and `@Qualifier`.

## Technologies Used

* Java
* Spring Boot
* Spring Core
* Maven
* Eclipse IDE

## Concepts Covered

* Spring IoC (Inversion of Control)
* Dependency Injection
* Constructor Injection
* Setter Injection
* `@Autowired`
* `@Primary`
* `@Qualifier`
* `@Service`
* Interface-based Programming
* Loose Coupling

## Project Structure

```text
src
 └── main
      └── java
           └── com.telusko
                ├── SpringBootDemo2Application.java
                └── service
                     ├── Amazon.java
                     ├── IDelivery.java
                     ├── FedEx.java
                     └── FirstFlight.java
```

## Working

1. Spring Boot starts the IoC container.
2. Spring creates all beans annotated with `@Service`.
3. The `Amazon` class depends on the `IDelivery` interface.
4. Constructor Injection initially injects the bean marked with `@Primary`.
5. Setter Injection with `@Qualifier` replaces the dependency with the specified bean.
6. The `deliverProduct()` method delegates the delivery operation to the selected implementation.

## Sample Output

```text
FedEx bean created...
FirstFlight bean created...
Amazon constructor executed..
Amazon deliverProduct method executed..
product delivered with FedEx and amount paid is 8589.65
product deliver successfully
```

## Learning Outcomes

* Understand how Spring manages beans.
* Learn constructor and setter dependency injection.
* Understand the purpose of `@Autowired`.
* Learn how `@Primary` resolves multiple bean conflicts.
* Learn how `@Qualifier` explicitly selects a bean.
* Understand loose coupling using interfaces.

## Author

**Naresh Yelamoni**
