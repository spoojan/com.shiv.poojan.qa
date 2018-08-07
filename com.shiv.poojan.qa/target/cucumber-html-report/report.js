$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/com/shiv/poojan/module1/module2.feature");
formatter.feature({
  "line": 2,
  "name": "Module1 REST API test cases",
  "description": "",
  "id": "module1-rest-api-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@module1"
    }
  ]
});
formatter.before({
  "duration": 7072787,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify Delhi City",
  "description": "",
  "id": "module1-rest-api-test-cases;verify-delhi-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TCID_01"
    },
    {
      "line": 4,
      "name": "@comp_City"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "city name \"Delhi\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "i get city details",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "city details should be found correctly",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Delhi",
      "offset": 11
    }
  ],
  "location": "Module1RestAPITest.city_name(String)"
});
formatter.result({
  "duration": 69723619,
  "status": "passed"
});
formatter.match({
  "location": "Module1RestAPITest.i_get_city_details()"
});
formatter.result({
  "duration": 2965941804,
  "status": "passed"
});
formatter.match({
  "location": "Module1RestAPITest.city_details_should_be_found_correctly()"
});
formatter.result({
  "duration": 120947,
  "status": "passed"
});
formatter.before({
  "duration": 206986,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Verify Dimapur City",
  "description": "",
  "id": "module1-rest-api-test-cases;verify-dimapur-city",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@TCID_02"
    },
    {
      "line": 10,
      "name": "@comp_City"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "city name \"Dimapur\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "i get city details",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "city details should be found correctly",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Dimapur",
      "offset": 11
    }
  ],
  "location": "Module1RestAPITest.city_name(String)"
});
formatter.result({
  "duration": 107196,
  "status": "passed"
});
formatter.match({
  "location": "Module1RestAPITest.i_get_city_details()"
});fformatter.result({
  "duration": 3043892325,
  "status": "passed"
});
formatter.match({
  "location": "Module1RestAPITest.city_details_should_be_found_correctly()"
});
formatter.result({
  "duration": 118480,
  "status": "passed"
});
});