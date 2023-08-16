package GoogleApi;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;

public class getGoogle {
	String base="https://www.googleapis.com/youtube/v3";
	
	    @Test
		public void getRequest()
		{
		    when().get("https://www.googleapis.com/youtube/v3/channels?part=contentDetails&mine=true").
		    then()
		  //  .statusCode(200)           // validating status code 
		  // .body("page",equalTo(2))    // validating data in json body
		  // .header("Content-Type", equalTo("application/json; charset=utf-8"))// validating headers
		    .log().all();              // printing json response body or o/p in console
		}


}
