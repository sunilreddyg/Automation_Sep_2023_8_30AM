package framework.testng.DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp",enabled=false)
  public void test(String phonename,double price) 
  {
	  System.out.println(phonename+"   "+price);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"iphone",50000.00 },
      new Object[] {"samsung",45000.00 },
      new Object[] {"vivo",35000.00 },
      new Object[] {"oppo",25000.00 },
    };
  }
  
  
  @Test(dataProvider="login")
  public void verifylogin(String UID,String PWD)
  {
	  System.out.println(UID+"   "+PWD);
  }
  
  //To Use Dataprovider data from differnt class
  //We should declare with static specifier
  @DataProvider
  public static Object[][] login() 
  {
    return new Object[][] 
    {
      new Object[] {"arun1","arun@1231" },
      new Object[] {"arun2","arun@1232" },
      new Object[] {"arun3","arun@1233" },
      new Object[] {"arun4","arun@1234" },
    };
  }
}
