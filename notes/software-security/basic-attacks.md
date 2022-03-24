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

