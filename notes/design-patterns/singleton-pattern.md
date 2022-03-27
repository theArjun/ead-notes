---
title: Singleton Pattern
description: Explains about Singleton Pattern
---

- It comes under creational pattern as this pattern provides one of the best ways to create an object.
- This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
  This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## Applicability:
- Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
- Use the Singleton pattern when you need stricter control over global variables.
- For accessing cache-memory, database connection, drivers, logging. etc.


## Pros and Cons
| Pros                                                      |  Cons                                                   |
| --------------------------------------------------------- | ------------------------------------------------------- |
| control access to shared resources (databases; files etc) |  tight coupling -> complication for scaling and testing |
| global access point for singletoned instances             |  static memory allocation                               |
| one time initialization                                   |  hidden dependencies in the code                        |
| ensuring maximum number of instances per object           |  violation of single responsibility principle           |
|                                                           |  complications in multithreaded solutions               |

## Class Diagram
![Singleton Pattern](../assets/images/singleton.jpg)


## Implementation


> Step 1

Create a Singleton Class.  
`SingleObject.java`
```java
{% include 'design-patterns/singleton-code/SingleObject.java' %}
```

> Step 2

Get the only object from the singleton class.  
`SingletonPatternDemo.java`
```java
{% include 'design-patterns/singleton-code/SingletonPatternDemo.java' %}
```

> Output

```
{% include 'design-patterns/singleton-code/output.txt' %}
```


## Example:
### Counter

`Counter.java`
```java
{% include 'design-patterns/singleton-code/Counter.java' %}
```
`SingleCounterDemo.java`
```java
{% include 'design-patterns/singleton-code/SingleCounterDemo.java' %}
```

`Output`
```
{% include 'design-patterns/singleton-code/counter_output.txt' %}
```
