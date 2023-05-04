package TakeScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1265 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		TakesScreenshot ts1 = (TakesScreenshot)driver;
		File file1 = ts1.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(file1, new File("./dataFolder/Actitimepage1.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("page screenshot is taken");
		driver.close();

	}

}
