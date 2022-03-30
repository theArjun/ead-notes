---
title: Read Only Resource-Oriented Services
description: Explains about Read Only Resource-Oriented Services
---


## Design of Read Only Resource-Oriented Services
> How read-only resource oriented services are designed ?

The follwing steps are to be done to design a read/write resource-oriented service.

1. Figure out the dataset.
2. Split the dataset into resources.
3. For each resource
     - Name the resource with a URI
         - 3 basic rules to name the resources with URLS:
         - Use path variables to encode hierarchical relationship: `parent/child`.
         - Use punctuation characters to separate children: `parent/child1;child2`.
         - Use query variables to imply imput to the resource: `parent?child=child1`.
     - Expose a subset of the uniform interface
     - Design the representation accepted from the client
     - Design the representation served to the client
     - Integrate the resource with other resources using links and forms
     - Consider the typical course of events: what’s supposed to happen?
     - Consider error conditions: what might go wrong?

{% include 'soa-and-restful/roa-analysis-and-design/auth-issues.md' %}
