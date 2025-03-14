package reqres.in.api;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import reqres.in.pojo.PostRequestBody;
import reqres.in.pojo.PostRequestResponse;
import reqres.in.utils.PostRequestUtil;

public class PostRequestTest {
	
	@Test
	public void createUserTest()
	{
		RestAssured.baseURI="https://reqres.in/api";
		//PostRequestBody postRequestBody=new PostRequestBody("Satya", "Engineer");
		ObjectMapper objMapper=new ObjectMapper();
		PostRequestBody postRequestBody=null;
		try {
			postRequestBody = objMapper.readValue(new File("C:\\Users\\satya\\eclipse-workspace\\ApiAutomationRestAssured\\src\\main\\resources\\NewUser.json"), PostRequestBody.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, String> headers=new HashMap();
		headers.put("Content-Type","application/json");
		headers.put("Authorization","Satyapal");
		
		PostRequestUtil postRequestUtil=new PostRequestUtil();
		Response response= postRequestUtil.createUser("/users", postRequestBody, headers);
		PostRequestResponse postRequestResponse=response.as(PostRequestResponse.class);
		System.out.println(postRequestResponse.getJob());
	}

}
