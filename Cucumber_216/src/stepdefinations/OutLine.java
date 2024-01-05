package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutLine 
{

	
	@Given("User is on Home Page fb")
	public void user_is_on_home_page_fb() 
	{
	   System.out.println("user at facebookpage");
	}
	@When("User Navigate to LogIn Page1")
	public void user_navigate_to_log_in_page1() 
	{
	  System.out.println("User at login page");
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	   System.out.println("user Enter:-> "+string);
	   System.out.println("user Enter:-> "+string2);
	}
	@Then("Message displayed Login Successfully after login")
	public void message_displayed_login_successfully_after_login() 
	{
	    	System.out.println("login Successful");
	}

}
