package InterviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions action = new Actions(driver);
		
		WebElement frame= driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id=\"draggable\"]/self::div")),driver.findElement(By.xpath("//div[@id=\"droppable\"]"))).build().perform();
		driver.close();
	}

}
