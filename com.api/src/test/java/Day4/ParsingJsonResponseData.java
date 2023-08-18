package Day4;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.util.HashMap;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class ParsingJsonResponseData{
	
	      // @Test(priority=1)
			public void tokenGeneration()
			{
	   		HashMap data=new HashMap();
	   		data.put("clientName", "Hakan");
	   		data.put("clientEmail", "leader12@gmail.com");
	   
	    	   given()
				.contentType("Application/json")
				.body(data).
			    when()
			    .post("https://simple-books-api.glitch.me/api-clients/")
			  .then()
			  //.statusCode(201)
			  .log().body();           
			}
			
	      // accessToken = 44e73f37b5387ac687272215f0077fca4008583fd0356bb1759c7d0a9dd7f7c8
	   		
			        // @Test(priority=2)
						public void get()
						{
				   		  // Response res=
			        	  given().
				   		    when()
						    .get("https://simple-books-api.glitch.me/books")
						    .then()
						    .body("name[0]", equalTo("The Russian"))//<===== validation very very imp
						    .body("[0].type", equalTo("fiction"))//<===== validation very very imp
						    .log().all();
				   		}
			                              //or
			         // @Test(priority=2)
						public void JsonResponse()
						{
				   		  Response res= given()
				   		    .when()
						    .get("https://simple-books-api.glitch.me/books");
				   		  
				   		Assert.assertEquals(res.getStatusCode(),200);
				   		Assert.assertEquals(res.getBody().jsonPath().get("name[0]"),"The Russian");
				   		Assert.assertEquals(res.getBody().jsonPath().get("[0].type"),"fiction");
				   		Assert.assertEquals(res.getHeader("Content-Type"),"application/json; charset=utf-8");
				   		
				   		String bookName=res.jsonPath().get("name[0]").toString();
				   		
				   		Assert.assertEquals("The Russian", bookName);
						    
				   		}
			          
			          @Test(priority=3)
						public void VerifyMultipleObjrctFromJsonResponse()
						{
				   		  Response res= given()
				   		    .when()
						    .get("https://simple-books-api.glitch.me/books");
				   		  
				   		  //Search for title of book in json
				   		  boolean flag=false;
				   		  for(int i=0;i<4;i++)
				   		  {
				   			String bookName=res.getBody().jsonPath().get("name["+i+"]").toString();
				   			
				   			if (bookName.equals("Just as I Am")) 
				   			{
								flag=true;
								break;
							}
				   		  }
				   		  Assert.assertEquals(flag,true);
				   		  
				   		//validate  total price of book in json
				   		  double totalprice=0;
				   		for(int i=0;i<6;i++)
				   		{
				   		  String price=res.getBody().jsonPath().get("id["+i+"]").toString();
				   		  System.out.println(price);
				   		  totalprice=totalprice+Double.parseDouble(price);				   		
				   	
				   		}
				   		Assert.assertEquals(totalprice, 21);
						}

				    

}
