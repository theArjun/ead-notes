---
title: Do's and Don'ts of Client-Side Authentication
description: Approaches of Client Side Authentication
---

Client-side authentication is when authentication checks are performed completely at users' side.

> Is authentication client-side safe?

Well, but the information is already on the client, and there's no technical possibility to prevent a user from accessing it, even if it's "behind the scenes". So even if purely client-side authentication was possible (it isn't, for the same reasons), you will ultimately fail at client-side authorisation either way.


## Approaches:  
- Use Cryptography Appropriately
- Protect Passwords
- Handle Authenticators Carefully


### Use Cryptography Appropriately
- Appropriate amount of security
    - Keep It Simple, Stupid
- Do not be inventive
    - Designers should be security experts
- Do not rely on the secrecy of a protocol
    - Vulnerable to exposure
- Understand the properties of cryptographic tools
    - Example: Crypt()
- Do not compose security schemes
    - Hard to foresee the effects

### Protect Passwords
- Limit exposure
    - Don’t send it back to the user (much less in the clear)
    - Authenticate using SSL vs. HTTP
- Prohibit guessable passwords
    - No dictionary passwords
- Reauthenticate before changing passwords
    - Avoid replay attack

### Handle Authenticators Carefully
- Make authenticators unforgeable
    - If using keys as session identifier: should be cryptographically random
    - Protect from tampering (MAC)
- Protect authenticators that must be secret
    - Authenticator as cookie
        - Sent by SSL
        - Don’t forget the flag! (SprintPCS)
    - Authenticator as part of URL
- Avoid using persistent cookies
    - Persistent vs. ephemeral cookies
    - Cookie files on the web
- Limit the lifetime of authenticators
    - Encrypt the timestamp
    - Secure binding limits the damage from stolen authenticators
- Bind authenticators to specific network addresses
    - Increases the difficulty of a replay attack
