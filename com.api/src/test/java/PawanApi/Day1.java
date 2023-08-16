package PawanApi;

import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


import java.util.HashMap;


public class Day1 {
	
	int id;
	@Test(priority=0,enabled=false)
	public void HTTPRequest()
	{
	     given()
		 .when().get("https://reqres.in/api/users?page=2")
		 .then().statusCode(200)
		 .body("",equalTo(200))
		 .log().all();
	}
	
	@Test(priority=1,enabled=false)
	public void createUser()
	{
		HashMap data = new HashMap();
		data.put("name", "shubham");
		data.put("job", "Automation Tester");
		given().contentType("application/json").body(data)
		.when().post("https://reqres.in/api/users")
		.then().statusCode(201).log().all();
	}
	
	@Test(priority=2)
	public void createUser1()
	{
		HashMap data = new HashMap();
		data.put("name", "shubham");
		data.put("job", "Automation Tester");
		given().contentType("application/json").body(data)
		
		.when().post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
	
		//.then().statusCode(201).log().all();
	}
	
	@Test(priority=3,dependsOnMethods={"createUser1"})
	public void updateUser()
	{
		HashMap data = new HashMap();
		data.put("name", "shubham");
		data.put("job", "Automation Test Analyst");
		
		given()
		.contentType("application/json").body(data)
		
		.when().put("https://reqres.in/api/users/"+id)
	
		.then().statusCode(200)
		.log().all();
	}
	
	@Test(priority=4,dependsOnMethods={"updateUser"})
	public void deleteUser()
	{
		HashMap data = new HashMap();
		data.put("name", "shubham");
		data.put("job", "Automation Test Analyst");
		
		given()
		
		
		.when().delete("https://reqres.in/api/users/"+id)
	
		.then().statusCode(204)
		.log().all();
	}
	
	
	
	
}

