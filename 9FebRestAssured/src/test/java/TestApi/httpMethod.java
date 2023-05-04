package TestApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class httpMethod {

	String url = "https://reqres.in/";
	String resource = "/api/users/2";

	public void getMethod() {
		RestAssured.baseURI = url;

		given().log().all().when().get(resource).then().log().all();
	}
	public void postMethod() {
		RestAssured.baseURI = url;
		String resource = "/api/users";
		String payload = "{\r\n" + 
				"    \"name\": \"Todd\",\r\n" + 
				"    \"job\": \"Devleader\"\r\n" + 
				"}";

		given().body(payload).log().all()
		.when().post(resource)
		.then().log().all();
	}
	
	public void putMethod()
	{
		RestAssured.baseURI=url;
		String Resorce="/api/users/2";
		String payload="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		given().body(payload).log().all()
		.when().put(Resorce)
		.then().log().all();
	}
	public void patchMethod()
	{
		RestAssured.baseURI=url;
		String Resorce="/api/users/2";
		String payload="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		given().body(payload).log().all()
		.when().patch(Resorce)
		.then().log().all();
	}
	public void deleteMethod()
	{
		RestAssured.baseURI=url;
		String Resorce="/api/users/2";
		 
		given().log().all()
		.when().delete(Resorce)
		.then().log().all();
		
	}
	public static void main(String[] args) {
		httpMethod get = new httpMethod();
		//get.getMethod();
		
		//get.postMethod();
		//get.putMethod();
		//get.patchMethod();
		get.deleteMethod();
		

	}

}
