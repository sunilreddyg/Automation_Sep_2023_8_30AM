package webdriver_manager;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Manager5 {

	public static void main(String[] args) {
		
		
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("http://instagram.com");
		System.out.println(driver.getTitle());
		
		
		WebDriver firefox=WebDriverManager.firefoxdriver().avoidShutdownHook().create();
		firefox.get("http://facebook.com");
		
	}

}
