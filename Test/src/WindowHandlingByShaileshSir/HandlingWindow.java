package WindowHandlingByShaileshSir;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://etrain.info/in");
		driver.manage().window().maximize();
		
		// get current window unique id
		String wind = driver.getWindowHandle();
		System.out.println("homepage window id "+wind);
		
		// performing click operation to open Linkedin page in new tab
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[3]/div[2]/div[3]/div[2]/div/a[4]/i")).click();
		// get all windows unique IDs which are opened by selenium current instance
         Set<String> allwinds  =  driver.getWindowHandles();
		System.out.println("all window id "+allwinds);
		
		// remove home window id from all window id dn you will get child window id
		allwinds.remove(wind);
		System.out.println("After removing window id all window id "+allwinds);
		
		// switch back to home page window in order to perform any required operation on that

		driver.switchTo().window(wind);
		// now you are allow to identify any element from home window
		Thread.sleep(1000);
		
		System.out.println("url   "+driver.getCurrentUrl());
		System.out.println("url   "+driver.getTitle());
		driver.close();//to close current window
		
		driver.quit();//to close all active window
		

		

		

		
		
		
	}

}
