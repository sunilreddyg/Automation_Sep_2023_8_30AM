package stepdefinations;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultpleData 
{
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() 
	{
		System.out.println("user at homepage");
	}
	@When("User Navigate to LogIn Page")
	public void user_navigate_to_log_in_page() 
	{
		System.out.println("user at login page");
	}
	@When("User enters Credentials to LogIn")
	public void user_enters_credentials_to_log_in(io.cucumber.datatable.DataTable dataTable) 
	{
	    String UID=dataTable.row(3).get(0);
	    String PWD=dataTable.row(3).get(1);
	    System.out.println(UID+"\t"+PWD);
	    
	    for (List<String> row : dataTable.asLists()) 
	    {
			System.out.println(row.get(0));
			System.out.println(row.get(1));
		}
	}
	@Then("Message displayed Login Successfully")
	public void message_displayed_login_successfully() 
	{
	   System.out.println("Message Displayed login success");
	}


}
