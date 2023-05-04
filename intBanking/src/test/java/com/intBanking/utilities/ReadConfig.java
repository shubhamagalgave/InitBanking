package com.intBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	public Properties prop;
	
	public  ReadConfig() 
	{
		File src= new File("./Configuration/config.properties");
		try {
		FileInputStream file=new FileInputStream(src);
		prop=new Properties();
		prop.load(file);
			
		} catch (Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	public String getBaseUrl()
	{
		String url=prop.getProperty("baseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String user=prop.getProperty("username");
		return user;
	}
	
	public String getPassWord()
	{
		String pass=prop.getProperty("password");
		return pass;	
	}
	
	public String getChromePath()
	{
		String chrome=prop.getProperty("chromepath");
		return chrome;	
	}
	
	public String getFireFoxPath()
	{
		String gecko=prop.getProperty("firefoxpath");
		return gecko;
	}
	
	
	
	}

