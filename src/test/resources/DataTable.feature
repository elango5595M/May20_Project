Feature: this is login feature in Orange hrm
Scenario: this sceanio is login functionality
Given user login to orange hrm brower
When user to send valid username and valid password
|Admin|admin123|
And click login button
Then open the orange hrm home page is displayed   
 