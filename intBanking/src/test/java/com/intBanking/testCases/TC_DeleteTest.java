package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBanking.pageObjects.DeleteCustomer;
import com.intBanking.pageObjects.LoginPage;

public class TC_DeleteTest extends BaseClass {
	
	@Test
	public void deleteCustomer() throws InterruptedException, IOException
	{
		WebDriver driver=getDriver();
		LoginPage lo=new LoginPage(driver);
		lo.setUserName(username);
		lo.setPassWord(password);
		Thread.sleep(1500);
		lo.clickOnLoginButton();
		Thread.sleep(5000);
		
		DeleteCustomer dc= new DeleteCustomer(driver);
		dc.clickOnDelete();
		Logger.info("successfully clicked on delete button");
		Thread.sleep(5000);
		doubleClick();
		Logger.info("double clicked on  page");
		Thread.sleep(5000);
		dc.setCustId("4564");
		Logger.info("customer id is entered");
		Thread.sleep(1500);
		dc.clickOnSubmitButton();
		Logger.info("successfully clicked on submit button");
		Thread.sleep(5000);
		
		if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)"))
		{
			AssertJUnit.assertTrue(true);
			Logger.info("Test Case is passed");
		}
		else {
			captureScreenShot(driver, "deleteCustomer");
			AssertJUnit.assertTrue(false);
			Logger.info("Test Case is failed");
		
		}
		
		
	}
	
	

}
