---
title: Cross Site Scripting
description: Brief introduction to XSS
---

XSS attacks are a type of injection in which malicious scripts are injected intro the webpages.  
XSS attacks occur when an attacker uses a web application to send malicious code to a user in form of a browser side script.

## Types of XSS
-  Reflected / Non-Persistence XSS 
     - Occur when the data provided by a web client, most commonly in HTTP (Query Parameters)
   is used immediately by server side scripts to perform actions without properly sanitizing the request.

- Stored / Persistence XSS
     - It occurs when the data provided by the attacker is saved by the server in a database or other storage medium.
     - The stored script then executes repeatedly on the server side.


## Causes of XSS
- Data enters a Web application through an untrusted source, most frequently a web request.
- The data is included in dynamic content that is sent to a web user without being validated for malicious content.
