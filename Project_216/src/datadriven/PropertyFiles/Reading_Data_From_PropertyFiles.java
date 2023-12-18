package datadriven.PropertyFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Reading_Data_From_PropertyFiles 
{

	public static void main(String[] args) throws IOException 
	{
		
		//target file location
		String filepath="src\\datadriven\\PropertyFiles\\input.properties";
		FileInputStream fi=new FileInputStream(filepath);
		System.out.println("file is located");
		
		//Create class object for property files
		Properties obj=new Properties();
		//Load fileinput data into repository
		obj.load(fi);
		
		
		//Get Propertyvalue using propery key
		String UID=obj.getProperty("username");
		System.out.println(UID);
		
		String PWD=obj.getProperty("password");
		System.out.println(PWD);
	}

}
