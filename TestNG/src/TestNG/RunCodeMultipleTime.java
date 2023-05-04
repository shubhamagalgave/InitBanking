package TestNG;

import org.testng.annotations.Test;

public class RunCodeMultipleTime {
  @Test(invocationCount=10)
  public void RunCodeMultipleTime() {
	  System.out.println("Hi ,I am TC1");
  }
}
