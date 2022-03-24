---
title: Introduction
description: Software Security Concepts
---

> How to build a secure application ?

Software security is an idea implemented to protect software against malicious attacks and other attacker risk
so that the software continues to function, run  as expected, and is not compromised under such potential risk.

Security is necessary to provide integrity, confidentiality, and availability of data.

Security relies on the following elements: [**CIA4**]

a. **Authentication**  
- Authentication is the process of verifying the identity of a user.
- Authentication addresses the question: "Who is this user?"
- It is the process of uniquely identify the clients of your applications and services.

b. **Authorization**  
- Authorization is the process of verifying the permissions of a user.
- Authorization addresses the question: "What can this user do?"
- It is the process that governs the resources and operations that the user is
  permitted to access and operate.

c. **Auditing**  
- Effective auditing and logging is the key to non-repudiation (denial of truth).
- It guarantees that a user cannot deny performing an operation or initiating an transaction.

d. **Confidentiality**  
- It refers to the privacy of data.
- It is a process of making sure that data remains private and confidential and that it cannot be viewed by unauthorized users.
- Encryption is frequently used to enforce confidentiality.

e. **Integrity**  
- It is the guarantee that data is protected from accidental or malicious modification.
- Integrity for data in transmission is typically provided by hashing techniques ad message authentication ports.

f. **Availability**  
- It is the guarantee that data is available to the intended recipient.
- The goal for many attackers with denial of service attack is to crash an application or to make that it is sufficiently overwhelmed so that other users cannot access the applicaiton.
