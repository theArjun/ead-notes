---
title: Denial of Service (DOS)
description: Brief introduction to DOS and DDOS Attacks
---

A DOS Attack is an attack meant to shut down a machine or network or a service making it inaccessible to its intended users.

DOS attacks typically flood servers, systems or networks with traffic in order to overwhelm the victim resources and make it difficult or impossible for legitimate users to access the services / resources.

## Types of DOS Attacks
1. Flooding Services
2. Crashing Services

### Flooding Services
Flood attacks when the system receive too much traffic for the server to buffer, causing them to slow down and eventually stop.  
Popular flood attacks are:

- Buffer Overflow attacks 
    - Buffer Overflow attacks are attacks that overflow the buffer of a server, causing it to crash
- ICNP Flood 
    - ICMP flood attacks are attacks that flood the Internet Control Message Protocol (ICMP) protocol 
    - also known as a Ping flood attack, is a common Denial-of-Service (DoS) attack in which an attacker attempts to overwhelm a targeted device with ICMP echo-requests (pings)
- SYN Flood - Synchronization Flood
    - TCP SYN flood, is a type of denial-of-service (DoS) or distributed denial-of-service (DDoS) attack that sends massive numbers of SYN requests to a server to overwhelm it with open connections.


### Crashing Services
Crashing services are attacks that cause the server to crash.

## Signs of DOS Attacks
1. Degradation in network performance especially when attempting to files stores on the networking or when accessing the websites.
2. Higher than usual volume of spam email.
3. An inability to reach a particular websites.

## Distributed Denial of Service (DDoS)
DDoS attacks are attacks that are distributed across a network.  
A DDoS attack occurs when multiple systems, plan or co-ordinate a synchronize DoS attack to a single target.  
A essential difference is that instead of being attacked from a single location, the target is attacked from multiple locations at once.

### DDoS Attack Mitigation
1. Use of a firewall to block the suspicious requests.
2. Buy more bandwidth and scale the server.
3. Build redundancy intro your infrastructure.
4. Configure your network hardware against DDoS attacks.
5. Protect your DNS Server.
6. Deploy Anti-DDoS software modules.
7. Use a VPN to protect your network.
8. Use a load balancer to distribute the traffic.
