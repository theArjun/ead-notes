HTTP is a stateless protocol.

1. A stateless protocol doesn't require server to retain information or status about each use for the duration of the multiple request.
2. HTTP has HTTP cookies. Cookies allow the server to track the user state, the number of connections and last connection etc.
3. HTTP has a persistent connection(`keep-alive`) where several request can be sent from the same TCP connection.
4. But some web apps may have to track the users progress from page to page. Solutions for these cases:
    - Use of HTTP cookies
    - Server side sessions
    - Hidden variables
    - URL-rewriting using URL encoded parameters.
