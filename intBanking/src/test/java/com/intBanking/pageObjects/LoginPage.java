package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	 WebDriver driver;
	
	 public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement userName;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement passWord;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement button;
	
	
	
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setPassWord(String pass)
	{
		passWord.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		button.click();
	}
	
	

}
