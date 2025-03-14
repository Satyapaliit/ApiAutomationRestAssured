package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementProfileService;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class GetProfileAPITest {
	
	@Test(description = "Verify Get-Profile Functionality")
	public void getUserProfile()
	{
		AuthService authService=new AuthService();
		LoginRequest loginRequest=LoginRequest.builder()
				.username("Satyapaliit@gmail.com")
				.password("Satyapal@1")
				.build();
		Response response= authService.login(loginRequest);
		LoginResponse loginResponse=response.as(LoginResponse.class);
		
		UserManagementProfileService uerManagementProfileService=new UserManagementProfileService();
		Response profileResponse= uerManagementProfileService.getProfile(loginResponse.getToken());
		UserProfileResponse userProfileResponse=profileResponse.as(UserProfileResponse.class);
		System.out.println(userProfileResponse.getEmail());
		Assert.assertEquals(profileResponse.statusCode(), 200);
				 
		
		
	}
	
	
	

}
