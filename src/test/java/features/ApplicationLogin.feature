Feature: Application Login

Scenario: Home-page Login
Given User is on a landing page
When User login to the application by entering valid "test1" and "1234" password
Then Home page is displayed
And Username is displayed "true"

Scenario: Home-page Login
Given User is on a landing page
When User login to the application by entering valid "test2" and "4321" password
Then Home page is displayed
And Username is displayed "false"