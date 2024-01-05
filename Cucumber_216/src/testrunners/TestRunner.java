package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
	(
		features=
		"resources\\features\\outlinewithtags.feature",
		glue="stepdefinations",dryRun=true,tags=""
	)
public class TestRunner 
{
	
}
