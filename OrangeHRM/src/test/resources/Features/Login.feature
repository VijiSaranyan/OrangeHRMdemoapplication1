Feature: To test the OrangeHrm  login application
Background: To validate the Login functionality

Given To open the browser and navigate to the URL
When To get the title of the page
Then Enter "Admin" and "admin123"
Then Click submit button

Scenario: To validate the Leave Functionality
When User clicks on  Leave page 
When User  Selects the "From" and To "Date" and "Show Leave with Status" and "Employee" and "Sub Unit" and "Include Past Employees"
Then  Click on SearchButton

Then Close the Browser



#Scenario: To validate the Admin Functionality
#Given Admin page to be launched
#Then Enter "viji" and "Admin" and "vijisaran" and "Enabled"
#Then SearchButton
#Then Close the browser 



#Examples:
#|Username|password|
 #|Admin|admin123|
 
