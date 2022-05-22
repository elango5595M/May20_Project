Feature: Open the facebook login feature file
Scenario Outline:: Verify the user name and password
Given User is on facebook login page
When User set the "<user name>" and "<Password>"
And click the login button
Then open should be the facebook home page
  Examples:
          |username|password|  
          |elango|1234|
          |raju|5943| 
      