@module1
Feature: Module1 REST API test cases

  @TCID_01 @comp_City
  Scenario: Verify Delhi City in module1
    Given city name "Delhi"
    When i get city details
    Then city details should be found correctly
    
  @TCID_02 @comp_City
  Scenario: Verify Dimapurx City in module1
    Given city name "Dimapurx"
    When i get city details
    Then city details should be found correctly