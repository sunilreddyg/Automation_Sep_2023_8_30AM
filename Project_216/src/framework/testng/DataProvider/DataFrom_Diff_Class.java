package framework.testng.DataProvider;

import org.testng.annotations.Test;

public class DataFrom_Diff_Class 
{
	
	//To Read data from different class we should use dataprovider classname aswell
	@Test(dataProvider="login",dataProviderClass=InputData.class)
	public void testlogin(String UID,String PWD)
	{
		
	}

}
