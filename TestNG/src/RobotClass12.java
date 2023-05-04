import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass12 {

	public static void main(String[] args) throws InterruptedException {
    
		/****
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.134/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href=\"/103.0.5060.134/chromedriver_win32.zip\"]/self::a")).click();
		***/
		
		int a=55,b=5;
	//	a=a+b;//15
		a=a-b;//5
		
		b=a+b;//5+5
		
		
		
		System.out.println("A    "+a+"B    "+b);
		
		

	}

}
