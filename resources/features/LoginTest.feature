
Feature: Login

 
  Scenario: login with valid
    Given user is in login page
    
    When user enters username and password, click on submit button
    
    Then user redirect to dashboard page
    

  
