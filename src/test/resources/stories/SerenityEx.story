Story: Serenity Example Demo

Narrative:
As a development team
I want to validate New Customer in Guru99
So that users are able to create New Customers 
	
Meta:
@serenityEx				 
Scenario:  Validate New Customer Page Exists or not
Given <user> is in Guru99
When user selects New Customer Link
Then user should be able to see New Customer Page
Examples:
|user|
|mngr307768|
