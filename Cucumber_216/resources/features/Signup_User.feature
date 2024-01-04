Feature: Facebook Signup

	Scenario:  Verify Signup with valid data
	Given fb url at "chrome" browser
	When user click Signup link
	And Enter firstname "Sunil"
	And Enter Secondname "Reddy"
	And select age 35
	And select month as "Dec" and year as 1985
	And click SIgnUp button 
	Then verify msg displayed "Account created"
	
	Scenario:  Verify Signup with valid data
	Given fb url at "chrome" browser
	When user click Signup link
	And Enter firstname "Pranil"
	And Enter Secondname "Reddy"
	And select age 12
	And select month as "Dec" and year as 2013
	And click SIgnUp button 
	Then verify msg displayed "Under Age"