package com.digitalBank.dto;

import lombok.Data;

@Data
public class DigitalBankAccountDto {

	private String digitalBankingId;

	private UserDto userDto;

	private BankAccountDto bankAccountDto;

	private String accountType;
}
