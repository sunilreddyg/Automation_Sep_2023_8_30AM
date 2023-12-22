package datadriven.excel.Keywords;

public class GetExcel_with_Keywords {

	public static void main(String[] args) 
	{
		
		Excel.getexcel("InputData.xlsx", "config");
		String Data=Excel.getCellData(1, 1);
		System.out.println(Data);

		Excel.getexcel("InputData.xlsx", "celldata");
		String val=Excel.getCellData(0, 0);
		System.out.println(val);
		
		
	}

}
