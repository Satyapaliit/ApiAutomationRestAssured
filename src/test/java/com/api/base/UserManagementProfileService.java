package com.api.base;

import io.restassured.response.Response;

public class UserManagementProfileService extends BaseService {
	private static final String BASE_PATH="/api/users/";
	
	public Response getProfile(String AuthorizationToken)
	{
		setAuthToken(AuthorizationToken);
		return getRequest(BASE_PATH+"profile");
	}

}
