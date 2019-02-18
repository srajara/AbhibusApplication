#Author: your.email@your.domain.com

Feature: To check Abhibusbooking Application Funtions
  I want to use this template for my feature file


  Scenario Outline: Title of your scenario outline
    Given User Entering Abibus Application HomePage 
    When User Fills Sourse and Destination location details "<source>","<Destination>"
    And User Click the Search button in Abibushomepage
    Then User Validation the Bus Details in Bus_Search Page 

    Examples: 
      | source | Destination | 
      | Chennai |Bangalore| 

