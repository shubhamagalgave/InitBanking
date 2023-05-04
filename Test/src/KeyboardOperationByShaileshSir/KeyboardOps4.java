package KeyboardOperationByShaileshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement body = driver.findElement(By.xpath("//body"));
		body.sendKeys(Keys.ESCAPE);
		for(int i=0;i<2;i++) {
			Thread.sleep(100);
		body.sendKeys(Keys.PAGE_DOWN);
		}
		
		//identify the body use xpath e.g //body
		//use PAGE_DOWN mthod to scroll down
		
		
		

	}

}
