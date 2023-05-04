package TestApi;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class JsonGetMethod {

	public static void main(String[] args) {
		String url = "https://reqres.in/";
		String resource = "/api/users/2";
		RestAssured.baseURI = url;

		String response = given().when().get(resource).then().extract().asString();
		// System.out.println(response);

		// Json--->Extract--->Deserialisation

		JsonPath js = new JsonPath(response);
		String name = js.getString("data.first_name");
		System.out.println(name);

		String email = js.getString("data.email");
		System.out.println(email);

		int id = js.getInt("data.id");
		System.out.println(id);

	}

}
