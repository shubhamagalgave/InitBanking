package com.intBanking.pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount {
	WebDriver driver;
	public DeleteAccount(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Delete Account']")
	WebElement deleteAcc;
	
	@FindBy(xpath="//input[@name=\"accountno\"]")
	WebElement Accno;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	WebElement submit;
	
	public void clickOnDeleteAccountLink()
	{
		deleteAcc.click();
	}
	
	public void setAccountNumber(String accNum)
	{
		Accno.sendKeys("5465464656");
	}
	
	public void clickOnSubmitButton()
	{
		submit.click();
	}



}
