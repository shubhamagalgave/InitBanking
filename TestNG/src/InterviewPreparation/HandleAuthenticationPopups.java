package InterviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAuthenticationPopups {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/***
		String username="admin";
		String password="Pass@123";
		String url="https://"+username+":"+password+"the-internet.herokuapp.com/basic_auth";
		
		//https://admin:Pass@123the-internet.herokuapp.com/basic_auth
		
		//driver.get(url);
		*/
		
		driver.get("https://admin:Pass@123the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.close();

		//Java: options.addArguments("disable-infobars");

	}	
}
