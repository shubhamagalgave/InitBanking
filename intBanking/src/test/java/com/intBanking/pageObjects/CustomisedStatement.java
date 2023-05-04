package com.intBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomisedStatement {

	
	WebDriver driver;
	public CustomisedStatement(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Customised Statement']")
	WebElement customised;
	
	@FindBy(xpath="//input[@name=\"accountno\"]")
	WebElement Accno;
	
	@FindBy(xpath="(//input[@type=\"date\"])[1]")
	WebElement fromeDate;
	
	@FindBy(xpath="(//input[@type=\"date\"])[2]")
	WebElement toDate;
	
	@FindBy(xpath="//input[@name=\"loweramt\"]")
	WebElement amountLowLimit;
	
	@FindBy(xpath="//input[@name=\"tranno\"]")
	WebElement noOfTransaction;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnCustomisedStatementLink()
	{
		customised.click();
	}
	
	public void setAccountNumber(String acc)
	{
		Accno.sendKeys(acc);
	}
	
	public void setFromDate(String fdate)
	{
		fromeDate.sendKeys(fdate);
	}
	
	public void setToDate(String tdate)
	{
		toDate.sendKeys(tdate);
	}
	
	public void setLowerAmount(String amo)
	{
		amountLowLimit.sendKeys(amo);
	}
	
	public void setnoOftransaction(String trns)
	{
		noOfTransaction.sendKeys(trns);
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}
	
	


	
	
}
