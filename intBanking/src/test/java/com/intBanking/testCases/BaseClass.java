package com.intBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.intBanking.utilities.ReadConfig;

public class BaseClass {
	
	    ReadConfig readconfig=new ReadConfig();
		
		public String baseUrl=readconfig.getBaseUrl();
		public String username=readconfig.getUserName();
		public String password=readconfig.getPassWord();
		public String chromepath=readconfig.getChromePath();
        public static Logger Logger;
        public static WebDriver driver;
        
        @Parameters("browser")
		@BeforeClass
		public void setup(String browser)
		{
		    Logger=Logger.getLogger("ebanking");
			//PropertyConfigurator.configure("Log4j.properties");
			DOMConfigurator.configure("Log4j.xml");
			
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				driver=new ChromeDriver();
			 }
			else if (browser.equalsIgnoreCase("firefox")){
				System.setProperty("webdriver.gecko.driver",readconfig.getFireFoxPath());
				driver=new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("edge")){
				//System.setProperty("webdriver.chrome.driver",readconfig.getChromePath());
				//driver=new ChromeDriver();
			}
			else {
				System.out.println("Enter Right parameter");
			}
			driver.manage().window().maximize();
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
		}
		
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		public static void captureScreenShot(WebDriver driver,String tname) throws IOException
		{
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srs=ts.getScreenshotAs(OutputType.FILE);
			File trg=new File(".\\ScreenShot\\"+tname+".png");
			FileUtils.copyFile(srs, trg);
			System.out.println("ScreenShot taken Successfully");
		}
		
		public static void doubleClick()
		{
			Actions act = new Actions(driver);
			act.doubleClick().build().perform();
		}
		
		public static void clickByJSExecutor(WebElement element)
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);


		}

	}



