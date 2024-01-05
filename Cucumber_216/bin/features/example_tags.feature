Feature:  Verifying book version

	@sanity @finaltest
	Scenario:  Check Book1 Availability
		When book1 is selected
		Then Check Author of book is "Sam"
	@smoke
	Scenario:  Check Book2 Availability
		When book2 is selected
		Then Check Author of book2 is "Arjun"
	@reg1	@finaltest
	Scenario:  Check Book3 Availability
		When book3 is selected
		Then Check Author of book3 is "sunil"
		
	@reg1	
	Scenario:  Check Book4 Availability
		When book4 is selected
		Then Check Author of book4 is "Raj"