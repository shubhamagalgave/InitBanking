package Day6;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationandDeserialization {
	
	//@Test
	public void Serialization() throws JsonProcessingException  ///plane object to json
	{
		StudentPOJO pojo=new StudentPOJO();
		String courcess[]= {"rest","java"};
		pojo.setName("Ram");
		pojo.setId(1235);
		pojo.setPhone("8974518965");
		pojo.setCourcess(courcess);
		pojo.setLocation("pune");
		ObjectMapper ob=new ObjectMapper();
		String stu=ob.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
		
		System.out.println(stu);
	}
	
	@Test
	public void Deserialization() throws JsonMappingException, JsonProcessingException  //json to plane object
	{
		String jsonData="{\r\n" + 
				"  \"id\" : 1235,\r\n" + 
				"  \"name\" : \"Ram\",\r\n" + 
				"  \"location\" : \"pune\",\r\n" + 
				"  \"phone\" : \"8974518965\",\r\n" + 
				"  \"courcess\" : [ \"rest\", \"java\" ]\r\n" + 
				"}\r\n" + 
				"";
		
		ObjectMapper ob=new ObjectMapper();
		
		StudentPOJO st=ob.readValue(jsonData, StudentPOJO.class);
		
		System.out.println(st.getName());
		System.out.println(st.getId());
		System.out.println(st.getLocation());
		System.out.println(st.getCourcess()[0]);
		System.out.println(st.getCourcess()[1]);
		System.out.println(st.getPhone());
	}
	
	
	
	
	

}
