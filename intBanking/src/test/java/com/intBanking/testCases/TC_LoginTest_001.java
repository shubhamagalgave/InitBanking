package com.intBanking.testCases;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;



import com.intBanking.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException, IOException {
		WebDriver driver=getDriver();
	
		LoginPage log= new LoginPage(driver);
	
		log.setUserName(username);
		Logger.info("username is entered");
		
		Thread.sleep(3000);
		log.setPassWord(password);
		Logger.info("password is entered");
		
		Thread.sleep(3000);
		log.clickOnLoginButton();
		
		//driver.switchTo().alert().accept();
		Thread.sleep(3000);
		String t=driver.getTitle();
		System.out.println(t);
		if (driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			///Assert.assertTrue(true);
			System.out.println("TC validation Successfully");
			Logger.info("Login Test is passed");
		}
		else {
			captureScreenShot(driver, "loginTest");
			System.out.println("TC validation failed");
			///Assert.assertTrue(false);
			Logger.info("Login Test is failed");
		}
	}
}
