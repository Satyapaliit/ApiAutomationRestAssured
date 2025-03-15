package com.api.base;

import java.util.HashMap;
import java.util.Map;

import com.api.models.request.LoginRequest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthService extends BaseService{
	private static final String BASE_PATH="/api/auth/";
	
	static
	{
		RestAssured.basePath="/api/auth/";
	}
	
	public Response login(Object payload)
	{
		return postRequest(payload, "login");
	}
	
	public Response forgotPassword(String email)
	{
		Map<String, String> payload=new HashMap<String, String>();
		payload.put("email", email);
		return postRequest(payload, "forgot-password");
	}
	
	public Response signUp(Object payload)
	{
		return postRequest(payload, "signup");
	}

}
