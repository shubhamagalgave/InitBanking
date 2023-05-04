import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ScrollDownPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",	"E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		Thread.sleep(10000);
		
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		Thread.sleep(6000);
		driver.close();

	}

}
