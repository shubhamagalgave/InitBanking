package com.intBanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TTTTTTTT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\intBanking\\Drivers\\driver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("hjsdaf");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("wefhn");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		driver.switchTo().alert().accept();
		driver.close();
	 

	}

}
