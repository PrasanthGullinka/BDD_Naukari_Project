Feature: Registration functionality

Scenario: User creates an account only with mandatory fields
Given User navigates to Register Account page
When User has enters the details into below fields
|first Name	|Prasanth|
|last Name	|Gullinka|
|Email			|sivaprashanth272@gmail.com|
|telephone	|7416113191|
|password		|12345|
And User selects Privacy Policy checkbox
And User clicks on Continue button
Then User Account gets created successfully

Scenario: User creates an account only with All fields
Given User navigates to Register Account page
When User has enters the details into below fields
|first Name	|SAm|
|last Name	|Vitech|
|Email			|sivashth272@gmail.com|
|telephone	|7416115791|
|password		|12345|
And User selects Yes for News paper
And User selects Privacy Policy checkbox
And User clicks on Continue button
Then User Account gets created successfully

Scenario: User creates a Duplicate Account
Given User navigates to Register Account page
When User has enters the details into below fields
|first Name	|Dhanya|
|last Name	|Uda|
|Email			|sivaprashanth272@gmail.com|
|telephone	|7412113191|
|password		|12345|
And User selects Privacy Policy checkbox
And User clicks on Continue button
Then User Should gets proper warning message 

Scenario: User creates an account without filling anu fields
Given User navigates to Register Account page
When User has dont enters any details into fields
And User clicks on Continue button
Then User Should gets proper warning message for every mandatory field
