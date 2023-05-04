package TestNG;

import org.testng.annotations.Test;

public class EnableTrueFalse {
  @Test(enabled=true)
  public void enable1() {
	  System.out.println("Hi ,I am TC10");
  }
  
  @Test(enabled=false)
  public void enable2() {
	  System.out.println("Hi ,I am TC11");
  }
  
  @Test(enabled=true)
  public void enable3() {
	  System.out.println("Hi ,I am TC12");
  }


}
/**
*If enable =true then it will execute 
*if enable=false then it will not execute
*/
