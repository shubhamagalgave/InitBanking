package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.annotations.Test;

import com.intBanking.pageObjects.EditAccount;
import com.intBanking.pageObjects.LoginPage;

public class TC_EditAccountTest extends BaseClass{
	
	@Test
	public void editAccount() throws InterruptedException, IOException
	{
		LoginPage pl=new LoginPage(driver);
		pl.setUserName(username);
		pl.setPassWord(password);
		pl.clickOnLoginButton();
		Logger.info("User Successfully loggedin");
		Thread.sleep(3000);
		
		EditAccount ea=new EditAccount(driver);
		ea.clickOnEditAccount();
		Logger.info("clicked on edit Account link");
		Thread.sleep(3000);
		doubleClick();
		Logger.info("double clicked on page");
		Thread.sleep(3000);
		ea.setAccountNumber("5146541");
		Thread.sleep(800);
		Logger.info("Account number is entered");
		ea.clickOnSubmitButton();
		Logger.info("clicked on  submit button");
		Thread.sleep(4000);
		
		if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)"))
		{
			AssertJUnit.assertTrue(true);
			Logger.info("Test case is passed");
		}
		else {
			captureScreenShot(driver, "editAccount");
			AssertJUnit.assertTrue(false);
			Logger.info("Test case is failed");
			
		}
	}

}
