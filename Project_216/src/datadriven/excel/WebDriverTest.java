package datadriven.excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest 
{
	
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static WebDriver driver;
	
	
	@Test
	public void loadpage()
	{
		driver.get(sht.getRow(1).getCell(1).getStringCellValue());
	}

	@BeforeAll
	public void readexcel() throws IOException
	{
		 //Target File
		 String filepath="TestData//InputData.xlsx";
		 FileInputStream fi=new FileInputStream(filepath);
		 System.out.println("File located");
		 
		 //Get Existing workbook using above location
		 book=new XSSFWorkbook(fi);
		 
		 //Target sheet using book reference
		sht=book.getSheet("config");
		
		String Browsername=sht.getRow(1).getCell(1).getStringCellValue();
		if(Browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(Browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
	}
}
