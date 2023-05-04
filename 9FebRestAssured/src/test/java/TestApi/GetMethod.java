package TestApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetMethod {

	public static void main(String[] args) {
		
		String url ="https://reqres.in/";
		String resource="/api/users/2";
		RestAssured.baseURI=url;
		
		given().log().all()
		.when().get(resource)
		.then().log().all();
	}

}



/***
Given : Input[Aloo]
When : action to be performed on input[machine]
then : verify action result[sona]
*/

