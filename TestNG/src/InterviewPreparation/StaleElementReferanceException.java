package InterviewPreparation;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferanceException {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		WebElement l1 = driver.findElement(By.xpath("//a[normalize-space()='YouTube Videos']"));
		l1.click();
		Thread.sleep(3000);
		WebElement l2 = driver.findElement(By.xpath("//a[@href=\"https://youtube.com/playlist?list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7\"]"));
		l2.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		try
		{
			l1.click();
			l2.click();
		}
		catch(StaleElementReferenceException e)
		{
			Thread.sleep(3000);
		    l1 = driver.findElement(By.xpath("//a[normalize-space()='YouTube Videos']"));
			l1.click();
			Thread.sleep(3000);
			l2 = driver.findElement(By.xpath("//a[@href=\"https://youtube.com/playlist?list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7\"]"));
			l2.click();
			
		}
		
		driver.close();

		
		
		
		
		
		

	}

}
