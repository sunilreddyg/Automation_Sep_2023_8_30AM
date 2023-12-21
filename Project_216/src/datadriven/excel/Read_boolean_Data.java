package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_boolean_Data {

	public static void main(String[] args) throws IOException {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("celldata");
		
		//Target using sheet Reference
		XSSFRow row=sht.getRow(0);
		
		boolean flag=row.getCell(2).getBooleanCellValue();
		if(flag==true)
			System.out.println("match found");
		else
			System.out.println("No match found");
		
		//Convert Boolean value into string format
		//AutoBoxing [Converting Primitive to non primitive]
		String val=new Boolean(flag).toString();
		if(val.equals("true"))
			System.out.println("pass");
		else
			System.out.println("fail");
	}

}
