package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodandAfterMethod {	
	 @BeforeMethod
	  public void OpenBrouser()  {
		  System.out.println("Brouser open Succesfully");  
	  }
	  
	  @Test(priority =1)
	  public void VerifyLogIn()  {
		  System.out.println("Verify login Succesfully");
		  
	  }
	  @AfterMethod
	  public void CloseBrouser()  {
	  System.out.println("Brouser Close Succesfully");
	  }
		
		  @Test(priority =2)
		  public void CreateTask()  {
		  System.out.println("Task Created  Succesfully");	
  }
		  @Test(priority =3)
		  public void DeleteTask()  {
		  System.out.println("Task Deleted  Succesfully");	
  }
		  
		  
}
