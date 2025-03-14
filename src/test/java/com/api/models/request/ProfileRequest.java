package com.api.models.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileRequest {
	private int id;
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

}
