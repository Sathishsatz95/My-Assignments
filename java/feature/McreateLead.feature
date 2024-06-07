Feature: CreateLead Login functionality of Leaftaps application

#Background:
#Given launch the browser
#And Load the URL


Scenario Outline: Login with positive credentials
Given Enter the credential username as 'Demosalesmanager' and password as 'crmsfa'
When click on the login button
Then Home page should be displayed
When click on the crmsfa link
And click on Leads link
And click on the CreateLead link
And Enter the companyname as <companyname>
And Enter the firstname <firstname>
And Enter the lastname as <lastname>
When click on the submit Button
Then Viewleads page should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Sathish|Kumar|
|Qeagle|Karthiga|Dayalan|

