package DropDownByShaileshSir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement skill = driver.findElement(By.id("Skills"));
		Select sel = new Select(skill);
		System.out.println(sel.isMultiple());
		
		System.out.println(sel.getFirstSelectedOption().getText());
		List<WebElement> option=sel.getOptions();
		for(int i=0;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
		
		//select options from dropdown
		sel.selectByIndex(4);
				//or
		sel.selectByValue("Backup Management");
				//or
		sel.selectByVisibleText("Analytics");
		
		driver.close();

		
		
	}

}
