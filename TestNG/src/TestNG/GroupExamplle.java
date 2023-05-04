package TestNG;

import org.testng.annotations.Test;

public class GroupExamplle {
  @Test(groups = "Regration")
  public void testCaseOne() {
	  System.out.println("I am in Testcase one");
	  
  }
  
  @Test(groups = "Regration")
  public void testCaseTwo() {
	  System.out.println("I am in Testcase Two");  
  }
  
  @Test(groups = "Smoke")
  public void testCaseThree() {
	  System.out.println("I am in Testcase Three");  
  }
  
  @Test(groups = "Regration")
  public void testCaseFour() {
	  System.out.println("I am in Testcase Four");	  
  }
  
  @Test(groups = "Smoke")
  public void testCaseFive() {
	  System.out.println("I am in Testcase Five");  
  }


  
  
}
