package Day3;

	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.equalTo;
	import static io.restassured.RestAssured.*;
	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;
	import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
	
	public class HeadersValidation {
		
		   @Test(priority=1)
		   
			public void getHeader()
			{
			
			   when().get("https://www.google.com/")
			  .then()
			  .header("Content-Type", "text/html; charset=ISO-8859-1")
			  .and()
			  .header("Server", "gws")
			  .and()
			  .header("Content-Encoding", "gzip").log().headers();//to print only headers
			  
		     
			}

		   //@Test(priority=2)
		   
			public void getHeaders()
			{
			
			   Response res=when().get("https://www.google.com/");
			   
			   //get single header information
			  String headervalue= res.getHeader("Content-Type");
			//  System.out.println("header value="+headervalue);
			  
			  //get all header information
			  Headers he=res.getHeaders();
			  for(Header hd:he)
			  {
				  System.out.println(hd.getName()+"        "+hd.getValue());
			  }
			 		     
			}


}
