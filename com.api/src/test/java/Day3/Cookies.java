package Day3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map.Entry;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;


import io.restassured.response.Response;

public class Cookies {
	
	   // @Test(priority=1)
		public void cookies()
		{
			
		  when().get("https://www.google.com/")
		  .then()
		  .cookie("AEC", "Ad49MVEse54DxTRZEc7vdJuYMibHdeo6DvoPaOpcdcJ7HFD_rrlYjuF91JQ")//everytime cookie should be change then it is valid
		  .statusCode(200)
		  .log().all();           
		}
	
	    @Test(priority=2)
		public void gettcookiesInfo()
		{
			
		    
		  Response res= when().get("https://www.google.com/"); 
		  
		  //get single cookie info
		//  String cookie=res.getCookie("AEC");
		//  System.out.println("cookie value="+cookie);
		  
		 // get all cookie info
		  Map<String,String> allCookie=res.getCookies();
		  
		 	 // System.out.println(allCookie.keySet());
		 	  for(String k:allCookie.keySet())
		 	  {
		 		  System.out.println(k+""+allCookie);
		 	  }
		  
		}


}
