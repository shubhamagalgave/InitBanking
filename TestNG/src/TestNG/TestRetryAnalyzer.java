package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetryAnalyzer {
  @Test(retryAnalyzer=TestNG.RetryAnalyzer.class)
  public void Test001() {
	  
	  Assert.assertEquals(false, true);
	}
  @Test//(retryAnalyzer=TestNG.RetryAnalyzer.class)
  public void Test002() {
	  
	  Assert.assertEquals(false, true);
	}

  
  
  
}
