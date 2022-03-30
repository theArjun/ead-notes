---
title: Web Protocols
description: Explains about Web Protocols - HTTP, POP, SMTP etc.
---


- Protocols are set of rules that help in governing the way a particular technology will function for communication.
- It defines standard for enabling the connection communication and data transfer between two computers on a network.
- It is a set of rules for message exchange among computers.

## Requirements
1. Data formats for Data Exchange: 
    - `Header | Data`
2. Address Format for Data Exchange
    - Sender and Receiver
    - Address are stored in Header Section
3. Address Mapping
4. Routing
5. Detection of Transmission Errors
6. Acknowledgement
7. Loss of Information (Handling)
8. Sequence Control
9. Flow Control

## Types of Protocols

### Basis of State
1. Stateless Protocol - `HTTP`, `UDP`
2. Stateful Protocol - `TCP`, `FTP`

### Basis of Layer
1. Transport Layer - `TCP`, `UDP`
2. Application Layer - `HTTP`, `FTP`

## Some Protocols
1. Transmission Control Protocol (`TCP`)
2. Internet Protocol (`IP`)
3. User Datagram Protocol (`UDP`)
4. Post office Protocol (`POP`)
5. Simple mail transport Protocol (`SMTP`)
6. File Transfer Protocol (`FTP`)
7. Hyper Text Transfer Protocol (`HTTP`)
8. Hyper Text Transfer Protocol Secure (`HTTPS`)
9. Telnet

### Transmission Control Protocol (TCP)
TCP is a popular communication protocol which is used for communicating over a network. It divides any message into series of packets that are sent from source to destination and there it gets reassembled at the destination.

### Internet Protocol (IP)
IP is designed explicitly as addressing protocol. It is mostly used with TCP. The IP addresses in packets help in routing them through different nodes in a network until it reaches the destination system. TCP/IP is the most popular protocol connecting the networks.

### User Datagram Protocol (UDP)
UDP is a substitute communication protocol to Transmission Control Protocol implemented primarily for creating loss-tolerating and low-latency linking between different applications.

### Post office Protocol (POP)
POP3 is designed for receiving incoming E-mails.

### Simple mail transport Protocol (SMTP)
SMTP is designed to send and distribute outgoing E-Mail.

### File Transfer Protocol (FTP)
FTP allows users to transfer files from one machine to another. Types of files may include program files, multimedia files, text files, and documents, etc.

### Hyper Text Transfer Protocol (HTTP)
HTTP is designed for transferring a hypertext among two or more systems. HTML tags are used for creating links. These links may be in any form like text or images. HTTP is designed on Client-server principles which allow a client system for establishing a connection with the server machine for making a request. The server acknowledges the request initiated by the client and responds accordingly.

> How HTTP track the progress of the user from page to page?

{% include 'extra/questions/http-state.md' %}

### Hyper Text Transfer Protocol Secure (HTTPS)
HTTPS is abbreviated as Hyper Text Transfer Protocol Secure is a standard protocol to secure the communication among two computers one using the browser and other fetching data from web server. HTTP is used for transferring data between the client browser (request) and the web server (response) in the hypertext format, same in case of HTTPS except that the transferring of data is done in an encrypted format. So it can be said that https thwart hackers from interpretation or modification of data throughout the transfer of packets.

### Telnet
Telnet is a set of rules designed for connecting one system with another. The connecting process here is termed as remote login. The system which requests for connection is the local computer, and the system which accepts the connection is the remote compute

