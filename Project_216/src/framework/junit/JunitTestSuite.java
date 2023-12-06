package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses
			({ 
				IgnoreAllTest.class, 
				Junit_Assertions.class,
				Junit_WebDriverTest.class 
			})
public class JunitTestSuite 
{

}
