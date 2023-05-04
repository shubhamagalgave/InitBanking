package TestApi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Authorisation {

	void Basic()
	{
		String username="";
		String password="";
		
		String Resource="";
		
		RestAssured.baseURI="";
		
		given().auth().basic(username, password)
		.when().get(Resource)
		.then();
	}
	void auth2()
	{
		String Token = "https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?redirect_uri=storagerelay%3A%2F%2Fhttps%2Fwww.zomato.com%3Fid%3Dauth39762&response_type=permission%20id_token&scope=email%20profile%20openid&openid.realm&include_granted_scopes=true&client_id=442739719837.apps.googleusercontent.com&ss_domain=https%3A%2F%2Fwww.zomato.com&prompt=select_account&fetch_basic_profile=true&gsiwebsdk=2&flowName=GeneralOAuthFlow-";
		
		given().auth().oauth2(Token).when().then();
	}
}
