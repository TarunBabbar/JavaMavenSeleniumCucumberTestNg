Feature: Sample API GET request

  Scenario: Get all todos
    When I send a GET request to "/todos"
    Then the response status code should be 200
    And the response should contain a list of todos
