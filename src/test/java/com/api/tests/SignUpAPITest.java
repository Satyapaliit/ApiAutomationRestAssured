package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class SignUpAPITest {
	
	@Test(description = "Verify SignUp Functionality")
	public void AccountCreationTest()
	{
		SignUpRequest signUpRequest=new SignUpRequest.Builder().username("Amity")
				.password("Satya")
				.email("amity@gmail.com")
				.firstName("Amit")
				.lastName("kumar")
				.mobileNumber("7618515569")
				.build();
		
		AuthService authservice=new AuthService();
		Response response= authservice.signUp(signUpRequest);
		System.out.println(response.prettyPrint());
				
		
		
	}
	
	
	

}
