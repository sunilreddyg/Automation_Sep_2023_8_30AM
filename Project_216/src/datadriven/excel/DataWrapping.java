package datadriven.excel;

public class DataWrapping {

	public static void main(String[] args) {
	
		/*
		 * DataWarpping:-->
		 * 		AutoBoxing
		 * 		Unboxing
		 */
		
		int a=10;
		Integer x=new Integer(a);  //AutoBoxing [Converting immutable to mutable]
		String val=x.toString();
		System.out.println(val.equals("10"));
		
		//Unboxing  [Changing mutable to immutable]
		Double d=new Double(12000.00);
		double price=d;  //immutable
		
		//Converting String value to integer
		String data="100";
		int newdata=Integer.parseInt(data);
		System.out.println(newdata);
		
	}

}
