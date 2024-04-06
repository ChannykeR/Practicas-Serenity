Feature: Login

  Rule: Customer need to provide valid credentials to access the product catalog

      Example: Juana log in with valid credentials
        Given Juana is on the login page
        When Juana logs in with valid credentials
        Then she should be presented with the product catalog



