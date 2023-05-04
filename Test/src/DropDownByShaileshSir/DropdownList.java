package DropDownByShaileshSir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownList {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demosite.executeautomation.com/");		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.findElement(By.name("UserName")).sendKeys("execution");
	driver.findElement(By.name("Password")).sendKeys("admin");
	
	driver.findElement(By.cssSelector("input[value='Login']")).click();
	
	WebElement DropDownList = driver.findElement(By.id("TitleId"));
	
	Select select = new Select(DropDownList);
	System.out.println(select.isMultiple());
	
	List<WebElement> options = select.getOptions();
	System.out.println(options.size());
	for(int i=0;i<options.size();i++)
	{
		System.out.println(options.get(i).getText());
	}
	String s = select.getFirstSelectedOption().getTagName();
	System.out.println(s);
	//select.selectByValue("Mr.");
	select.selectByIndex(1);
	System.out.println(select.getFirstSelectedOption().getText());
	

	}

}
