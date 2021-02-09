Story: Create Customer

Narrative:
As a development team
I want to Create Customer
So that i can do the transactions
			
Meta:
@createNewCustomer
		 
Scenario:  Create New Customer by filling all fields
Given <user> is in Add New Customer Page
When user enters all customer data
And save the Customer
Then user should be able to see Customer Registered Successfully

Examples:
|user|
|mngr307768|
					 
