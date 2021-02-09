Story: Create Customer

Narrative:
As a development team
I want to Create Customer
So that i can do the transactions
			
Meta:
@createNewCustomerFromExamples
		 
Scenario:  Create New Customer by filling all fields
Given <user> is in Add New Customer Page
When user enters <customerName>, <gender>, <dob>, <addr>, <city>, <state>, <pin>, <mobileNumber>, <eMail> and <passWord> values
And save the Customer
Then user should be able to see Customer Registered Successfully

Examples:
|user      |customerName|gender|dob       |addr     |city|state|pin   |mobileNumber|eMail           |passWord|
|mngr307768|CUSTOMERA   |Male  |07/07/1987|Temp Addr|City|State|123456|9999999999  |sdgds@lknk1l.com|654321  |
|mngr307768|CUSTOMERB   |Male  |07/07/1987|Temp Addr|City|State|123456|9999999999  |sdgds@lknkl1.com|654321  |
					 
