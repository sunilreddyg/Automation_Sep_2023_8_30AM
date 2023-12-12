package framework.testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {

  //invoke every @Test annoation before
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Test PreCondition");
  }

  //Invoke every @Test annotation after
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("Test PostCondition");
  }
  
  @Test
  public void f1() 
  {
	  Reporter.log("f1 executed",true);
  }
  
  @Test
  public void f2() 
  {
	  Reporter.log("f2 executed",true);
  }

}
