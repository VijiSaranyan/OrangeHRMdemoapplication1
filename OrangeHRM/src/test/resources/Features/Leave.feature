Feature: To test the Leave Functionality 

Background:

Given To open the browser and navigate to the URL
When the title of login page is OrangeHrm
When the user enters "Admin" and "admin123"
Then user clicks on login button

Scenario: Navigate to Leave Page
Given User is on Leavepage
When User clicks on Leave List 
Then User selects  the "From" and To "Date" and "Show Leave with Status" and "Employee" and "Sub Unit" and "Include Past Employees"
Then User clicks on Search Button
#Then Click on Close browser



#Scenario: To validate Leave functionality
#When User clicks on  Leave page 
#When User  Selects the "From" and To "Date" and "Show Leave with Status" and "Employee" and "Sub Unit" and "Include Past Employees"
#Then  Click on SearchButton
#Then Close the Browser
