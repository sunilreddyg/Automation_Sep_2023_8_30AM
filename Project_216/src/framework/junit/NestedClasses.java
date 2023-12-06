package framework.junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NestedClasses 
{
	  @Nested
	    class FirstNestedClass 
	    {
	        @Test
	        void test() 
	        {
	            System.out.println("FirstNestedClass.test()");
	        }
	    }

	    @Nested
	    class SecondNestedClass 
	    {
	        @Test
	        void test() 
	        {
	            System.out.println("SecondNestedClass.test()");
	        }
	    }
}
