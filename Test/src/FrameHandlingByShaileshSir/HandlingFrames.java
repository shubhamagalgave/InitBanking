package FrameHandlingByShaileshSir;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frame = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(frame);
		Actions act = new Actions(driver);
	//	WebElement source = driver.findElement(By.id("draggable"));
	//	WebElement dest = driver.findElement(By.id("droppable"));
		
		//act.dragAndDrop(source, dest).build().perform();
		driver.close();
	//	driver.switchTo().defaultContent();
	//	driver.findElement(By.cssSelector(".logo>a")).click();
	//	driver.close();

		
		

	}

}
