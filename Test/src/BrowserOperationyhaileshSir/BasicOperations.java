package BrowserOperationyhaileshSir;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		//Navigation in browser
		Thread.sleep(2000);
		//go to previous page
		driver.navigate().back();
		Thread.sleep(2000);
		// next page
		driver.navigate().forward();
		Thread.sleep(2000);
		//reload or refresh current page
		driver.navigate().refresh();
		Thread.sleep(2000);
		//jump from current page to another page or URL
		driver.navigate().to("https://www.amazon.in/");
		// close current instance of browser
		driver.close();

	}

}
