@module2
Feature: Module2 REST API test cases

  @TCID_01 @comp_City
  Scenario: Verify Delhi City
    Given city name "Delhi"
    When i get city details
    Then city details should be found correctly
    
  @TCID_02 @comp_City
  Scenario: Verify Dimapur City
    Given city name "Dimapur"
    When i get city details
    Then city details should be found correctly