package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources\\features\\logintest.feature",
		plugin = {"pretty", "html:target/cucumber.html"},
		monochrome=true
		)
		
public class Reporter_test 
{

	
}
