package Day7;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import Day6.StudentPOJO;
import io.restassured.response.Response;

public class Authentication {
	
	//@Test
	public void BasicAuthentication() 
	{
		given().auth().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		
		
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().body();
		
	}
	
	//@Test
	public void DigestAuthentication() 
	{
		given().auth().digest("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().body();
	}
	
	
	//@Test
	public void premptiveAuthentication() 
	{
		given().auth().preemptive().basic("postman", "password")
		
		.when()
		.get("https://postman-echo.com/basic-auth")
		.then()
		.statusCode(200)
		.body("authenticated",equalTo(true))
		.log().body();
	}
	
	//@Test
	public void bariarTokenAuthentication() 
	{
		String barierToken="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";
		given().
		headers("Authorization","Bearer "+ barierToken)
		.when()
		.get("https://github.com/shubhamagalgave/")
		.then()
		.statusCode(200);
		//.log().body();
	}

	//@Test
	public void OAuth1Authentication() //data not available
	{
		
		given().auth().oauth("consumerKey", "consumerSecret","accessToken" , "secretToken")
		.when()
		.get("url")
		.then()
		.statusCode(200)
		.log().body();
	}
	//@Test
	void auth2()
	{
		String Token = "https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fwww.zomato.com%3Fid%3Dauth39762&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=442739719837.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fwww.zomato.com&prompt=select_account&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow-";
		
		given().auth().oauth2(Token).when().then();
	}
	
	@Test
	void Oauth2()
	{
		//Website link="https://docs.github.com/en/free-pro-team@latest/rest/repos/repos?apiVersion=2022-11-28#list-repositories-for-the-authenticated-user"
		String token = "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";
		//Response res=
				given()
		.auth().oauth2(token)
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.statusCode(200)
		.log().body();
		
		//Assert.assertEquals(res.getStatusCode(), 200);
	}
	
	
	

}
