package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer {
	WebDriver driver;
	
	public EditCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Edit Customer']")
	WebElement editCustId;
	
	@FindBy(xpath="//input[@name=\"cusid\"]")
	WebElement custId;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnEditCustomerLink()
	{
		editCustId.click();
	}
	
	public void setCustId(String custid)
	{
		custId.sendKeys(custid);
	}
	
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	
	

}
