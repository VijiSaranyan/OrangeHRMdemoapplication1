Feature: To test the OrangeHrm application

Scenario Outline: Hook Test


When To get the title

Then I enter Username as "<username>" and Password as "<password>"

Then login should be successful


Examples:
|username|password|
 |Admin|admin123|
 




#Feature: To test the   login application for OrangeHRM
#Scenario Outline: To validate the Login functionality

#Given To open the browser and navigate to URL
#When To get the title
#Then Enter "<UserName>" and "<password>"
#Then Click Login Button
