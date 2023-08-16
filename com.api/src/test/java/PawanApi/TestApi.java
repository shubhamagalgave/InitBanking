package PawanApi;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestApi {
	int id;
	
	//@Test(priority=0)
	public void posttMethod() throws InterruptedException
	{
		 id=given().contentType("Application/json").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
		
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	}
	
	//@Test(priority=1)
	public void putMethod()
	{
		 given()
				 .contentType("Application/json").body("{\r\n" + 
				"    \"name\": \"Ram\",\r\n" + 
				"    \"job\": \"god\"\r\n" + 
				"}")
		.when()
		.put("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(200)
		.body("name",equalTo("Ram"))
		.log().all();
	}
	
	
	//@Test(priority=2)
	public void patchMethod()
	{
		 given()
				 .contentType("Application/json").body("{\r\n" + 
				"    \"name\": \"Shri Swami Samrth\",\r\n" + 
				"    \"job\": \"palanhar\"\r\n" + 
				"}")
		.when()
		.patch("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(200)
		.body("name",equalTo("Shri Swami Samrth"))
		.log().all();
	}
	
	//@Test(priority=3)
	public void deleteMethod()
	{
		 when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.statusCode(204)
		.log().all();
	}
	//-------------------------------------------------------------------------------------------------------------------------------
	
	
	  //  @Test()
		public void RegisterPostRequestSuccess() 
		{
			 given().contentType("Application/json").body("{\r\n" + 
			 		"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
			 		"    \"password\": \"pistol\"\r\n" + 
			 		"}")
			
			
			.when()
			.post("https://reqres.in/api/register")
			.then()
			.statusCode(200)
			.body("id", equalTo(4))
			.body("token", equalTo("QpwL5tke4Pnpja7X4"))
			.log().all();
		}
		
		//@Test
		public void RegisterPostRequestUnsuccess()
		{
			given()
			.contentType("Application/json")
			.body("{\r\n" + 
					"    \"email\": \"sydney@fife\"\r\n" + 
					"}")
			
			.when()
			.post("https://reqres.in/api/register")
			
			.then()
			.statusCode(200)
			.body("email",equalTo("sydney@fife"))
			.log().all();
		}
		
		//@Test
		public void LoginPostRequestSuccess()
		{
			given()
			.contentType("Application/json")
			.body("{\r\n" + 
					"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
					"    \"password\": \"cityslicka\"\r\n" + 
					"}")
			.when()
			.post("https://reqres.in/api/login")
			.then()
			.statusCode(200)
			.body("token",equalTo("QpwL5tke4Pnpja7X4"))
			.log().all();
		}
		
		//@Test
		public void LoginPostRequestUnsuccess()
		{
			given()
			.contentType("Application/json")
			.body("{\r\n" + 
					"    \"email\": \"peter@klaven\"\r\n" + 
					"}")
			.when()
			.post("https://reqres.in/api/login")
			.then()
			.statusCode(200)
			.body("page",equalTo(2));
		}
		
		
		        @Test
				public void DelaydResponse()
				{
					 when()
					.get("https://reqres.in/api/users?delay=3")
					.then()
					.statusCode(200)
					.body("page",equalTo(1))
					.log().all();
				}
		
		

}
