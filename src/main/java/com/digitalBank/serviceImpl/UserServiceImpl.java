package com.digitalBank.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalBank.dto.LoginDto;
import com.digitalBank.dto.UserDto;
import com.digitalBank.entity.User;
import com.digitalBank.exception.DigitalBankException;
import com.digitalBank.repository.UserRepository;
import com.digitalBank.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String createUser(UserDto userDto) throws DigitalBankException {
		// TODO Auto-generated method stub

		Optional<User> mobileNumber = userRepository.findByMobileNumber(userDto.getMobileNumber());
		if (mobileNumber.isPresent()) {
			throw new DigitalBankException("USER_MOBILE_NUMBER_ALREADY_REGISTER");
			
		}
		
		User user = new User();
		user.setAddress(userDto.getAddress());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setEmailId(userDto.getEmailId());
		user.setGender(userDto.getGender());
		user.setMobileNumber(userDto.getMobileNumber());
		user.setPanCard(userDto.getPanCard());
		user.setPassword(userDto.getPassword());
		user.setUserId(userDto.getUserId());
		user.setUserName(userDto.getUserName());
		userRepository.save(user);
		return "User added sucessfully";
	}

	@Override
	public boolean loginUser(LoginDto loginDto) throws DigitalBankException {
		// TODO Auto-generated method stub
		
		Optional<User> mobileNumber = userRepository.findByMobileNumber(loginDto.getMobileNumber());
		
		if(mobileNumber.isEmpty()) {
			throw new DigitalBankException("USER_CREDENTIAL_INVALID");
		}
		
		String password = mobileNumber.get().getPassword();
		
		if(!loginDto.getPassword().equals(password)) {
			throw new DigitalBankException("USER_CREDENTIAL_INVALID");
		}
		return true;
	}

	@Override
	public UserDto getUserProfile(String userId) throws DigitalBankException {
		// TODO Auto-generated method stub
		Optional<User> byUserId = userRepository.findByUserId(userId);
		User user = byUserId.orElseThrow(() -> new DigitalBankException("USER_ID_NOT_FOUND"));

		UserDto userdto = new UserDto();
		userdto.setAddress(user.getAddress());
		userdto.setDateOfBirth(user.getDateOfBirth());
		userdto.setEmailId(user.getEmailId());
		userdto.setGender(user.getGender());
		userdto.setMobileNumber(user.getMobileNumber());
		userdto.setPanCard(user.getPanCard());
		userdto.setUserId(user.getUserId());
		userdto.setPassword(user.getPassword());
		userdto.setUserName(user.getUserName());

		return userdto;
	}

	@Override
	public List<UserDto> showUsers() throws DigitalBankException {
		// TODO Auto-generated method stub
		Iterable<User> user = userRepository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		user.forEach(u->{
			UserDto userDto = new UserDto();
			userDto.setAddress(u.getAddress());
			userDto.setDateOfBirth(u.getDateOfBirth());
			userDto.setEmailId(u.getEmailId());
			userDto.setGender(u.getGender());
			userDto.setMobileNumber(u.getMobileNumber());
			userDto.setPanCard(u.getPanCard());
			userDto.setPassword(u.getPassword());
			userDto.setUserId(u.getUserId());
			userDto.setUserName(u.getUserName());
			userDtos.add(userDto);
			});
		
		return userDtos;
	}

}
