---
title: Communication Types
description: Explains about Communication Types - GET, POST, PUT, DELETE, PATCH, HEAD, OPTIONS, TRACE, CONNECT, etc.
---

## GET
Requests a representation of the specified resource. Requests using GET should only retrieve data and should have no other effect.  

Note that query strings (name/value pairs) is sent in the URL of a GET request:  
e.g. `/test/demo_form.php?name1=value1&name2=value2`

**Key Points to Remember:**  
- GET requests can be cached
- GET requests remain in the browser history
- GET requests can be bookmarked
- GET requests should never be used when dealing with sensitive data
- GET requests have length restrictions
- GET requests should be used only to retrieve data


## POST
Requests that the server accept the entity enclosed in the request as a new resource. The data is typically sent in the body of the request.

Note that query strings (name/value pairs) is sent in the HTTP message body of a POST request:
```
POST /test/demo_form.asp HTTP/1.1
Host: w3schools.com
name1=value1&name2=value2
```
**Key Points to Remember:**  
- POST requests are never cached
- POST requests do not remain in the browser history
- POST requests cannot be bookmarked
- POST requests have no restrictions on data length


## GET OR POST ?

| | GET | POST |
| --- | --- | --- |
| Back Button / Reload | Harmless | Data will be re-submitted (the browser should alert the user that the data are about to be re-submitted) |
| Bookmark | Can be bookmarked | Cannot be bookmarked |
| Cache | Can be cached | Cannot be cached |
| Encoding Type | `application/x-www-form-urlencoded` | `application/x-www-form-urlencoded` or `multipart/form-data`. Use multipart encoding for binary data. |
| History | Parameters remain in browser history | Parameters do not get saved in browser history |
| Restriction on Data Length | Yes, when sending data, the GET method adds the data to the URL; and the length of a URL is limited (maximum URL length is 2048 characters) | No restrictions |
| Restriction on Data Type | Only ASCII characters allowed | No restrictions. Binary data is also allowed |
| Security | GET is less secure compared to POST because data sent is part of the URL Never use GET when sending passwords or other sensitive information | POST is a little safer than GET because the parameters arenot stored in browser historyor in web server logs. |
| Visibility | Data is visible to everyone in the URL | Data is not displayed in the URL | 


## PUT
Requests that the enclosed entity be stored under the specified URI. If the URI refers to an already existing resource, it is modified; otherwise, a new resource is created.
If the URI does not point to an existing resource, then the server can create the resource with that URI.

**Use the HTTP PUT method when**:  
- The client includes all aspect of the resource including the unique identifier
to uniquely identify the resource. Example: creating a new employee.
- The client provides all the information for a resource to be able to modify
that resource. This implies that the server side does not update any aspect
of the resource (such as an update date).

**Use the HTTP POST method when:**  
- The server will provide some information concerning the newly created
resource. For example, take a logging system. A new entry in the log will
most likely have a numbering scheme which is determined on the server
side. Upon creating a new log entry, the new sequence number will be
determined by the server and not by the client.
- On a modification of a resource, the server will provide such information as a resource state or an update date. Again in this case not all information
was provided by the client and the resource will be changing from one
modification request to the next. Hence a non-idempotent operation.


## DELETE
Requests that the server delete the resource identified by the Request-URI.

## HEAD
Requests that the server send back a HEAD response identical to that of a GET request, but without the response body.

## PATCH
Requests that a set of changes described in the request entity be applied to the resource identified by the Request-URI.

## OPTIONS
Requests that the server send back a collection of options and information about the resource identified by the Request-URI.
