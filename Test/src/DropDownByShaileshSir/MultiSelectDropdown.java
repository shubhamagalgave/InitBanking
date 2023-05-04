package DropDownByShaileshSir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");	
		driver.switchTo().frame("iframeResult");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement Dropdowon=driver.findElement(By.name("cars"));
		
		Select select = new Select(Dropdowon);
		System.out.println(select.isMultiple());
		
		List<WebElement> options=select.getOptions();
		System.out.println(options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		select.selectByIndex(1);
	//	select.selectByValue("ope1");
		select.selectByValue("Volvo");

		List<WebElement> opt =select.getAllSelectedOptions();
		System.out.println(opt.size());
		for(int i=0;i<opt.size();i++)
		{
			System.out.println(opt.get(i).getText());
		}
		//op6: unselecting the selected options
		//s1.deselectByVisibleText("Volvo"); //or
		//s1.deselectByValue("html");//or
		//s1.deselectByIndex(7);
		//s1.deselectAll();		
		
		//close current instance of browser
		driver.close();				

	}

}
