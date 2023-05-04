package ExcelOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScreept {

	public static void main(String[] args) throws Exception {
		
				System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\ApachePoi\\brouser\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();	
				driver.get("https://demo.actitime.com/login.do");
				driver.manage().window().maximize();
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				//driver.findElement(By.id("username")).sendKeys("admin");
				js.executeScript("document.getElementById('username').value='admin'");
				
				//js.executeScript("document.getElementByName('pwd').value='manager'");
				
				driver.findElement(By.name("pwd")).sendKeys("manager");
				
				js.executeScript("document.getElementById('loginButton').click();");
				
				Thread.sleep(2000);
				js.executeScript("document.getElementById('logoutLink').click();");
			}
	}


