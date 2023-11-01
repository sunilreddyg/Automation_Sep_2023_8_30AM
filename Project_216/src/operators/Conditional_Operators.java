package mq.java.operators;

public class Conditional_Operators 
{

	public static void main(String[] args) 
	{
		
		/*
		 * 	Conditional operators
		 * 		== 	Equal to 					x == y 	
		 * 		!= 	Not equal 					x != y 	
		 * 		> 	Greater than 				x > y 	
		 * 		< 	Less than 					x < y 	
         * 		>= 	Greater than or equal to 	x >= y 	
         * 		<= 	Less than or equal to 		x <= y
         * 
         * 	Note:--> All conditional operators return boolean value
		 */
		
		
		int a=10;
		int b=20;
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(b>a);
		System.out.println(a<b);
		System.out.println(b<=20);
		System.out.println(a>=20);
		
		
		if(a>=10)
			System.out.println("--->true");
		
		
		//Check mobile number valid
		String mobile="9030248855";
		int len=mobile.length();
		System.out.println(len==10);
		if(len==10)
			System.out.println("valid mobile");
		else
			System.out.println("Invalid Mobile");
		
		/*
		 * Logical Operators
		 * 		
		 * 		&&  	Logical and 	Returns true if both statements are true 	
		 * 						x < 5 &&  x < 10 	
         *      ||  	Logical or 	    Returns true if one of the statements is true 	
         *      				x < 5 || x < 4 	
         *      ! 	   Logical not 	    Reverse the result, returns false if the result is true 	
         *      				!(x < 5 && x < 10)
		 */
		
		
		
		int age=19;
		boolean goodhealthis=false;
		
		//Condition with and comparision
		if(age>1 &&  goodhealthis==true)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
		
		
		
		//Condition with or comparision
		if(age<1 || goodhealthis==false)
		{
			System.out.println("Accept");
		}
		else
		{
			System.out.println("Reject");
		}
		
		
		//Not Condition
		if(!(age < 1  && goodhealthis==true))
		{
			System.out.println("Sending Report to  manager");
		}
		

	}

}
