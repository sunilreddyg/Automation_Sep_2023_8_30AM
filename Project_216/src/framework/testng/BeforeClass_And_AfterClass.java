package framework.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass 
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
 

  //invoke before execution of first @test annotation
  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("Class precondition");
  }

  //invoke after last @Test annotation
  @AfterClass
  public void afterClass() 
  {
	  System.out.println("Class Postcondition");
  }

}
