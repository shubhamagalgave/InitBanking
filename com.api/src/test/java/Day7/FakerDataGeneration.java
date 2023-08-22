package Day7;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGeneration { 
	
	
	    @Test
		public void BasicAuthentication() 
		{
			Faker f=new Faker();
			String fullName=f.name().fullName();
			String firstName=f.name().firstName();
			String lastName=f.name().lastName();
			String username=f.name().username();
			
			String password=f.internet().password();
			String phoneNumber=f.phoneNumber().cellPhone();
			String email=f.internet().safeEmailAddress();
			
			System.out.println("fullName"+fullName);
			System.out.println("firstName"+firstName);
			System.out.println("lastName"+lastName);
			System.out.println("username"+username);
			System.out.println("password"+password);
			System.out.println("phoneNumber"+phoneNumber);
			System.out.println("email"+email);
			
		}
		

}
