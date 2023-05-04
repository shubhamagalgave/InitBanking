package InterviewPreparation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestListenerAdapter;

public class CaptureScreenShot{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//capturing screenshot
		
		TakesScreenshot tcr=(TakesScreenshot) driver;
		File src =tcr.getScreenshotAs(OutputType.FILE);
		File trg =new File(".\\screenshot\\homepage.png");
		FileUtils.copyFile(src, trg);
	
		
		//screenshot of section/portion of page
		/****
		WebElement section=driver.findElement(By.xpath("(//div[@class=\"a-cardui fluid-quad-card fluid-card fluid-quad-image-label fluid-quad-image-label\"])[1]"));
		File src =section.getScreenshotAs(OutputType.FILE);
		File trg =new File(".\\screenshot\\homepage1.png");
		FileUtils.copyFile(src, trg);
		***/
		
		//driver.close();
		
	}

}
