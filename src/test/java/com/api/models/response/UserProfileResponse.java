package com.api.models.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileResponse {
	private int id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

}
