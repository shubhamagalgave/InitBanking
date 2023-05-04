import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SouveDemoLoginPage {
	WebDriver driver;
	
	By username =By.id("user-name");
	By password=By.id("password");
	By logInButton=By.id("login-button");
	
	SouveDemoLoginPage(WebDriver d)
	{
		driver=d;
	}
	
	public void setUsername(String userName)
	{
		driver.findElement(username).sendKeys(userName);
	}
	
	public void setPassword(String passWord)
	{
		driver.findElement(password).sendKeys(passWord);
	}
	
	public void setButton()
	{
		driver.findElement(logInButton).click();
	}
}
