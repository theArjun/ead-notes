---
title: Introduction
description: Introduction to Enterprise Application Architecture
---

## Enterprise
- Enterprise essentially means that the company has multiple levels,
  locations, division or departments that all collborate to achieve
  big picture business objectives.  
  For eg: Customer Relationship Management (CRM) is often referred as
  enterprise application (large scale business).


## Enterprise Application
- It is an application that a business uses to support the organization
  in order to solve enterprise problem. It denotes a software platform
  that is quite complex and comparatively huge for small business.  
  Enterprise application demands high requirements in terms of security.
  User access and maintainence [application for large scale business].

## Technologies used to develop Enterprise Application

 - User Interface layer (Presentation Layer) - AWT, Swing, HTML, ISP, Velocity Framework
 - Business Processing Layer - Servlets, JSP, EJB
 - Data Storage and Access Layer (Persistence Layer) - JDBC, EJB

For eg: Java provides the enterprise solutions whereas its editions
serve different purposes.

 - J2SE - Introduction, OOP, String Manipulation
 - J2EE - Servlets, EJB, Middleware Service, JSP
 - J2ME - Wireless Messaging, Mobile XML etc.

Java is widely used for developing enterprise applications (EA) because:
1. Learning Curve
2. Java has a vast array of libraries, frameworks, tools and server provider.
3. Platform indeependence.
4. Maturity
5. Java ensures security, stability, robustness, high performance etc.


## Example of Enterprise Application
- Customer Relationship Management (CRM)
- Automated Billing System
- Enterprise Resource Planning
- HR Management

## Framework
- A framework is a real or conceptual structure intended to serve as a
  support or guide for the building of something.
- In computer systems, a framework is often a layered structure indicating
  what kind of programs, can should built and how they would interact.

## Enterprise Application vs Desktop Application vs Web Application
a. Desktop Application  

- Runs on single tier architecture.
- All the presentation logic, business logic and data storage and access logic resides in
  a single machine.
- Morever, it can be part of network but the application and its database stay in the same machine.
- It doesn't support multiple users concurrently.

b. Enterprise Application  

- It normally includes more than a single tier.
- Multiple users can access the application at the same time. (Multiple concurrent users)
- It have client tier (java client, browser, mobile based client), representation tier (JSP),
  business logic tier (EJB), and data storage and access tier (JDBC).
- It can be distributed system.
- It can be a web application or a desktop application.

c. Web Application  

- It is a web application that runs on a web server.
- Web applications runs on a web server like Tomcat whereas desktop applications runs on a
  desktop machine and enterprise applications runs on a application server like Glassfish.
- Web applications can be accessed by any browser.
- It needs internet access to run.

