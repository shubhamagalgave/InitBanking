package InterviewPreparation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendDataWithoutUsingSendKeyMethod {

	public static void main(String[] args) throws InterruptedException {
		//input[@name="username"]
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("document.getElementByxpath('//input[@id=\"email\"]').value='Shubham'" );
		//js.executeScript("document.getElementById('email').value='Abha_Rathour'");
		

	}

}
