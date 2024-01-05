package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources\\features\\example_tags.feature"
,glue="stepdefinations",tags= "@reg1")
public class RunTags 
{
	

}
