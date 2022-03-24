---
title: SQL Injection
description: Brief introduction to SQL injection
---

- A SQL Injection is an attack that consist of insertion ot injection of a SQL query via the input data from the client to the applicaiton.
- SQL Injection is the code injection technique where the malicious SQL queries are inserted into an entry field and then executed by the application.

A successful SQL injection expert can easily exploit this vulnerability to gain access to the database. They can:  

- read sensitive data from database, 
- modify database data (insert, update, delete), 
- and even execute arbitrary SQL commands such as administrative operations (such as shut own the DBMS).


## Types of SQL Injection
1. Classic SQL Injection 
      - Error based SQL Injection
          - It relies on error message thrown by the database server to obtain information about the structure of the database.
    - Union based SQL Injection
          - It forces `UNION` SQL operator to combine the results of one or more select statements into a single results which is then returned as a response.

2. Blind SQL Injection
      - Boolean Based
          - It forces the application to return a different result depending on whether the query returns `True` or `False` result.
