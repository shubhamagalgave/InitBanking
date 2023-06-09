package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
//		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot)driver;
//		// capture screenshot as output type FILE

		File file = ts.getScreenshotAs(OutputType.FILE);
		try {
		// save the screenshot taken in destination path
		FileUtils.copyFile(file, new File("./dataFolder/ActitimePage.png"));
		} catch (IOException e) 
		{
		e.printStackTrace();
	}
		System.out.println("page screenshot is taken");
		}
	

		public void takeScreenShotOfThePage(WebDriver driver,String location) {
			// downcast the driver to access TakesScreenshot method
			TakesScreenshot ts = (TakesScreenshot) driver;
			// capture screenshot as output type FILE
			File file = ts.getScreenshotAs(OutputType.FILE);

			try {
				// save the screenshot taken in destination path
				FileUtils.copyFile(file, new File(location));
			} catch (IOException e) {
				e.printStackTrace();
			}

		



	}

}
