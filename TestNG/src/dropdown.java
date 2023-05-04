import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNG\\brouser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		//**** Identify dropdown list

		WebElement skillDropdown=driver.findElement(By.id("Skills"));
		
		//**** Create an instance of Select class and pass above element into its constructor

		Select select=new Select(skillDropdown);
		
		//**** check whether dropdown is multiselect dropdown or not

		System.out.print(select.isMultiple());
		
		List<WebElement> options = select.getOptions();
		
	    for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		WebElement first=select.getFirstSelectedOption();
		System.out.println(first.getText());
	    // select.selectByIndex(2);
		
		driver.quit();
		

	}

}
