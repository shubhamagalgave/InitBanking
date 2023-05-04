package HandleAlertByShaileshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//WebElement but = driver.findElement(By.id("alertButton"));
	 //	but.click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		//WebElement but1 = driver.findElement(By.id("timerAlertButton"));
	//	but1.click();
		//Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		//driver.findElement(By.id("promtButton")).click();
	//	driver.switchTo().alert().sendKeys("Belive in yourself");
	//	driver.switchTo().alert().accept();
	//	driver.close();
		

	}

}
