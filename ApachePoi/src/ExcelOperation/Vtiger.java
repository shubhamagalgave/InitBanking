package ExcelOperation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

	public static void main(String[] args) throws IOException, InterruptedException {
		String  st = ".\\dataFolder\\Automation.xlsx";
		FileInputStream input = new FileInputStream(st);
		
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(0);
		String cellValue = cell.getStringCellValue();
		
		Thread.sleep(1000);
	
		System.out.println(cellValue);
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\MYproject\\Executable\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(cellValue);
		driver.manage().window().maximize();
		
		
		String username = row.getCell(1).getStringCellValue();
		System.out.println(username);
		driver.findElement(By.id("username")).sendKeys(username);
		
		String password = row.getCell(2).getStringCellValue();
		System.out.println(password);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.cssSelector("a[id='loginButton'] div")).click();
		Thread.sleep(2000);
		
		String actualTitle ="actiTIME - Enter Time-Track";

		String Title =driver.getTitle();
	
		if(actualTitle.contains(Title))
		{
			row.createCell(4).setCellValue("Success");
			FileOutputStream output = new  FileOutputStream(st);
			
			workbook.write(output);
			output.flush();
			output.close();
			System.out.println("Login is successfull");
		}
		else
		{
			System.out.println("Login is Failed");
		}
		driver.close();
				

	}

}
