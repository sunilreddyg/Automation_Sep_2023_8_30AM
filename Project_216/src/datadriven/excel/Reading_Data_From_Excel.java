package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Data_From_Excel {

	public static void main(String[] args) throws IOException 
	{
		
		/*
		 * Because excel is binary file, due to the reason
		 * we should read data using [fileinputstream] class
		 */
		
		 //Target File
		 String filepath="TestData//InputData.xlsx";
		 FileInputStream fi=new FileInputStream(filepath);
		 System.out.println("File located");
		 
		 //Get Existing workbook using above location
		 XSSFWorkbook book=new XSSFWorkbook(fi);
		 
		 //Target sheet using book reference
		 XSSFSheet sht=book.getSheet("config");
		 
		 //Target row using above sheet referene
		 XSSFRow row=sht.getRow(1);
		 
		 //Using row reference tartet cell
		 XSSFCell cell=row.getCell(0);
		 
		 //Read chracters from cell
		 String Browser=cell.getStringCellValue();
		 System.out.println(Browser);
		 
		 //Using Row reference read data
		 String URL=row.getCell(1).getStringCellValue();
		 System.out.println(URL);
		 
		 //Using Sheet reference read data
		 String title=sht.getRow(1).getCell(2).getStringCellValue();
		 System.out.println(title);
		 
		 
	}

}
