package mq.java.conditions;

public class IF_StateMent 
{

	public static void main(String[] args) 
	{
		
		/*
		 * IF:--> 
		 * 		if a single decision statement. On True
		 * 		Condition It execute specific block of code
		 */
		
	
		System.out.println("Statement1");
		
		
		int a=19;
		if (a > 18)   // GreaterThan is a operator return boolean value
		{
			System.out.println("Statement2");
		}
		
		//This Decision accept only when age value meet 18
		if (a == 18) 
		{
			System.out.println("Age is Equal");
		}
		
		
		//if Condition using single statement
		double price=120.25;
		if(price < 100)
			System.out.println("New Prices");
		
		
		

	}

}
