package com.digitalBank.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digitalBank.dto.LoginDto;
import com.digitalBank.dto.UserDto;
import com.digitalBank.exception.DigitalBankException;
import com.digitalBank.serviceImpl.UserServiceImpl;

@RestController
@RequestMapping(value = "user")
public class UserApi {

	@Autowired
	UserServiceImpl  userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> createUser(@RequestBody UserDto  userDto) throws DigitalBankException {
		String user = userService.createUser(userDto);
		return new ResponseEntity<String>(user,HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	 public ResponseEntity<String> loginUser(@RequestBody LoginDto loginDto) throws DigitalBankException {
		userService.loginUser(loginDto);
		String msg="Congratulation you are login sucess";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	@GetMapping("/getUser/{userId}")
	public ResponseEntity<UserDto>  getUser(@PathVariable String userId) throws DigitalBankException {
		UserDto userProfile = userService.getUserProfile(userId);
		return new ResponseEntity<UserDto>(userProfile,HttpStatus.OK);
	}
	
	
	@GetMapping("/showUser")
	public ResponseEntity<List<UserDto>> showUser() throws DigitalBankException {
		List<UserDto> showUsers = userService.showUsers();
		return new ResponseEntity<List<UserDto>>(showUsers,HttpStatus.OK);
	}
}

