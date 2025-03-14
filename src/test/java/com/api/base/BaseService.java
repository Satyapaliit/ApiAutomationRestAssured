package com.api.base;

import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//Service Object Model(SOM)
//Wrapper for RestAssured
public class BaseService {
	//Set Base URI
	//Create the request
	//Handle the response
	
	private static final String BASE_URI="http://64.227.160.186:8080";
	private RequestSpecification requestSpecification;
	
	public BaseService() {
		requestSpecification=RestAssured.given().baseUri(BASE_URI);
	}
	
	protected Response getRequest(String endpoint)
	{
		return requestSpecification.get(endpoint);
	}
	
	protected Response postRequest(Object payload,String endpoint)
	{
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
	}
	
	protected void setAuthToken(String token)
	{
		requestSpecification.header("Authorization","Bearer "+token);
	}

} 
