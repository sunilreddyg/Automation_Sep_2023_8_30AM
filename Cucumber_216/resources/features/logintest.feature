Feature: Checking Login Feature
	Scenario: Verifying login with valid data
		Given site address as facebook
		When user enter valid username
		And  user enter valid password
		And click on login button
		Then verify Logout is displayed
		
	Scenario: Verifying login with invalid data
		Given site address as facebook
		When user enter invalid username
		And  user enter invalid password
		And click on login button
		Then verify error message is displayed
		
		
		