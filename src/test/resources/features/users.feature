Feature: Simple crud tests for users
  
  Scenario: Get full list of users
    When I call the endpoint "/users"
    Then Each user entry should have the following attributes populated: name, email, gender, status