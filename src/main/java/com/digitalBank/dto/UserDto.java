package com.digitalBank.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserDto {

	private Long mobileNumber;

	private String userId;
	private String userName;
	private String gender;
	private LocalDate dateOfBirth;
	private String emailId;
	private String password;
	private String address;
	private String panCard;

}
