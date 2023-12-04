package oops.Encapsulation;

import java.util.Date;

public class Encaps 
{
	
	private String name;
	private String password;
	public String emid="MQ001";
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
		System.out.println("user--> "+name+" --->Logged in at --> "+new Date().toString());
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	

}
