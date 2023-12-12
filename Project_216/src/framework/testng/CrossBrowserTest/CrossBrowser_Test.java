package framework.testng.CrossBrowserTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String browsername)
	{
		switch (browsername) 
		{
		case "chrome":
			
			driver=new ChromeDriver();
			Reporter.log("Chrome browser launched");
			break;
			
		case "firefox":
		
			driver=new FirefoxDriver();
			Reporter.log("firefox browser launched");
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			System.out.println("Ie Browser launched");
			break;

		default:  System.out.println("Browsername mimsatch");
			break;
		}
		
	}
	
	@Test(priority=1)
	@Parameters("Application_url")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Application load finished");
		
		driver.manage().window().maximize();
		Reporter.log("Browser maximize finished");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Reporter.log("30 seconds implicit wait assigned");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid, String Apwd)
	{
		WebElement Email_EB=driver.findElement(By.id("email"));
		Email_EB.clear();
		Email_EB.sendKeys(Auid);
		Reporter.log("Email enter finished");
		
		WebElement Passoword_EB=driver.findElement(By.id("pass"));
		Passoword_EB.clear();
		Passoword_EB.sendKeys(Apwd);
		Reporter.log("Password Enter finished");
		
	}
	

}
