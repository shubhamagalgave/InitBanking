package POJO;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

 
public class serialisation {
	public void JsonMethod() throws Exception
	{
		JsonClass objJson = new JsonClass();
		objJson.setName("Shubham");
		objJson.setJob("Developer");
		
		ObjectMapper obj = new ObjectMapper();
		String json = obj.writerWithDefaultPrettyPrinter().writeValueAsString(objJson);
		
		System.out.println(json);

	}
	public static void main(String[] args) throws Exception {
		
		serialisation j = new serialisation();
		j.JsonMethod();
		
		
		
	}

}
