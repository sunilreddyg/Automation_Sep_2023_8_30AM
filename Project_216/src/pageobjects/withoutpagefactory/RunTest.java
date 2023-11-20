package pageobjects.withoutpagefactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import resuablecommands.HelperClass;
public class RunTest 
{
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	Testcaselogin tclogin;
	public RunTest() 
	{
		HelperClass.setUpDriver();
		driver=HelperClass.getDriver();
		tclogin=new Testcaselogin(driver);
	}
	
	
	@Test
	public void Test1()
	{
		HelperClass.openPage(url);
		tclogin.verifyloginwithinvaliddata();
	}

}
