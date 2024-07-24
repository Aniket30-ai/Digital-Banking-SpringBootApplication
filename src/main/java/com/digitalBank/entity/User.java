package com.digitalBank.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Long mobileNumber;

	@Column(unique = true)
	private String userId;
	private String userName;
	private String gender;
	private LocalDate dateOfBirth;
	private String emailId;
	private String password;
	private String address;
	@Column(name = "PAN")
	private String panCard;

}
