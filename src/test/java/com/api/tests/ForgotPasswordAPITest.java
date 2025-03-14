package com.api.tests;

import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.SignUpRequest;

import io.restassured.response.Response;

public class ForgotPasswordAPITest {
	
	@Test(description = "Verify Forgot-Password Functionality")
	public void AccountCreationTest()
	{
		
		AuthService authservice=new AuthService();
		Response response= authservice.forgotPassword("satya@gmail.com");
		System.out.println(response.asString());
				
		
		
	}
	
	
	

}
