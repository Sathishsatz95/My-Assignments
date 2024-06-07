Feature: Login functionality of Leaftaps application

#Background:
#Given launch the browser
#And Load the URL


Scenario: Login with positive credentials
Given Enter the credential username as 'Demosalesmanager' and password as 'crmsfa'
When click on the login button
Then Home page should be displayed

Scenario: Login with Invalid credentials
Given Enter the credential username as 'Demosales' and password as 'crms'
When click on the login button
But Errormessage should be displayed

