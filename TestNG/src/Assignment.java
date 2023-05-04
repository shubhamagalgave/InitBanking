import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNGByShaileshSir\\Browser\\driver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sur.ly/o/demowebshop.tricentis.com/AA000014?pageviewId=desktop-302e343737383734303020313637393132353836352032313137363533393339");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("site_iframe");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
			
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys("planittest78@gmail.com");;
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys("123456");;
		driver.findElement(By.xpath("//input[@name=\"RememberMe\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
	

	}

}
