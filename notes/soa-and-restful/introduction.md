---
title: Introduction to Web Services
description: Explains about web services
---

## Types of Services

- Request / Response type systems
    - REST - Resource oriented
        - Communication with HTTP resource
        - Involves operation for lifecycle of resource through HTTP GET, PUT, POST etc.
        - resource data can be cached
    - SOAP - Service oriented
        - Involves communication with specific application service
        - doesn't involve lifecycle operations on service lifecycle management
        - All messages are sent to service endpoint
        - endpoint decides how to process request
    - EJBs - Object oriented
        - Communication with object
        - involves marshalling unmarshalling of object
        - stateful
- Message passing type systems - Messaging Queue


## SOA vs ROA
| SOA | ROA |
| ---- | ---- |
| Service Oriented Architecture | Resource Oriented Architecture |
| SOA is API over functional modules | ROA is API wrapper over data models |
| SOA is used to link modules at run time | ROA is used to provide CRUD operations |
| Service is a piece of code that performs specific task per request and produce output | Resource can be document or data, result of algorithm. |
| SOA has more mature tool support. | ROA has less mature tool support. |
| SOA is implemented using SOAP services. | ROA is implemented using REST services. |
| Eg: Accessing Stock Data | Eg: Accessing HTML page using GET Request. |


## SOA
### Advantages
1. Services can be re-used in multiple applications.
2. Services are independent of each other which means they can be updated or maintained independently.
3. Provides more reliability and security.
4. Multiple services can run on different servers, this increases scalability and availability.
5. Improve software quality and increase productivity.

### Disadvantages
1. Increase overhead.
2. Service management is complicated.
3. Requires high investment.
4. Difficult to implement this architecture.
5. Only suitable for people in business suites.

