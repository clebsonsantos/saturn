# Titan (microservice of users)

## API Documentation

#### Save user

```http
  POST /users
```

| key   | type       | description                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `string` | **Require**. name of user |
| `email`      | `string` | **Require**. email of user |

