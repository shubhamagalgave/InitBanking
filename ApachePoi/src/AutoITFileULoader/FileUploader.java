package AutoITFileULoader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FileUploader {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\ApachePoi\\brouser\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/upload");
		  driver.manage().window().maximize();
		  
		  WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
		  
	 button.sendKeys("C:\\Users\\Basvaraj\\Desktop");
	  

	}

}
