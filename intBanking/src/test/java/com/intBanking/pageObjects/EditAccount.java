package com.intBanking.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.intBanking.testCases.BaseClass;

public class EditAccount {

	WebDriver driver;
	
	public EditAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Edit Account']")
	WebElement editAcc;
	
	@FindBy(xpath="//input[@name=\"accountno\"]")
	WebElement accNum;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnEditAccount()
	{
		BaseClass.clickByJSExecutor(editAcc);
	}
	public void setAccountNumber(String accnum)
	{
		accNum.sendKeys("5416");
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	
	
}
