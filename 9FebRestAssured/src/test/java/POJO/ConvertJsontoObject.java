package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;

//Deserilization method 2 another way to write code


public class ConvertJsontoObject extends JsonClass
{

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException    {
		String payload ="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		
		ObjectMapper objMap=new ObjectMapper();
		JsonClass obj = objMap.readValue(payload, JsonClass.class);
		System.out.println(obj.getJob());
		System.out.println(obj.getName());
		
		
//
	}

}
