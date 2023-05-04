package demo;

import org.maven.Demo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	
	@Test

	public void testLogin1()
	{
		Demo MyApp = new  Demo();
		
		Assert.assertEquals(0,MyApp.userLogin("abc","abc123"));			
	}
	
	@Test
	public void testLogin2()
	{
		Demo MyApp = new  Demo();
		
		Assert.assertEquals(1,MyApp.userLogin("abc","abc@123"));			
	}



}
