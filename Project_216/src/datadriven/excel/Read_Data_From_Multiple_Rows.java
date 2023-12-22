package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data_From_Multiple_Rows {

	public static void main(String[] args) throws IOException {
		
		//Target file from local system
		FileInputStream fi=new FileInputStream("TestData\\InputData.xlsx");
		System.out.println("File located");
		
		//Get Workbook access
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Get sheet using book reference
		XSSFSheet sht=book.getSheet("multiplerows");
		
		
		//Get first and Last Row numbers of Data availability
		int Frnum=sht.getFirstRowNum();
		System.out.println("Data Started at row number:--> "+Frnum);
		
		int Lrnum=sht.getLastRowNum();
		System.out.println("Data Ended at row number:--> "+Lrnum);

		for (int i = Frnum+1; i <=Lrnum; i++) 
		{
			 String UID=sht.getRow(i).getCell(0).getStringCellValue();
			 String PWD=sht.getRow(i).getCell(1).getStringCellValue();
			 System.out.println(UID+"   "+PWD);
		}
		
	}

}
