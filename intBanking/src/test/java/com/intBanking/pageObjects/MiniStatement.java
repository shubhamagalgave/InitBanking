package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MiniStatement {
	
	WebDriver driver;
	public MiniStatement(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Mini Statement']")
	WebElement mini;
	
	@FindBy(xpath="//input[@name=\"accountno\"]")
	WebElement Accno;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnMiniStatementLink()
	{
		mini.click();
	}
	
	public void setAccountNumber(String acc)
	{
		Accno.sendKeys("65465465");
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	
	

}
