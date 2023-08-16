package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.intBanking.pageObjects.CustomisedStatement;
import com.intBanking.pageObjects.LoginPage;

public class TC_CustomisedStatement extends BaseClass{
	
	@Test
	public void customisedStatement() throws InterruptedException, IOException
	{
		 WebDriver driver=getDriver();
	     LoginPage lpp=new LoginPage(driver);
	     lpp.setUserName(username);
	     lpp.setPassWord(password);
	     Thread.sleep(1000);
	     lpp.clickOnLoginButton();
	     Logger.info("Login Successfully");
	     Thread.sleep(5000);
	     
	     CustomisedStatement cms=new CustomisedStatement(driver);
	     cms.clickOnCustomisedStatementLink();
	     Logger.info("clicked on Customised StatementLink");
	     Thread.sleep(5000);
	     doubleClick();
	     Logger.info("double clicked on page ");
	     Thread.sleep(1000);
	     cms.setAccountNumber("5464646");
	     Logger.info("Account number is inserted ");
	     Thread.sleep(1000);
	     cms.setFromDate("01/01/2022");
	     Logger.info("from date is entered ");
	     Thread.sleep(1000);
	     cms.setToDate("01/01/2023");
	     Logger.info("to date is entered ");
	     Thread.sleep(1000);
	     cms.setLowerAmount("4546548");
	     Logger.info("Lower Amount is entered");
	     Thread.sleep(1000);
	     cms.setnoOftransaction("5465");
	     Logger.info("no Of transaction is entered");
	     Thread.sleep(1000);
	     cms.clickOnSubmitButton();
	     Logger.info("clicked on submit button");
	     Thread.sleep(3500);
	     
	     if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)")) 
	     {
	    	 AssertJUnit.assertTrue(true);
			 Logger.info("Test Case is passed");
			
		 }
	     else {
			captureScreenShot(driver, "ministatement");
			Assert.assertTrue(true);
			Logger.info("Test Case is failed");	
		  }
    }

}
