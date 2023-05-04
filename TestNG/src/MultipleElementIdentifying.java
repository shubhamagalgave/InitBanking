import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementIdentifying {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> list =driver.findElements(By.xpath("//*[@class=\"dataTable\"]"));
		
		/***
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
		}
		*/
	
		for(WebElement g:list)
		{
			System.out.println(g.getText());
		}
		
		System.out.println(list);
		
		driver.close();
		


}}
