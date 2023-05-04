package TestSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		String actualTitle =driver.getTitle();
		String expectedTitle="actiTIME - Login";
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Login page opened successfully");
		}
		else
		{
			System.out.println("Login page not opened ");
		}
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();	
		Thread.sleep(2000);//Explicite wait -- Hard coded wait
		System.out.println(driver.getTitle());
		driver.findElement(By.id("logoutLink")).click();
		
		



	}

}
