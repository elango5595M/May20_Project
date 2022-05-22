Feature: this is login futionality fb 
Scenario Outline:  verify login functionality valid username password
Given User is on facebook login page
When User enters "<Username>" and "<password>"
And User click login button
Examples: |Username|password|
          |elango|38748jk|
          |shk|io939|