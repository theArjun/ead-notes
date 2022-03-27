---
title: Factory Pattern
description: Explains about Factory Pattern
---

- It comes under creational pattern as this pattern provides one of the best ways to create an object.
- We create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## Applicability:
- Use the Factory Pattern when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
- Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
- Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.

## Pros and Cons

| Pros                                                                                                                                          |  Cons                                                                                                                                                                                                                            |
| --------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| You avoid tight coupling between the creator and the concrete products.                                                                       |  The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes. |
| **Single Responsibility Principle**. You can move the product creation code into one place in the program; making the code easier to support. |                                                                                                                                                                                                                                  |
| **Open/Closed Principle**. You can introduce new types of products into the program without breaking existing client code.                    |                                                                                                                                                                                                                                  |


## Class Diagram
![Factory Pattern](../assets/images/factory.jpg)


## Implementation


> Step 1

Create an interface.   
`Shape.java`
```java
{% include 'design-patterns/factory-code/Shape.java' %}
```

> Step 2 

Create concrete classes implementing the same interface.  
`Circle.java`
```java
{% include 'design-patterns/factory-code/Circle.java' %}
```

`Rectangle.java`
```java
{% include 'design-patterns/factory-code/Rectangle.java' %}
```

`Square.java`
```java
{% include 'design-patterns/factory-code/Square.java' %}
```

> Step 3

Create a Factory to generate object of concrete class based on given information.  
`ShapeFactory.java`
```java
{% include 'design-patterns/factory-code/ShapeFactory.java' %}
```
> Step 4

Use the Factory to get object of concrete class by passing an information such as type.  
`FactoryPatternDemo.java`
```java
{% include 'design-patterns/factory-code/FactoryPatternDemo.java' %}
```

> Output

```
{% include 'design-patterns/factory-code/output.txt' %}
```
