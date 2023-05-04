package InterviewPreparation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hmh5l8jr5_e&adgrpid=61764313147&hvpone=&hvptwo=&hvadid=610644605475&hvpos=&hvnetw=g&hvrand=5802753151091781578&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007789&hvtargid=kwd-327061083&hydadcr=14455_2316418&gclid=CjwKCAjwgaeYBhBAEiwAvMgp2t2s-aQsEGu1v7R6ItvJEVXlo3jaCBdGBJXvkEEtyT3cAdeZvFKfOBoCJi0QAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Actions a=new Actions(driver);
		
		
		//Mouse Hover operation
		WebElement ele= driver.findElement(By.xpath("//*[@class=\"nav-line-2 \"]"));
		a.moveToElement(ele).build().perform();	

		//Double Click Operation
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"  and @name=\"field-keywords\"]/self::input"));
		
		a.moveToElement(search).click().sendKeys("Memory card ").doubleClick().build().perform();
		
		
		
		//Right click operation
		WebElement right = driver.findElement(By.xpath("//*[text()='Best Sellers' and @tabindex=\"0\"]"));
		a.moveToElement(right).contextClick().build().perform();
		
		//a.moveToElement(right).click().build().perform();
		
		driver.close();

	}

}
