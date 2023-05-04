package DDT;

import org.testng.annotations.Test;

public class NewTest12 {
  @Test(dataProvider="getData")
  public void check(String username,String password,int mobileNumber,String brouwser) {
	  System.out.println("You have provided username "+username);
	  System.out.println("You have provided password "+password);
	  System.out.println("You have provided mobileNumber "+mobileNumber);
	  System.out.println("You have provided brouwser "+brouwser);
  }
}
