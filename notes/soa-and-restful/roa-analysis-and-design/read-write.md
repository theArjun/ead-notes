---
title: Read Write Resource-Oriented Services
description: Explains about Read Write Resource-Oriented Services
---

## Design of Read/Write Resource-Oriented Services
> How read/write resource oriented services are designed ?

The follwing steps are to be done to design a read/write resource-oriented service.

{% include 'soa-and-restful/roa-analysis-and-design/common-steps.md' %}

4. Build matrix with resource types as rows, and operations as columns
    - Indicate what operations apply to which types
        - provide example URIs and discussion of what will happen
            - especially in the case of POST and PUT
                - PUT: create or modify resource
                - POST: append content to existing resource OR append child resource to parent resource (blog entries)
        - Two questions to help
            - Will clients be creating new resources of this type?
            - Who’s in charge of determining the new resource’s URI? Client or Server? If the former, then PUT. If the latter, then POST


{% include 'soa-and-restful/roa-analysis-and-design/auth-issues.md' %}
