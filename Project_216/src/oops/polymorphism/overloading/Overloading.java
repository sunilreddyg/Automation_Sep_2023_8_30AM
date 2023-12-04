package oops.polymorphism.overloading;

public class Overloading
{
	//Method without paramter
	public void print_product()
	{
		System.out.println("Iphone");
	}
	
	//Overloading method with double paramter
	public void print_product(double price)
	{
		System.out.println("Iphone"+"     "+price);
	}
	
	//Overloading method with String,double paramter
	public void print_product(String color, double price)
	{
		System.out.println("Iphone"+"   "+color+"     "+price);
	}
	
	//Overloading method with double paramter
	public void print_product(double price, String color)
	{
		System.out.println("Iphone"+"   "+price+"     "+color);
	}
	

	public static void main(String[] args)
	{
		Overloading obj=new Overloading();
		obj.print_product();
		obj.print_product(100000.00);
		obj.print_product("Blue", 150000.00);
		obj.print_product(230000.00, "Red");

	}

}
