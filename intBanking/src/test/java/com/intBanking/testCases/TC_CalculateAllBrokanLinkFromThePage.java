package com.intBanking.testCases;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.intBanking.pageObjects.LoginPage;

public class TC_CalculateAllBrokanLinkFromThePage extends BaseClass {
	
	@Test
	public void brokenLink() throws InterruptedException
	{
		WebDriver driver=getDriver();
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickOnLoginButton();
		Thread.sleep(5000);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i <links.size(); i++) 
		{
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			
		  try {
		  URL link =new URL(url);
		  HttpURLConnection http=(HttpURLConnection)link.openConnection();
		  Thread.sleep(1200);
		  http.connect();
		  
		 int responsecode= http.getResponseCode();
		 
		 if (responsecode>=400)
		 {
			System.out.println(i+"link is  broken :"+url);
		 }
		 else 
		 {
			 System.out.println(i+"link is  not broken :"+url);
		 }
		 }
		  catch (Exception e) {
			
		}
		
		 
		    
				
		
				
	       
			
			
		}
		
		
	}
	

}
