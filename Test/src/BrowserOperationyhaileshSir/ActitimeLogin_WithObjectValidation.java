package BrowserOperationyhaileshSir;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin_WithObjectValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Acceleration\\Automation Testing\\Workplace 4.9\\Test\\ee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
	//	System.out.println("Username input field visibility status is  "+username.isDisplayed());
	//	System.out.println("Username input field editable status is : "+username.isEnabled());
		String Attt = username.getAttribute("placeholder");
		System.out.println(Attt.equals("Username"));
		System.out.println(Attt);
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		System.out.println(password.isDisplayed());
	    System.out.println(password.isEnabled());
		System.out.println(password.getAttribute("placeholder"));
		System.out.println(password);
		password.sendKeys("manager");
		
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println(checkBox.isDisplayed());
		System.out.println(checkBox.isEnabled());
		System.out.println(checkBox.isSelected());
		checkBox.click();
		System.out.println("Keep me loggedin checkbox after click, status is : "+checkBox.isSelected());
   
		WebElement login = driver.findElement(By.id("loginButton"));
		
		System.out.println("Tag name for login button : "+login.getTagName());
		String text = login.getText();
		System.out.println(text);
		System.out.println(text.equals("Login"));
		login.click();
		driver.close();
		

		/**
		 * visible 		-----> isDisplayed()--true/false ---> input, button, link, radio button, checkbox, dropdown, image ....
		 * functional   -----> isEnabled()  --true/false ---> input, button, link, radio button, checkbox, dropdown, image ....
		 * selected     -----> isSelected() --true/false ---> radio button, checkbox
		 * validate text-----> getText()    --String     ---> use to get inner text of any Web Element
		 * 
		 * <htmatag> innertext </htmltag>
		 * <a href="https://www.google.com">Forgot Password</a>
		 * <div     > Sample text </div>
		 * <span    > Demo Text   </span>
		 * <td      > Testing bug </td>
		 * 
		 * attribute validation: getAttribute(String attributename) --> String--> it will return attribute value based on the given name
		 * 
		 * <input type="text" name="username" value="" id="username" class="textField" placeholder="Username">
		 * 
		 * WebElement userNameInputField=driver.findElement(By.id("username"));
		 * 
		 * String acutalPlaceholderName=userNameInputField.getAttribute("placeholder");
		 * String acutalClassName=userNameInputField.getAttribute("class");
		 * String acutalName=userNameInputField.getAttribute("name");
		 * String acutalTypeValue=userNameInputField.getAttribute("type");
		 * 
		  */

	}

}
