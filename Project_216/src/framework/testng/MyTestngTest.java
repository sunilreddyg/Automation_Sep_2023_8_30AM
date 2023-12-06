package framework.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngTest 
{
  @Test
  public void f1() 
  {
	  Reporter.log("f1 executed");
  }
  
  @Test
  public void f2() 
  {
	  Reporter.log("f2 executed");
  }
}
