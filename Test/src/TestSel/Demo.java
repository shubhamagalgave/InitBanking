package TestSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
       
        
        WebElement s2 = driver.findElement(By.name("username"));
        s2.sendKeys("admin");
        
        driver.findElement(By.name("pwd")).sendKeys("manager");
        
        driver.findElement(By.id("loginButtonContainer")).click();
        
        Thread.sleep(2000);
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
       // System.out.println(driver.getPageSource());
        
        
		
	}

}
