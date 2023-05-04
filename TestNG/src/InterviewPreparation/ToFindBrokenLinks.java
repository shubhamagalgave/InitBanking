package InterviewPreparation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindBrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","E:\\Acceleration\\Automation Testing\\Workplace 4.9\\TestNGByShaileshSir\\Browser\\latest.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			try {
			URL link=new URL(url);
			//create a connection of object link
			
			HttpsURLConnection http=(HttpsURLConnection)link.openConnection();
			Thread.sleep(3000);
			http.connect();
			
			int responsecode=http.getResponseCode();
			if(responsecode>=400)
			{
				System.out.println(url+"-"+"is broken link"+i);
			}
			else
			{
				System.out.println(url+"-"+"is valid link"+i);
			}
		}catch (Exception e) {
		
		}
		}
		driver.close();

	}

}
