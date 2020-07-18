Feature: To test the Admin
Background: User is logged in

Given To open the browser and navigate to the URL
When To get the title of the page
Then Enter "Admin" and "admin123"
Then Click submit button
Then Click Admin button

Scenario: To validate Admin functionality

Given Admin paged to be launched
Then Enter "viji" and "Admin" and "vijisaran" and "Enabled"
Then SearchButton
Then Close the browser  





