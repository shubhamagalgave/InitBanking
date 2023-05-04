package DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SData {
  @Test
  public void Data( String username,String password) {
  }
  @DataProvider
  
  public Object[][] setData()
  {
	  Object[][] data=new Object[3][2];
	  
	  data[0][0]="admin";
	  data[0][0]="admin";
	  
	  data[0][0]="";
	  data[0][0]="";
	  
	  data[0][0]="gestuser3";
	  data[0][0]="pass123";
	  
	  return data;
  }
}
