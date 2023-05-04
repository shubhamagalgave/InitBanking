package Page1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchBoxSuggetion {

	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//ul[@class=\"G43f7e\"]//li")
	List<WebElement> links; 
	
	WebDriver driver;
	public GoogleSearchBoxSuggetion(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchBox(String location)
	{
		searchBox.sendKeys(location);
	}
	
	public void allLinkinkName()
	{
		int total =links.size();
		System.out.println(total);
		for (int i = total-2; i < total; i++) 
		{
			try {
			links.get(i).click();
			}catch (Exception e) {
				
			}
	
		}
	}

}
