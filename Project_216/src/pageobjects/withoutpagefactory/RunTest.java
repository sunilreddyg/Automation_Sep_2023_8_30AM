package pageobjects.withoutpagefactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import resuablecommands.HelperClass;

public class RunTest 
{
	WebDriver driver;
	String pageurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
	@Test
	public void Test1()
	{
		HelperClass.setUpDriver();
		driver=HelperClass.getDriver();
		HelperClass.openPage(pageurl);
		ResetPassword rp=new ResetPassword(driver);
		rp.verifypageheader();
		rp.enterusername("info@ogrm.com");
		rp.clickresetpassword();
	}

}
