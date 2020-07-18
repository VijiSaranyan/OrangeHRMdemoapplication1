Feature: To test the Leave Functionality 

Background:

Given To open the browser and navigate to the URL
When the title of login page is OrangeHrm
When the user enters "Admin" and "admin123"
Then user clicks on login button

Scenario: Navigate to the Leave page 
Given User is on Entitlement page
When User clicks on Add Entitlement
Then User selects "Add to Multiple Employees" and "Employee" and "Location" and "Leave Type" and "Leave Period" and "Entitlement"
Then User clicks on Save Button



#Scenario: Navigate to the Leave page 
#Given User is on Entitlement page
#When User clicks on Employee Entitlement
Then the User Selects "Employee" and "Leave Type" and "Leave Period"
Then User clicks on Search Button 

