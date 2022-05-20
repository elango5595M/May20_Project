Feature: open the facebook login feature file
Scenario: verify the user name and password
Given user open into the login url page "https://www.facebook.com/"
When user set the valid username "Elango" and invalid password "elango@5595"
And click the login button
Then open should be the facebook home page