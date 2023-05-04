package DropDownByShaileshSir;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.id("bsd2-button"));
		Thread.sleep(2000);
		drop.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"bsd2-container\"]/div[2]"));
		for(int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		

	}

}
