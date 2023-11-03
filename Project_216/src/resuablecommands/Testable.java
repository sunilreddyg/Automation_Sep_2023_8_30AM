package resuablecommands;

import org.openqa.selenium.WebDriver;

public class Testable 
{
	
	public static boolean verifytitle(WebDriver driver,String exptitle)
	{
		return driver.getTitle().contains(exptitle);
	}

}
