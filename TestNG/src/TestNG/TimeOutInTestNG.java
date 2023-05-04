package TestNG;

import org.testng.annotations.Test;

public class TimeOutInTestNG {
   
	
	@Test(dependsOnMethods="signIn")
	  public void logIn() {
		  System.out.println("Hi ,I am TC10");
	  }
	  
	  @Test(dependsOnMethods="logIn",timeOut=2000)
	  public void checkNotification() {
		  System.out.println("Hi ,I am TC11");
		  try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  @Test(enabled=true,expectedExceptions=ArithmeticException.class)
	  public void signIn() {
		  System.out.println("Hi ,I am TC12");
		int i=10/0;
	  System.out.println("Signin Process is completed");
	  
	  
	  

	
  }
}
