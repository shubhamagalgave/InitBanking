package Day3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import java.util.HashMap;

import org.testng.annotations.Test;

public class PathandQueryParameter {
	
	    @Test(priority=1)
		public void postRequest()
		{
			given()
			.pathParam("user", "users")
			.queryParam("page", "2")
			.queryParam("id", "5")
		    
		    
		    .when().get("https://reqres.in/api/{user}").
		   
		
		    then()
		    .statusCode(200)           
		    .log().all();             
		}


}
