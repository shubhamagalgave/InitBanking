import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();	
        driver.get("https://filehippo.com/download_abdio_pdf_reader/#8221"); // sample url
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        
               
        driver.findElement(By.xpath("//*[@title=\"Download Latest Version for Windows\"]")).click();	
        
        
       // Robot robot = new Robot();  // Robot class throws AWT Exception	
    //    Thread.sleep(2000); // Thread.sleep throws InterruptedException	
     //   robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        

	}

}
