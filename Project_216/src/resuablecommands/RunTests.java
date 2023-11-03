package resuablecommands;


import org.junit.jupiter.api.Test;

class RunTests 
{
	
	public RunTests() 
	{
		HelperClass.setUpDriver();
	}

	@Test
	void test() 
	{
		HelperClass.openPage("http://facebook.com");
		boolean flag=Testable.verifytitle(HelperClass.getDriver(), "Facebook");
		System.out.println(flag);
	}

}
