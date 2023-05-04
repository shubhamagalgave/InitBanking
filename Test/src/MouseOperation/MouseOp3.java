package MouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/");
		driver.manage().window().maximize();
		
		
		//frame handling
		WebElement frame=driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		//create an instance of Actions class by passing required browser instance to its constructor
		Actions act=new Actions(driver);
		
		List<WebElement> sourceElements=driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target=driver.findElement(By.id("trash"));
	
		act.dragAndDrop(sourceElements.get(0), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceElements.get(1), target).build().perform();
		Thread.sleep(1000);
		act.dragAndDrop(sourceElements.get(2), target).build().perform();

		

	}

}
