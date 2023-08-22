package Day8;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class postRequest {
	
	
	   @Test
		public void postRequest(ITestContext context)
		{
		   
			    Faker f=new Faker();
			    JSONObject jo=new JSONObject();
			    jo.put("name",f.name().firstName());
			    jo.put("gender", "male");
			    jo.put("email",f.internet().emailAddress());
			    jo.put("status", "inactive");
			    
			 
			  String Token="bc5549ea7c37490b8d487ecfbe48f516bb863d02fc56fdb7d80214552a36fee7";
			  
		    int id= 
		    		given()
		    		 .headers("Authorization","Bearer "+Token)
		    		 .contentType("Application/json")
		    		 .body(jo.toString())
		    		 /**
		    	           .body("{\r\n" + 
		    		 		"\"name\":\"namescs\", \r\n" + 
		    		 		"\"gender\":\"male\", \r\n" + 
		    		 		"\"email\":\"email125@gamail.com\", \r\n" + 
		    		 		"\"status\":\"inactive\"\r\n" + 
		    		 		"}")*/
		    
		    .when()
		    .post("https://gorest.co.in/public/v2/users").jsonPath().getInt("id");
		    
		    context.setAttribute("userId", id);  
		}

}
