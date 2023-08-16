package PawanApi;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


public class Day {
	
	int id;
	
	//@Test
	public void getRequest()
	{
	    given().
	    when().get("https://reqres.in/api/users?page=2").
	    then()
	    .statusCode(200)           // validating status code 
	   .body("page",equalTo(2))    // validating data in json body
	   .header("Content-Type", equalTo("application/json; charset=utf-8"))// validating headers
	    .log().all();              // printing json response body or o/p in console
	}
	
	
	
	
	@Test(priority=0)  //------------Retriving id from post method use in put,delete method
	public void postRequestId()
	{
		HashMap data=new HashMap();
		data.put("name", "ram");
		data.put("job", "leader");
		
		
	    id= given()
	    .contentType("Application/json")
	    .body(data).
	    
	    
	    when().post("https://reqres.in/api/users").jsonPath().getInt("id");
	   
	/***
	    then()
	    .statusCode(201)           
	   .body("name",equalTo("ram"))
	   .body("job",equalTo("leader"))  
	    .log().all();     */        
	}
	
	
	
	
	
	
	
	
	
	
	//@Test(priority=1)
	public void postRequest()
	{
		HashMap data=new HashMap();
		data.put("name", "ram");
		data.put("job", "leader");
		
		
	    given()
	    .contentType("Application/json")
	    .body(data).
	    
	    
	    when().post("https://reqres.in/api/users").
	   
	
	    then()
	    .statusCode(201)           
	   .body("name",equalTo("ram"))
	   .body("job",equalTo("leader"))  
	    .log().all();             
	}
	
	
	
	
	@Test(priority=2)
	public void updateRequest()
	{
		given()
	    .contentType("Application/json")
	    .body("{\r\n" + 
	    		"    \"name\": \"ram\",\r\n" + 
	    		"    \"job\": \"employer\"\r\n" + 
	    		"}").
	    
	    
	    when().put("https://reqres.in/api/users/"+id).
	   
	    
	    then()
	    .statusCode(200)           
	    .body("name",equalTo("ram"))
	   .body("job",equalTo("employer"))  
	    .log().all();             
	}
	
	@Test(priority=3)
	public void deleteRequest()
	{
		when().delete("https://reqres.in/api/users/"+id).
	   
	    
	    then()
	    .statusCode(204)           
	   // .body("name",equalTo("ram"))
	  // .body("job",equalTo("employer"))  
	    .log().all();             
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
