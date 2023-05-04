package KeyboardOperationByShaileshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		try 
		{
			WebElement body = driver.findElement(By.xpath("//body"));
			body.sendKeys(Keys.ESCAPE);
			
		}
		catch(Exception e)
		{
			
		}
		Thread.sleep(1500);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		driver.close();
		
		/**
		 * possible ways to refresh the browser:
		 * 1. driver.navigate().refresh();
		 * 2. sendKeys(Keys.F5)
		 * 3. by hitting same URL again
		 * 4. ctrl+R
		 */


	}

}
