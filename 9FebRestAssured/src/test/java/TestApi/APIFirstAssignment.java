package TestApi;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class APIFirstAssignment {
	
	String url="https://dummyjson.com/";
	

	public void getMethod()
	{
		RestAssured.baseURI=url;
		String Resource="/products";
		
		given().log().all()
		.when().get(Resource)
		.then().log().all();
	}
	
	public void getMethod1()
	{
		RestAssured.baseURI=url;
		String Resource="/products/1";
		
		given().log().all()
		.when().get(Resource)
		.then().log().all();
	}
	
	public void getMethod2()
	{
		RestAssured.baseURI=url;
		String Resource="/products/search?q=Laptop";
		
		given().log().all()
		.when().get(Resource)
		.then().log().all();
	}
	
	public void getMethod3()
	{
		RestAssured.baseURI=url;
		String Resource="/products/categories";
		
		given().log().all()
		.when().get(Resource)
		.then().log().all();
	}
	
	public void getMethod4()
	{
		RestAssured.baseURI=url;
		String Resource="/products/category/smartphones";
		
		given().log().all()
		.when().get(Resource)
		.then().log().all();
	}
	
	public void postMethod5()
	{
		RestAssured.baseURI=url;
		String Resource="/products/add";
		String payload="// add a product";
		
		given().body(payload).log().all()
		.when().post(Resource)
		.then().log().all();
	}
	
	public void deleteMethod5()
	{
		RestAssured.baseURI=url;
		String Resource="/products/add";
		String payload="// add a product";
		
		given().body(payload).log().all()
		.when().delete(Resource)
		.then().log().all();
	}
	
	public void putMethod5()
	{
		RestAssured.baseURI=url;
		String Resource="/products/1";
		String payload=" //update a product";
		
		given().body(payload).log().all()
		.when().put(Resource)
		.then().log().all();
	}//products/1
	
	public void patchMethod5()
	{
		RestAssured.baseURI=url;
		String Resource="/products/1";
		String payload=" //update";
		
		given().body(payload).log().all()
		.when().patch(Resource)
		.then().log().all();
	}
	
	public void deleteMethod()
	{
		RestAssured.baseURI=url;
		String Resource="/products/1";
		
		
		given().log().all()
		.when().delete(Resource)
		.then().log().all();
	}	




	public static void main(String[] args) {
		
		APIFirstAssignment api = new APIFirstAssignment();
		//api.getMethod();
		//api.getMethod1();
		//api.getMethod2();
		//api.getMethod3();
		//api.getMethod4();
		//api.postMethod5();
		//api.deleteMethod5();
		//api.putMethod5();
		//api.patchMethod5();
		api.deleteMethod();
	

	}

}
