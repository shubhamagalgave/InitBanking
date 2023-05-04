package FrameHandlingByShaileshSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\Executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/checkboxradio/");
		WebElement iframe  = driver.findElement(By.cssSelector(".demo-frame"));
		driver.switchTo().frame(iframe);
		WebElement button  = driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]"));
		button.click();
		System.out.println(button.getText());
		
		driver.close();

	}

}
