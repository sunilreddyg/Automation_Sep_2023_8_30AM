package waitcommands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Numberof_Windows 
{

	public static void main(String[] args)
	{
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();   //This link will open new window
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			wait.until(ExpectedConditions.numberOfWindowsToBe(2));
			System.out.println("Third window is opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 *  Changing how often the code is evaluated (polling interval)
		 *	Specifying which exceptions should be handled automatically
		 *	Changing the total timeout length
		 *	Customizing the timeout message
		 */
		
		
	

	}

}
