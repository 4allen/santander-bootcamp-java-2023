# Santander Bootcamp java 2023
Java RESTful API criada para o Santander Bootcamp Backend Java.

## Diagrama de Classes

```mermaid

classDiagram
  class User {
    - name: String
    - account: Account
    - features: Feature[]
    - card: Card
    - news: News[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Float
    - limit: Float
  }

  class Feature {
    - icon: String
    - description: String
  }

  class Card {
    - number: String
    - limit: Float
  }

  class News {
    - newsIcon: String
    - newsDescription: String
  }

  User "1" *-- "1" Account
  User "1" *-- "n"Card
  User "1" *-- "n"Feature
  User "1" *-- "n" News
  
  ```
