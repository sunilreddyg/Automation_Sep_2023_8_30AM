package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Numeric_Value {

	public static void main(String[] args) throws Exception {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("celldata");
		
		//Target using sheet Reference
		XSSFRow row=sht.getRow(0);
		
		//GetNumricCellvalue method by default read numer into double format
		double num=row.getCell(0).getNumericCellValue();
		if(num==100)
			System.out.println("pass");
		else
			System.out.println("Fail");
		
		//Convert Numeric value to String
		String Val=NumberToTextConverter.toText(num);
		if(Val.equals("100"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
		//Reading Second cell data [By Default GetNumricellvalue read in double format]
		double price=sht.getRow(0).getCell(1).getNumericCellValue();
		System.out.println(price);
		
		

	}

}
