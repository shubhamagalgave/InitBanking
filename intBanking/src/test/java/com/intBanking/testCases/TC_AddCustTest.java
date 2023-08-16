package com.intBanking.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.intBanking.pageObjects.LoginPage;
import com.intBanking.pageObjects.addNewCustomer;

public class TC_AddCustTest extends BaseClass{
	
	@Test
	public void addCustomer() throws InterruptedException, AWTException, IOException
	{
		WebDriver driver=getDriver();
    	LoginPage login = new LoginPage(driver);
	    login.setUserName(username);
	    login.setPassWord(password);
	    login.clickOnLoginButton();
	    Thread.sleep(3000);
	    addNewCustomer add=new addNewCustomer(driver);
	    add.clickOnNewCustomer();//
	    Logger.info("clicked on new customer");
	    
	    Actions act=new Actions(driver);
	    Thread.sleep(5000);
	    doubleClick();
	    Thread.sleep(5000);
	    
	    add.setCustomerName("ShriSwamiSamarth");//
	    Logger.info("customer is entered");
	    
	    add.selectGender();//
	    
	    Logger.info("customer gender is selected");
	    Thread.sleep(3000);
	    add.setDateOfBirth("18/04/2023");
	    Logger.info("customer date of birth is entered");
	    Thread.sleep(3000);
	    add.setAddress("Akkalkot");
	    Logger.info("customer address is entered");
	    add.setCity("Solapur");
	    Logger.info("customer city is entered");
	    add.setState("Maharastra");
	    Logger.info("customer state is entered");
	    add.setPinCode("416410");
	    Logger.info("customer pincode is entered");
	    add.setPhoneNum("9762541234");
	    Logger.info("customer phone number is entered");
	    add.setEmail("ShriSwami@gmail.com");
	    Logger.info("customer email address is entered");
	    Thread.sleep(3000);
	    add.clickOnSubmitButton();
	    Logger.info("clicked on submit button");
	    Thread.sleep(3000);
	    boolean text=driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)");
	     if (text==true)
	     {
			System.out.println("valid");
			Logger.info("Test Case is passed");
		 }
	     else {
	    	 captureScreenShot(driver, "addScreenShot");
	    	 System.out.println("not valid");
	    	  Logger.info("Test Case is failed");
		}
	}

}
