package AutoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploader {
  @Test
  public void File() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\ApachePoi\\brouser\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("‪‪C:\\Users\\Basvaraj\\Downloads\\DT20222658246_Application.pdf");
  }
}
