### New Issues: Authentication and Authorization
- Now that we are allowing a client to change stuff on our server, we need
    - Authentication: problem of tying a request to a user
    - Authorization: problem of determining which requests to let through for a given user
- HTTP provides mechanisms to enable this (HTTP Basic/Digest) and other
web services roll their own (Amazon’s public/private key on subset of request)
- Another Issue: Privacy
    - Can’t transmit “private information” in the clear; need to use HTTPS
- Another Issue: Trust
    - How do you trust your client software to do the right thing?
        - Especially in today’s environment with malware becoming harder and harder to discern.
