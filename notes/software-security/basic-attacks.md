---
title: Basic Attacks
description: Basic Attacks in Software Security
---

An attack is an information security threat that involves an attempt to obtain, alter, destroy, remove, implant or reveal information without authorized access or permission. 

It happens to both individuals and organizations. There are many different kinds of attacks, including but not limited to passive, active, targeted, clickjacking, brandjacking, botnet, phishing, spamming, inside and outside.

An attack is one of the biggest security threats in information technology, and it comes in different forms. 

A passive attack is one that does not affect any system, although information is obtained. 
A good example of this is wiretapping. 

An active attack has the potential to cause major damage to an individual’s or organization’s resource because it attempts to alter system resources or affect how they work.
A good example of this might be a virus or other type of malware. 

## 1. Site Mapping
- The first technique an attacker will typically use against is your site is site mapping.
- Attacker will often do some or all of the following:
  1. Use a crawler to follow all the links in tha application and map outs the application page flow and authentication mechanism.
  2. Read comments in the documants delivered to the browser, this can give tips about the business logic and algorithm.
  3. Looks for usernames, passwords and database names in the documents delivered to the client.
  4. Looks for SQL Query.
  5. Locate hidden inputs in the form.
  6. Determine what parameters are passed between the pages.
  7. Force various error scenarios and see how the server response.

## 2. Guessing File and Directory Names
- File such as `config.php` and `settings.ini` are often used to store sensitive information.
- They may contain databases info, passwords, usernames, or other information that should not be shared.

## 3. Exploiting Known Vulnerabilities / Security Flaws
- The security flaws in web server software, operating system, when bugs are found, patches are usually posted to fix the, it takes time for system, administrator top apply secutity patches.
- Attackers can exploit the time between discovery of the system bug and the time it takes to fix the bug.


## 4. Bypassing restriction on input choices
- To improve the User Experience (UX), client code often performs validation of user input data.
- Poorly written application sometimes assumes / trusts that the submitted calues will be valid / will be drawn from the expected range.
- By bypassing the user interface, attackers can submit arbitary values, for user input variables.

## 5. Cookie Poisoning

- It is a technique that allows an attacker to trick a user into using a malicious cookie.
- By this technique, is an attack strategy in which the attacker alters, forges, hijacks, or otherwise "poisons" an otherwise valid cookie sent back to a server to steal data, bypass security, or both.
### 5.1. Cookie
A cookie is a piece of information that gets added to a user's device when they visit a website. It records their preferences as they use the website and is retrieved later by websites and web servers to do the following:

- authenticate the user's identity;
- speed up transactions -- for example, on banking or e-commerce websites;
- monitor user behavior;
- auto fill personal information on web forms;
- track items in shopping carts; and
- streamline user experiences.

### 5.2. Types of Cookies

1. Session, or nonpersistent
   - cookies last only as long as the user's website session and expire when the user leaves the website.
2. Persistent cookies
   - last beyond the life of a single session. They are created to recognize users when they return to a website and to deliver a personalized user experience with every visit.

### 5.3. How do cookies work?

As mentioned earlier, the data stored in the cookie lets the web server know the history of the website's interaction with a particular user. This enables the website to display the correct information for that user.

Let's visualize a scenario to understand the role of cookies:

  - A user enters login credentials on a website.
  - The site's server verifies the credentials and authenticates the login.
  - Subsequently, the server logs the session in a database, and a cookie containing the session ID is returned to the browser.
  - The process of verifying the session ID in the cookie data with the database continues on every subsequent request until the user logs out.
  - Once the user logs out, the session is automatically destroyed on the client and server
  - However, the cookie data continues to remain on the user's hard disk -- meaning the cookie persists -- if they have checked the Remember me or Keep me logged in options.
  
![Cookies](../assets/images/cookie-poisoning.png)

### 5.4. How cookie poisoning works

Cookie poisoning happens when unauthorized persons (attackers) can manipulate cookies due to the poor security infrastructure of a website. By editing or manipulating the cookie, the attacker can gain access to the user data stored in the cookie.

Cookie poisoning attacks are dangerous because they enable attackers to use the data stored inside cookies to gain unauthorized access to users' accounts or to steal their identities.

### 5.5. Session hijacking, session spoofing and session fixation

Cookie poisoning attacks usually target user session cookies. Cookie-based attacks against sessions aim to fool the web server into thinking that the attacker is the legitimate user.

Examples of such attacks include the following:

- Session hijacking. When a legitimate user is logged in to a website, attackers use their knowledge of the current session cookie to take over the user's session.
- Session spoofing. Attackers use stolen or forged session tokens to start a new session and impersonate the legitimate user. This type of attack requires no user interaction and can be initiated even when the user is not logged in to the website.
- Session fixation. Attackers send a known session identifier via a phishing email or other means and fool a legitimate user into using this identifier to log in to a vulnerable or malicious site. The attacker then hijacks the user session.
