Feature: Validate the OrangeHRM application

Background: User is logged in 
Given Launch the OrangeHrm website
When Print title  of page
Then  Fill "Admin" and "admin123"
Then submit

Scenario: To validate the Reports Page in OrangeHRM
Then Clicks  on Leave tab and then  on Reports tab
Then Click on Leave Entitlements and Usage Reports
Then Click on Generate For Leave Type or Employee
When User Clicks on Leave Type and Fills the Leave Type ,From ,Job Title,Location,Sub Unit
When User Clicks on Employee and Fills the  Employee and From 
Then User Clicks on View Button and Close the Browser

