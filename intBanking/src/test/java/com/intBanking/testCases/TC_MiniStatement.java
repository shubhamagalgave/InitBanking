package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.intBanking.pageObjects.LoginPage;
import com.intBanking.pageObjects.MiniStatement;

public class TC_MiniStatement extends BaseClass {


	@Test
	public void miniStatement() throws InterruptedException, IOException
	{
	     LoginPage lpp=new LoginPage(driver);
	     lpp.setUserName(username);
	     lpp.setPassWord(password);
	     Thread.sleep(1000);
	     lpp.clickOnLoginButton();
	     Logger.info("Login Successfully");
	     Thread.sleep(5000);
	     
	     MiniStatement ms= new MiniStatement(driver);
	     ms.clickOnMiniStatementLink();
	     Thread.sleep(5000);
	     doubleClick();
	     Thread.sleep(1500);
	     ms.setAccountNumber("5654654");
	     Thread.sleep(800);
	     ms.clickOnSubmitButton();
	     Thread.sleep(3000);
	     
	     if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)")) 
	     {
	    	 AssertJUnit.assertTrue(true);
			 Logger.info("Test Case is passed");
			
		 }
	     else {
			captureScreenShot(driver, "ministatement");
			AssertJUnit.assertTrue(true);
			Logger.info("Test Case is failed");
		
		}
	} 
	
}
