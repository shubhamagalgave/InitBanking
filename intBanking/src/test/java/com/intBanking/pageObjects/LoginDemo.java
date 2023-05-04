package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDemo {
	
	WebDriver driver;
	
	public LoginDemo(WebDriver driver)
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
	
	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}
	
	public void setPassWord(String pwd)
	{
		passWord.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		button.click();
	}



}
