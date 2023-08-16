package Day3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class LoggingDemo {
	
	  @Test(priority=1)
	   
		public void getHeader()
		{
		
		   when().get("https://reqres.in/api/users?page=2")
		  .then()
		  //.log().body();//to print only response body
		  // .log().cookies();//to print only cookies
		  // .log().headers();//to print only headers 
		   .log().all();//to print all response 
		  
	     
		}

}
