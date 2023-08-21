package Day6;
	
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

	public class JsonSchemaValidation {
		
		
		
		@Test
		public void getRequest()
		{
			File file=new File("E:\\Acceleration\\Automation Testing\\Workplace 4.9\\com.api\\src\\test\\java\\Day6\\JsonScemaValidation.json");
	   		    when()
			    .get("https://reqres.in/api/users?delay=3")
			    .then()
			   //.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("JsonScemaValidation.json"))//<<===not validate Properly
			   .assertThat().body(JsonSchemaValidator.matchesJsonSchema(file))
			    .log().body();
		}
		
		


}
