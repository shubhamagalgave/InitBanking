package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addNewCustomer {
	
	 WebDriver driver;
		
	 public addNewCustomer(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	 
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement custName;
	
	@FindBy(xpath="//input[@name=\"rad1\"]")
	WebElement gender;
	
	@FindBy(xpath="//input[@type=\"date\"]")
	WebElement birthDate;
	
	
	@FindBy(xpath="//textarea[@name=\"addr\"]")
	WebElement address;
	
	@FindBy(xpath="//input[@name=\"city\"]")
	WebElement cityName;
	
	@FindBy(xpath="//input[@name=\"state\"]")
	WebElement stateName;
	
	@FindBy(xpath="//input[@name=\"pinno\"]")
	WebElement pinCode;
	
	@FindBy(xpath="//input[@name=\"telephoneno\"]")
	WebElement phonNum;
	
	@FindBy(xpath="//input[@name=\"emailid\"]")
	WebElement emailId;
	
	@FindBy(xpath="//input[@name=\"sub\"]")
	WebElement submitButton;
	
	public void clickOnNewCustomer()
	{
		newCustomer.click();
	}
	
	
	public void setCustomerName(String cust)
	{
		custName.sendKeys(cust);
	}
	
	public void selectGender()
	{
		gender.click();
	}
	
	public void setDateOfBirth(String date)
	{
		birthDate.sendKeys(date);
	}
	
	public void setAddress(String add)
	{
		address.sendKeys(add);
	}
	
	public void setCity(String city)
	{
		cityName.sendKeys(city);
	}
	
	public void setState(String state)
	{
		stateName.sendKeys(state);
	}
	
	public void setPinCode(String pin)
	{
		pinCode.sendKeys(pin);
	}
	

	public void setPhoneNum(String phone)
	{
		phonNum.sendKeys(phone);
	}
	
	public void setEmail(String email)
	{
		emailId.sendKeys(email);
	}
	
	public void clickOnSubmitButton()
	{
		submitButton.click();
	}
}
