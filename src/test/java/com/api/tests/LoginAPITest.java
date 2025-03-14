package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;

import io.restassured.response.Response;

public class LoginAPITest {
	
	@Test(description = "Verify if Login API is Working")
	public void loginTest()
	{
		//Note: if I am creating an object then pass it parent reference, make it loosly coupled
		
		LoginRequest loginRequest=new LoginRequest("Satyapaliit@gmail.com","Satyapal@1");
		AuthService authService=new AuthService();
		Response response= authService.login(loginRequest);
		LoginResponse loginResponse =response.as(LoginResponse.class);
		//System.out.println(response.asPrettyString());
		//System.out.println("Token:"+loginResponse.getToken());
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(loginResponse.getEmail().contains("@"));
		
	}

}
