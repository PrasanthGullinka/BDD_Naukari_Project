Feature: Login functionality

Scenario: Login with valid credentials
Given User navigates to login page
When User has entered valid email address "prasanthgullinka@gmail.com" into the email field
And User has entered valid passowrd "12345" into password field
And User clicks on login button
Then User gets successful logged in

Scenario: Login with invalid credentials
Given User has navigated to login page
When User enters invalid email address "prasanthgull@gmail.com" into email field
And User enters invalid password "2135123" into password field
Then User should get proper Warning message

Scenario: Login with valid email and invalid password
When User has navigated to login page
And User enters valid email address "prasanthgullinka@gmail.com" into the email field
And User has entered invalid passowrd "123445324345" into password field
And User clicks on login button
Then  User should get proper Warning message

Scenario: Login with invalid email and valid password
When User has navigated to login page
And User enters invalid email address "prasanthgull@gmail.com" into email field
And User has entered valid passowrd "123454567" into password field
And User clicks on login button
Then  User should get proper Warning message

Scenario: Login without providing any credentials
When User has navigated to login page
And User dont enter email address
And User dont enter email password
And User clicks on login button
Then  User should get proper Warning message