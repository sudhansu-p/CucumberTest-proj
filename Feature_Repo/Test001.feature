Feature: Validate Pet component REST APIs

  @tag1
  Scenario: Validate Pet Store Inventory
    Given URI is "http://petstore.swagger.io/v2/store/inventory"
    When Perform GET request
    Then Validate response "200"
