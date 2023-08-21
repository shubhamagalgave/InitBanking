package Day5;
	
	import org.testng.annotations.Test;
	import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
	import static io.restassured.matcher.RestAssuredMatchers.*;
	import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.HashMap;


	public class FileUploadApi {
		

		
		@Test
		public void getRequest()
		{
			  String baseUrl  = "https://api.bytescale.com/v2/accounts/A623uY2/uploads/binary";
			  
			  File myfile=new File("‪C:\\Users\\Basvaraj\\Desktop\\Jira&Api.txt");

		   // Response res=
		    		given()
		    		.multiPart("file",myfile)
		    		.contentType("multipart/form-data").    						    
		            when()
		            .post("https://api.bytescale.com/v2/accounts/A623uY2/uploads/binary")
		            .then()
		            .log().all();
		}
		

	
	
	
	
	
	
	
	
}
