Feature: Search functionality

Scenario: User search for a valid product
Given User navigates to Home page
When User has entered valid product "HP" into the search box field
And User clicks on search button
Then User should get valid product displayed in search results.

Scenario: User search for a invalid product
Given User navigates to Home page
When User has entered invalid product "Honda" into the search box field
And User clicks on search button
Then User should get a message about no product matching

Scenario: User searches without any product
Given User navigates to Home page
When User dont entered any product into the search box field
And User clicks on search button
Then User should get a message about no product matching