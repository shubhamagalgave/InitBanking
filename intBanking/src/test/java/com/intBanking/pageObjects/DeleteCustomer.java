package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomer {

WebDriver driver;
	
	public DeleteCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()=\"Delete Customer\"]")
	WebElement deletetCustId;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement custId;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnDelete()
	{
		deletetCustId.click();
	}
	
	public void setCustId(String cust)
	{
		custId.sendKeys(cust);
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	
	}
