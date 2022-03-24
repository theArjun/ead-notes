---
title: Platform for Enterprise Solutions
description: Explains about platforms for enterprise solutions.
---

## Entity Java Bean (EJB)

- It is used to develop scalable, robust, secured enterprise applications using Java.
- It is a server side component that enccapsulates the business lofic of an application.
- The business logic is the code that fulfills the purpose of the pplication.
- For eg: In an inventory control application, the enterprise beans might implement the business logic in methods called checkInventoryLevel and orderProduct.
  By invoking these methods, clients can access the inventory services provided by the application.

### Benefits of EJB

- EJB simplify the development of large distributed system.
- EJB Container provides system level services to enterprise beans.
- It is responsible for system level services like transaction management, security, and so on.
- EJB Beans are portable components

### EJB Container
- EJB Container provides the following services to enterprise beans:
  - Transaction management
  - Security
  - Concurrent access control
  - Logging
  - Monitoring
  - Performance monitoring
  - etc.


### Types of Enterprise Beans
| Classification         | Sub Classification                     |
| ---------------------- | -------------------------------------- |
| 1. Session Bean        | a. Stateless Session Bean              |
|                        | b. Stateful Session Bean               |
|                        | c. Singleton Session Bean              |
| 2. Entity Bean         | a. Stateless Entity Bean               |
|                        | a. BMP (Bean Managed Persistence)      |
|                        | b. CMP (Container Managed Persistence) |
| 3. Message Driven Bean | None                                   |


