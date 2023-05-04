package com.intBanking.testCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.intBanking.pageObjects.LoginPage;
import com.intBanking.utilities.XLUtils;

public class TC_LoginTest_002 extends BaseClass {
	@Test(dataProvider="getData")
	public void loginDDT(String username,String password)
	{
	   LoginPage lp=new LoginPage(driver);
	   lp.setUserName(username);
	   lp.setPassWord(password);
	   lp.clickOnLoginButton();
	   if (isAlert()==true) 
	   {
		  driver.switchTo().alert().accept();
		  driver.switchTo().defaultContent();
	   }
	   else {
		
     	}
	}
	   public boolean isAlert()
	   {
		  try {
		        driver.switchTo().alert();
		         return true;
		       }catch (Exception e) {
			     return false;
		   }
		   
	   }
	   @DataProvider
	   public Object[][] getData()
	   {
		   Object data[][]=new Object[3][2];
		   data[0][0]="mngr495350";
		   data[0][1]="YvygUbE";
		   data[1][0]="";
		   data[1][1]="";
		   data[2][0]="mngr495350";
		   data[2][1]="YvygUbe";
		   return data;
	   }
	
	
	
	@DataProvider(name="LoginData")
	public String[][] getData1() throws IOException
	{
		String path="E:\\Acceleration\\Automation Testing\\Workplace 4.9\\intBanking\\src\\test\\java\\com\\intBanking\\testData\\LoginData.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int cellcount=XLUtils.getCellCount(path, "Sheet1", 1);
		String data[][]=new String[rowcount][cellcount];
		for (int i = 1; i <=rowcount; i++) 
		{
			for (int j = 0; j <cellcount; j++)
			{
				data[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return data;
	}
	

}
