package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM1 {
	
	@Test
	public void HRM() throws InterruptedException
	{
	 System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workspace\\Myfiles\\executable\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/");
     driver.manage().window().maximize();
     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
     driver.findElement(By.id("txtPassword")).sendKeys("admin123");
     driver.findElement(By.id("btnLogin")).click();
     Thread.sleep(1000);
     
     Assert.assertEquals(driver.getTitle(), "OrangeHRM");
     //driver.close();
}
}
