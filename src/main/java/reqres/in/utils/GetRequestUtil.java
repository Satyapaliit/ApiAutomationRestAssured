package reqres.in.utils;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GetRequestUtil {
	public Response getUsers(String uri)
	{
		return given()
		.header("Content-Type","application/json")
		.when()
		.get(uri);
	}
}
