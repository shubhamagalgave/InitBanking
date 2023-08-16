package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Test;

import com.intBanking.pageObjects.LoginPage;
import com.intBanking.pageObjects.NewAccount;

public class TC_NewAccTest extends BaseClass{
	
	@Test
	public void newAccount() throws IOException, InterruptedException
	{
		WebDriver driver=getDriver();
		LoginPage lp=new  LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickOnLoginButton();
		Thread.sleep(5000);
		
		NewAccount acc=new NewAccount(driver);
		acc.clickOnNewAccount();
		Logger.info("clicked on New Account");
		Thread.sleep(5000);
		doubleClick();
		Logger.info("double clicked on New Account page");
		Thread.sleep(5000);
		acc.setCustomerId("54345");
		Logger.info("customer id is entered");
		Thread.sleep(2000);
		acc.setAccountType("savings");
		Logger.info("Account type is selected");
		Thread.sleep(5000);
		acc.setInitialDeposit("5000");
		Logger.info("initial deposit id is entered");
		Thread.sleep(5000);
		acc.clickOnSubmit();
		Logger.info("clicked on submit");
		Thread.sleep(5000);
		
		if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)"))
		{
			AssertJUnit.assertTrue(true);
			Logger.info("Test case is passed");
		}
		else {
			captureScreenShot(driver, "newAccount");
			AssertJUnit.assertTrue(false);
			Logger.info("Test case is failes");
		
			
		}
	}

}
