package com.intBanking.testCases;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import org.testng.annotations.Test;
import com.intBanking.pageObjects.DeleteAccount;
import com.intBanking.pageObjects.LoginPage;


public class TC_DeleteAccountTest extends BaseClass{
	
	@Test
	public void deleteAccount() throws IOException, InterruptedException
	{
		LoginPage lpp=new LoginPage(driver);
		lpp.setUserName(username);
		lpp.setPassWord(password);
		Thread.sleep(1000);
		lpp.clickOnLoginButton();
		Logger.info("Logein Successfully");
		Thread.sleep(5000);
		
		DeleteAccount da = new DeleteAccount(driver);
		da.clickOnDeleteAccountLink();
		Logger.info("clicked on delete account Successfully");
		Thread.sleep(3500);
		doubleClick();
		Thread.sleep(1500);
		da.setAccountNumber("46546456");
		Logger.info("Account number inserted successfully");
		Thread.sleep(1000);
		da.clickOnSubmitButton();
		Logger.info("clicked on submit button Successfully");
		Thread.sleep(5000);
		
		if (driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)"))
		{
			AssertJUnit.assertTrue(true);
			Logger.info("Test Case Successfully passed");
		}
		else {
			captureScreenShot(driver, "deleteAccount");
			AssertJUnit.assertTrue(false);
			Logger.info("Test Case  failed");
		}
		
	}

}
