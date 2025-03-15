package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.api.base.AuthService;
import com.api.base.UserManagementProfileService;
import com.api.models.request.LoginRequest;
import com.api.models.request.ProfileRequest;
import com.api.models.request.UpdateProfileRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UpdateProfileAPITest {

	@Test
	public void UpdateProfileTest() {
		ProfileRequest profileRequest = ProfileRequest.builder()
				.firstName("s")
				.lastName("Kumar")
				.email("Satyapaliit@gmail.com")
				.mobileNumber("8126635569")
				.build();

		AuthService authService = new AuthService();
		LoginRequest loginRequest = LoginRequest.builder().username("Satyapaliit@gmail.com").password("Satyapal@1")
				.build();
		Response response = authService.login(loginRequest);
		LoginResponse loginResponse = response.as(LoginResponse.class);
		
		System.out.println("Token:"+loginResponse.getToken());
	
		System.out.println("-----------------------------------------------------------------------------------");
		
		UserManagementProfileService userManagementProfileService = new UserManagementProfileService();
		Response userProfileResponse=userManagementProfileService.getProfile(loginResponse.getToken());
		System.out.println(userProfileResponse.asPrettyString());
		System.out.println("-----------------------------------------------------------------------------------");
		

		Response updateProfileResponse= userManagementProfileService.updateProfile(profileRequest, loginResponse.getToken());
		System.out.println(updateProfileResponse.asPrettyString());
		//Assert.assertEquals(updateProfileResponse.getLastName(), "Kumar");
		
	}

}
