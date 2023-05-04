package InterviewPreparation;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToRemoveInfoBarFromBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-infobars");
		option.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.co.in/");
		/***
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String s=driver.getTitle();
		System.out.println(s);*/
		

	}

}
