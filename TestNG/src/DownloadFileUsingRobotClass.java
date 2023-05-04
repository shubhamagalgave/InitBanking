import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DownloadFileUsingRobotClass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.gecko.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\ApachePoi\\brouser\\geckodriver.exe");
    	WebDriver driver = new FirefoxDriver();
		driver.get("https://mediaget.com/en/advpromo?r=Google_VT_IN_KMS_Soft_11032022&gclid=CjwKCAjwo_KXBhAaEiwA2RZ8hFlY62NdP_jFatTAR8pQCVQSNUjZ9vKQGOFzbThmXEKpamQl-bYqzhoCdxwQAvD_BwE");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div/div/a")).click();
	
		/*Down arrow
		 * 3time tab key
		 * enter
		 * */
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);//press down arrow in keyword
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);//Enter key
		
		
		
		

	}
}
