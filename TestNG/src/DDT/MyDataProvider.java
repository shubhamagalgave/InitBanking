package DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyDataProvider {
  @Test(dataProvider ="getData")//data provider has to be nominated with name of the method inside data provider annotation
  public void DataMatrix(String username,String password,int mobileNumber,String browser) {//no of input parameter inside method==no of col inside dataprovide
  } 
  @DataProvider
  //st step- Return 2 dimensional Array
  //row and col you have to specify
  public Object[][] getData()
  {
	   Object[][] data =new Object[3][4]; 
	   
	   data[0][0]="Username";
	   data[0][1]="Password";
	   data[0][2]="976143";
	   data[0][3]="Mozila";
	   
	   data[1][0]="Username";
	   data[1][1]="Password";
	   data[1][2]="976273";
	   data[1][3]="Chrome";
	   
	   data[2][0]="Username";
	   data[2][1]="Password";
	   data[2][2]="976143";
	   data[2][3]="Safari";
	   return data;     	
  }
}
