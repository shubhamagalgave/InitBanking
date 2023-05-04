package TestNG;

import org.testng.annotations.Test;

public class PriorityInTestNG {
  @Test//(priority =1)
  public void login()  {
	  System.out.println("Hi ,I am TC10");  
  }
  
  @Test//(priority =2)
  public void sendEmail()  {
	  System.out.println("Hi ,I am TC11");
	  
  }
  @Test//(priority =3)
  public void logout()  {
	  System.out.println("Hi ,I am TC12");
	  
  }
  }

