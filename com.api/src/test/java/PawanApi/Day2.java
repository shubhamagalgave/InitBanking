package PawanApi;
//Differant way to create post request
//1.Post request body using hashmap
//2.Post request body creation using org.json
//3.Post request body creation using POJO class
//4.Post request  using external json file data

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonToken;

import Day2.POJO;

public class Day2 {
	//1.Differant way to create post request
	
	//@Test(priority=0)
	public void PostRequest()
	{
		HashMap data=new HashMap();
		data.put("id","11");
		data.put("name","ram");
		data.put("location","ayodhya");
		data.put("phone","9874563210");
		String courcess[]= {"arth","sahitya"};
		data.put("courses",courcess);
		
		given()
		.contentType("Application/json")
		.body(data.toString())
		
		.when().post("http://localhost:3000/students")
		.then()
	     .statusCode(201)
		 .body("name",equalTo("ram"))
		 .body(courcess[0],equalTo("arth"))
		 .body(courcess[1],equalTo("sahitya"))
		.log().all();
	}
	
	//@Test(priority=1)
	public void deletRequest()
	{
		when()
		.delete("http://localhost:3000/students/11")
		.then()
		.statusCode(204)
		.log().all();
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	//2.Post request body creation using org.json
	
	//@Test(priority=0)
	public void PostRequest2()
	{
		JSONObject data=new JSONObject();
		data.put("id","11");
		data.put("name","ram");
		data.put("location","ayodhya");
		data.put("phone","9874563210");
		String courcess[]= {"arth","sahitya"};
		data.put("courses",courcess);
		
		given()
		.contentType("Application/json")
		.body(data.toString())
		
		.when().post("http://localhost:3000/students")
		.then()
	     .statusCode(201)
		 .body("name",equalTo("ram"))
		 //.body(courcess[0],equalTo("arth"))
		// .body(courcess[1],equalTo("sahitya"))
		.log().all();
	}
	
	//@Test(priority=1)
	public void deletRequest2()
	{
		when()
		.delete("http://localhost:3000/students/11")
		.then()
		.statusCode(204)
		.log().all();
	}

//-------------------------------------------------------------------------------------------------------------------------------------------------
	
	//3.Post request body creation using POJO class
	
	 // @Test(priority=0)
		public void PostRequestpojo()
		{
		    POJO data=new POJO();
		    data.setId(11);
		    data.setName("ram");
		    data.setPhone("8975613298");;
		    data.setLocation("Ayodhya");
		    String courcess[]= {"arth","niti"};
		    data.setCourcess(courcess);
		
			given()
			.contentType("Application/json")
			.body(data)
			
			.when().post("http://localhost:3000/students")
			.then()
		     .statusCode(201)
			 .body("name",equalTo("ram"))
			 //.body(courcess[0],equalTo("arth"))
			// .body(courcess[1],equalTo("sahitya"))
			.log().all();
		}
		
		//@Test(priority=1)
		public void deletRequestpojo()
		{
			when()
			.delete("http://localhost:3000/students/11")
			.then()
			.statusCode(204)
			.log().all();
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------------

		//4.Post request  using external json file data
	
		 //@Test(priority=0)
			public void PostRequestExternalJsonFile() throws FileNotFoundException
			{
			    File f=new File("E:\\Acceleration\\Automation Testing\\Workplace 4.9\\com.api\\src\\test\\java\\Day2\\body.json");
			    FileReader  fr=new FileReader(f);
			    JSONTokener jt=new JSONTokener(fr);
			    
			    JSONObject data=new JSONObject(jt);
			 
				given()
				.contentType("Application/json")
				.body(data.toString())
				
				.when().post("http://localhost:3000/students")
				.then()
			     .statusCode(201)
				 .body("name",equalTo("ram"))
				 //.body(courcess[0],equalTo("arth"))
				// .body(courcess[1],equalTo("sahitya"))
				.log().all();
			}
			
			//@Test(priority=1)
			public void deletRequestExternalJsonFile()
			{
				when()
				.delete("http://localhost:3000/students/11")
				.then()
				.statusCode(204)
				.log().all();
			}

}
