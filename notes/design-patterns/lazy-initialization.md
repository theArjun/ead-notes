---
title: Lazy Initialization
description: Explains about lazy initialization and how to implement it in your code. Also, difference with early initialization.
---
Singleton class can be instantiated by two methods:

## Early / Eager initialization
- In this method, class is initialized whether it is to be used or not. 
- The main advantage of this method is its simplicity. 
- Its drawback is that class is always initialized whether it is being used or not.
- Early initialization is just reverse, you initialize a singleton upfront at the time of class loading.

### Implmentation (Early)
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

## Lazy initialization
- In this method, class in initialized only when it is required. 
- It can save you from instantiating the class when you don’t need it. 
- Generally, lazy initialization is used when we create a singleton class.
- Lazy initialization means that you do not initialize objects until the first time they are used.

### Implmentation (Lazy)

`SingletonPatternDemo.java`
```java
{% include 'design-patterns/singleton-code/LazySingleObject.java' %}
```








