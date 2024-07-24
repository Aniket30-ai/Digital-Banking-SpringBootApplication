package com.digitalBank.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.digitalBank.entity.User;

public interface UserRepository  extends CrudRepository<User, Long>{

	Optional<User> findByMobileNumber(Long mobileNo);
	
	Optional<User> findByUserId(String userId);
}
