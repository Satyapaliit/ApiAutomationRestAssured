package com.api.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*use BuilderDesign pattern to not strees upon the 
sequence of constructor parameter, and to create the object efficiently
with specific parameters
* use static inner class

*
*/

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProfileRequest {
	private int id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public static UpdateProfileRequestBuilder Builder()
	{
		return new UpdateProfileRequestBuilder();
	}
	public static class UpdateProfileRequestBuilder{
		private int id;
		private String username;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		
		public UpdateProfileRequestBuilder id(int id)
		{
			this.id=id;
			return this;
		}
		public UpdateProfileRequestBuilder username(String username)
		{
			this.username=username;
			return this;
		}
		public UpdateProfileRequestBuilder email(String email)
		{
			this.email=email;
			return this;
		}
		public UpdateProfileRequestBuilder firstName(String firstName)
		{
			this.firstName=firstName;
			return this;
		}
		public UpdateProfileRequestBuilder lastName(String lastName)
		{
			this.lastName=lastName;
			return this;
		}
		public UpdateProfileRequestBuilder mobileNumber(String mobileNumber)
		{
			this.mobileNumber=mobileNumber;
			return this;
		}
		
		public UpdateProfileRequest build()
		{
			return new UpdateProfileRequest(id,username,email,firstName,lastName,mobileNumber);
		}
	}
	
	
}
