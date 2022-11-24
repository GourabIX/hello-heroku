# hello-heroku

This is a demo Spring Boot project for deployment on Heroku dynos.

Endpoint: `/user/{username}`

HTTP method: `GET`

### Example:

GET: https://hello-heroku-gs.herokuapp.com/user/Gourab

will return the following response:

```
{
    "ip": "123.234.287.123",
    "greeting": "Hello, Gourab",
    "name": "Gourab"
}
```

with a status code of `200 OK`.
