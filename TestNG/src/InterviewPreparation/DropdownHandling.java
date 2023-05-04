package InterviewPreparation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("Skills"));

		Select s = new Select(ele);

		List<WebElement> list = s.getOptions();

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		/**********
		for(int j=0;j<list.size()-1;j++)
		{
			s.selectByIndex(j);
		}*/

		Thread.sleep(2000);
		s.selectByIndex(3);
		s.selectByValue("C++");
		s.selectByVisibleText("APIs");

		//driver.close();

	}

}
