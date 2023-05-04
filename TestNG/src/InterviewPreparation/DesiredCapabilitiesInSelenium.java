package InterviewPreparation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesInSelenium {//desired capabilities class in selenium is used to overcome YOUR CONNECTION IS NOT PRIVATE OR INSECURE certificate etc.

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		/***
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("headless");
		//opt.merge(caps);
		//WebDriver driver=new ChromeDriver(opt);
		*/
		WebDriver driver=new ChromeDriver(caps);
		driver.get("http://www.cacert.org/");
		driver.manage().window().maximize();
		

	}

}
