package Day8;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class putRequest{
	
	  @Test
			public void putRequest(ITestContext context)
			{
			   String Token="bc5549ea7c37490b8d487ecfbe48f516bb863d02fc56fdb7d80214552a36fee7";
			   int id=(Integer)context.getAttribute("userId");
			   given()
			   .headers("Authorization","Bearer "+Token)
			   .contentType("Application/json").body("")
	          .when()
	          .put("https://gorest.co.in/public/v2/users/"+id)
	          .then().statusCode(200)
	          .log().all();
	  
			}


}
