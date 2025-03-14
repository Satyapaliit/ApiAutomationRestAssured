package reqres.in.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import reqres.in.pojo.UserResponse;
import reqres.in.utils.GetRequestUtil;

public class GetRequestTest {
	
	@Test
	public void getUsers()
	{
		String baseUrl="https://reqres.in";
		String uri=baseUrl+"/api/users?page=2";
		GetRequestUtil getREquestUtil=new GetRequestUtil();
		Response response= getREquestUtil.getUsers(uri);
		int statusCode=response.getStatusCode();
		//System.out.println("Status Code:"+statusCode);
		//response.prettyPrint();
		
		UserResponse userResponse=response.as(UserResponse.class);
		System.out.println(userResponse.getData().get(0).getFirst_name());
		
	}

}
