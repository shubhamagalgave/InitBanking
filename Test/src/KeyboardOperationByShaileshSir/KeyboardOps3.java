package KeyboardOperationByShaileshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardOps3{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		//type first name as admin and use ctrl+a

		first.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in first name field use ctrl+c

		first.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		WebElement last =driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		//in last name field use ctrl+v

		last.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		

	}

}
