package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBanking.pageObjects.EditCustomer;
import com.intBanking.pageObjects.LoginPage;

public class TC_EditCustTest extends BaseClass {
	
	@Test
	public void editCustId() throws InterruptedException, IOException
	{
		LoginPage log=new LoginPage(driver);
		log.setUserName(username);
		log.setPassWord(password);
		Thread.sleep(3000);
		log.clickOnLoginButton();
		
	    Logger.info("clicked on login button");
		EditCustomer ec = new EditCustomer(driver);
		Thread.sleep(3000);
		ec.clickOnEditCustomerLink();
		Logger.info("clicked on edit cust button");
		Thread.sleep(5000);
		doubleClick();
		Logger.info("double clicked on page");
		Thread.sleep(3000);
		ec.setCustId("545321");
		Logger.info("customer Id is entered");
		Thread.sleep(3000);
		ec.clickOnSubmitButton();
		Thread.sleep(3000);
		Logger.info("clicked on submit button");
		
		if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)")) 
		{
			AssertJUnit.assertTrue(true);
			Logger.info("Test case is successfully Passed");
		}
		else {
			captureScreenShot(driver, "editCustIdPage");
			AssertJUnit.assertTrue(false);
			Logger.info("Test case is  failed");
		}
	}

}
