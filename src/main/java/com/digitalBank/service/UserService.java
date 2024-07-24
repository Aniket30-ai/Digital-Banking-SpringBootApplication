package com.digitalBank.service;

import java.util.List;

import com.digitalBank.dto.LoginDto;
import com.digitalBank.dto.UserDto;
import com.digitalBank.exception.DigitalBankException;

public interface UserService {

	String createUser(UserDto userDto) throws DigitalBankException;
	
	boolean loginUser(LoginDto loginDto) throws DigitalBankException;
	
	public UserDto getUserProfile(String userId) throws DigitalBankException;
	
	List<UserDto> showUsers() throws DigitalBankException;
	
	
}
