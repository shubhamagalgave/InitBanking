package TestNG;

import org.testng.annotations.Test;

public class DemoTestNG {
  @Test
  public void TestCase1() throws InterruptedException {
	  Thread.sleep(2000);
	  System.out.println("Hello,TC1");
  }
  @Test
  public void TestCase2() {
	  System.out.println("Hello,TC2");
	  
  }
  
}
