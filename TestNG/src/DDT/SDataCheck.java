package DDT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SDataCheck {
	@Test(dataProvider="setData")
  public void Sdata(String username,String password) {
		System.out.println("You have provided username "+username);
		  System.out.println("You have provided password "+password);
		  
  }
	@Test(dataProvider="setData")
	public void run(String username,String password){
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\MYproject\\Executable\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("google.com");
		
	}
	
}
