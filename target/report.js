$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("B:/Testngpractice/AbhiBusAplication/src/test/resources/Feature/Abhibus.feature");
formatter.feature({
  "name": "To check Abhibusbooking Application Funtions",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User Entering Abibus Application HomePage",
  "keyword": "Given "
});
formatter.step({
  "name": "User Fills Sourse and Destination location details \"\u003csource\u003e\",\"\u003cDestination\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Click the Search button in Abibushomepage",
  "keyword": "And "
});
formatter.step({
  "name": "User Validation the Bus Details in Bus_Search Page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "source",
        "Destination"
      ]
    },
    {
      "cells": [
        "Chennai",
        "Bangalore"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Entering Abibus Application HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "AbhibusHomePageStep.user_Entering_Abibus_Application_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Fills Sourse and Destination location details \"Chennai\",\"Bangalore\"",
  "keyword": "When "
});
formatter.match({
  "location": "AbhibusHomePageStep.user_Fills_Sourse_and_Destination_location_details(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Search button in Abibushomepage",
  "keyword": "And "
});
formatter.match({
  "location": "AbhibusHomePageStep.user_Click_the_Search_button_in_Abibushomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Validation the Bus Details in Bus_Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidateAbhiBusesAvailabilitystep.user_Validation_the_Bus_Details_in_Bus_Search_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});