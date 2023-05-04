package TestNG;

import org.testng.annotations.Test;

public class DependsOnMethod {
  @Test(dependsOnMethods="signIn")
  public void logIn() {
	  System.out.println("Hi ,I am TC10");
  }
  
  @Test(dependsOnMethods="logIn")
  public void checkNotification() {
	  System.out.println("Hi ,I am TC11");
  }
  
  @Test(enabled=true)
  public void signIn() {
	  System.out.println("Hi ,I am TC12");
	 // int i=10/0;
  }
}
