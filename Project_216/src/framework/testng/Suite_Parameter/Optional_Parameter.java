package framework.testng.Suite_Parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Optional_Parameter 
{
	@Test
	@Parameters("MyBrowser")
	public void openbrowser(@Optional("chrome")String browser)
	{
		System.out.println(browser);
	}
	
	/*
	 * If no parameter named "MyBrowser" is found in your testng.xml file, 
	 * your test method will receive the default value specified 
	 * inside the @Optional annotation: "chrome".
	 */
	
	/*
	 * On any method that already has a 
	 * @Test, @Before/After or @Factory annotation
	 */

}
