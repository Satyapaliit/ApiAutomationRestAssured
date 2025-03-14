package reqres.in.utils;

import static io.restassured.RestAssured.given;

import java.util.Map;

import io.restassured.response.Response;
import reqres.in.pojo.PostRequestBody;

public class PostRequestUtil {
	public Response createUser(String uri,PostRequestBody postRequestBody,Map<String, String> headers)
	{
		return given()
		.headers(headers)
		.body(postRequestBody)
		.when()
		.post(uri)
		.then()
		.statusCode(201)
		.extract()
		.response();
	}

}
