package framework.testng.DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Get_Testname 
{
	
	@DataProvider(name = "dp")
	public Object[][] createData(Method m) 
	{
	  System.out.println(m.getName());  
	  return new Object[][] { new Object[] { "Cedric" }};
	}
	 
	@Test(dataProvider = "dp")
	public void test1(String s) 
	{
		
	}
	 
	@Test(dataProvider = "dp")
	public void test2(String s) 
	{
		
	}


}
