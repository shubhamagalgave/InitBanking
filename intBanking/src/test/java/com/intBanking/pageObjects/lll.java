package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lll {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement userName;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement passWord;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement button;
	
	@FindBy(xpath="//a[text()='Log out']")
	WebElement logOutButton;
	
	
	public lll(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setPassWord(String pass)
	{
		userName.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		button.click();
	}
	
	public void clickOnLogoutButton()
	{
		logOutButton.click();
	}
	

}
