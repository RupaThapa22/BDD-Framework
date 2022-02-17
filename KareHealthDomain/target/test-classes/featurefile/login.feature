
Feature: login and select customer
  
  Background: 
    Given admin user is on home page
    And he enter the username
    And he enter the password
    Then he login succesfully
    
 Scenario: Select customer using filter option   
 		
 		When user click on total order
    And he click on filter
    And he enter customer name
    Then he can view the customer details  

  
