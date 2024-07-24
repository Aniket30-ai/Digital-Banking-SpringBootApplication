package com.digitalBank.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class AccountDto {

	private Long accountNumber;
	private String bankName;
	private Double balance;
	private String accountType;
	private String ifscCode;
	private LocalDate openingDate;

	private UserDto userDto;
}
