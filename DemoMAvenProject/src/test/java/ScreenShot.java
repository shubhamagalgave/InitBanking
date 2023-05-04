import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot {
  @Test
  public void ScreenShot() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\src\\Executable\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
      
      TakesScreenshot ts = (TakesScreenshot)driver;
      File file = ts.getScreenshotAs(OutputType.FILE);
      
      TakesScreenshotOfThePage("./DemoMAvenProject/src/test/java/ScreeenShot"+driver.getTitle()+".jpg");
      
     
  }
