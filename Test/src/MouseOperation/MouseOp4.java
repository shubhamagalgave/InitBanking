package MouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOp4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		/* Instance of Action Class */
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		WebElement userNameInputField=driver.findElement(By.name("firstname"));
		userNameInputField.sendKeys("admin");
		//userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"a"));
				//or
		action.doubleClick(userNameInputField).perform();
		userNameInputField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

		

	}

}
