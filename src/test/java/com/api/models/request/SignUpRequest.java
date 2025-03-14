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
public class SignUpRequest {
	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public static class Builder{
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		public Builder username(String username)
		{
			this.username=username;
			return this;
		}
		public Builder password(String password)
		{
			this.password=password;
			return this;
		}
		public Builder email(String email)
		{
			this.email=email;
			return this;
		}
		public Builder firstName(String firstName)
		{
			this.firstName=firstName;
			return this;
		}
		public Builder lastName(String lastName)
		{
			this.lastName=lastName;
			return this;
		}
		public Builder mobileNumber(String mobileNumber)
		{
			this.mobileNumber=mobileNumber;
			return this;
		}
		
		public SignUpRequest build()
		{
			return new SignUpRequest(username,password,email,firstName,lastName,mobileNumber);
		}
	}
	
	
}
