package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM {
  @Test
  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workspace\\Myfiles\\executable\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.saucedemo.com/");
      
      WebElement Usernamme= driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
     Usernamme.sendKeys("standard_user");
     // Usernamme.clear();

     WebElement passwordNameInputField= driver.findElement(By.xpath("//*[@id=\"password\"]"));
     passwordNameInputField.sendKeys("secret_sauce");
      WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
      loginButton.click();
      driver.close();
  }
}
