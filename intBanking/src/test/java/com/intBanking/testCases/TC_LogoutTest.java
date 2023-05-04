package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Test;

import com.intBanking.pageObjects.LogOutPage;
import com.intBanking.pageObjects.LoginPage;

public class TC_LogoutTest extends BaseClass {
	@Test
	public void logout() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassWord(password);
		lp.clickOnLoginButton();
		Thread.sleep(5000);
		Logger.info("login successfully");
		
		LogOutPage logo= new LogOutPage(driver);
		logo.clickOnLogoutButton();
		Logger.info("clicked on logout link");
		Thread.sleep(5000);
		
		
		if (isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();
			Logger.info("logout successfully passed");
		}
		else {
			captureScreenShot(driver, "Logout");
			Logger.info("logout failed");
		}
		
		
	}

	private static boolean isAlertPresent()
	{
		try {
		      driver.switchTo().alert();
		      return true;
		}catch(Exception e)
		{
			return false;
		}
		
	}

}
