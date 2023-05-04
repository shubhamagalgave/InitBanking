package TestNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG2 {
	@Test
	public void TestCase2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\src\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.cssSelector("a[id='loginButton'] div")).click();
		
		String login = driver.getTitle();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logoutLink")).click();
		//String logout = driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login"); //or
		
		driver.close();

		

		
	}

}
