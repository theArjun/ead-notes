---
title: State based Attacks
description: State based attacks in Software Security
---

The last-known or current status of an application or a process. The terms maintaining state and/or managing state refer to keeping track of the condition of the process.

The Internet is intrinsically stateless because each request for a new Web page is processed without any knowledge of previous pages requested. This is one of the chief drawbacks to the HTTP protocol. Because maintaining state is extremely useful, programmers have developed a number of techniques to add state to the World Wide Web. These include server APIs, such as NSAPI and ISAPI, and the use of cookies. 


## 1. Cookie Poisoning

- It is a technique that allows an attacker to trick a user into using a malicious cookie.
- By this technique, is an attack strategy in which the attacker alters, forges, hijacks, or otherwise "poisons" an otherwise valid cookie sent back to a server to steal data, bypass security, or both.
### 1.1. Cookie
A cookie is a piece of information that gets added to a user's device when they visit a website. It records their preferences as they use the website and is retrieved later by websites and web servers to do the following:

- authenticate the user's identity;
- speed up transactions -- for example, on banking or e-commerce websites;
- monitor user behavior;
- auto fill personal information on web forms;
- track items in shopping carts; and
- streamline user experiences.

### 1.2. Types of Cookies

1. Session, or nonpersistent
   - cookies last only as long as the user's website session and expire when the user leaves the website.
2. Persistent cookies
   - last beyond the life of a single session. They are created to recognize users when they return to a website and to deliver a personalized user experience with every visit.

### 1.3. How do cookies work?

As mentioned earlier, the data stored in the cookie lets the web server know the history of the website's interaction with a particular user. This enables the website to display the correct information for that user.

Let's visualize a scenario to understand the role of cookies:

  - A user enters login credentials on a website.
  - The site's server verifies the credentials and authenticates the login.
  - Subsequently, the server logs the session in a database, and a cookie containing the session ID is returned to the browser.
  - The process of verifying the session ID in the cookie data with the database continues on every subsequent request until the user logs out.
  - Once the user logs out, the session is automatically destroyed on the client and server
  - However, the cookie data continues to remain on the user's hard disk -- meaning the cookie persists -- if they have checked the Remember me or Keep me logged in options.
  
![Cookies](../assets/images/cookie-poisoning.png)

### 1.4. How cookie poisoning works

Cookie poisoning happens when unauthorized persons (attackers) can manipulate cookies due to the poor security infrastructure of a website. By editing or manipulating the cookie, the attacker can gain access to the user data stored in the cookie.

Cookie poisoning attacks are dangerous because they enable attackers to use the data stored inside cookies to gain unauthorized access to users' accounts or to steal their identities.

### 1.5. Session hijacking, session spoofing and session fixation

Cookie poisoning attacks usually target user session cookies. Cookie-based attacks against sessions aim to fool the web server into thinking that the attacker is the legitimate user.

Examples of such attacks include the following:

- Session hijacking. When a legitimate user is logged in to a website, attackers use their knowledge of the current session cookie to take over the user's session.
- Session spoofing. Attackers use stolen or forged session tokens to start a new session and impersonate the legitimate user. This type of attack requires no user interaction and can be initiated even when the user is not logged in to the website.
- Session fixation. Attackers send a known session identifier via a phishing email or other means and fool a legitimate user into using this identifier to log in to a vulnerable or malicious site. The attacker then hijacks the user session.
