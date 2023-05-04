package com.intBanking.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	WebDriver driver;
	
	public  NewAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Account']")
	WebElement newAcc;
	
	@FindBy(xpath="//input[@name=\"cusid\"]")
	WebElement custId;
	
	@FindBy(xpath="//select[@name=\"selaccount\"]")
	WebElement accType;
	
	@FindBy(xpath="//input[@name=\"inideposit\"]")
	WebElement initialDeposit;
	
	@FindBy(xpath="//input[@name=\"button2\"]")
	WebElement  submit;
	
	public void clickOnNewAccount()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", newAcc);
	}
	
	public void setCustomerId(String cust)
	{
		custId.sendKeys(cust);
	}
	
	public void setAccountType(String acctype)
	{
		accType.click();
		Select select = new Select(accType);
		select.selectByVisibleText(acctype);
	}
	
	public void setInitialDeposit(String initDep)
	{
		initialDeposit.sendKeys(initDep);
	}
	
	public void clickOnSubmit()
	{
		submit.click();
	}
	
	
}
