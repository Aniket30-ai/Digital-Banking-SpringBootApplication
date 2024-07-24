package com.digitalBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalBank.entity.DigitalBankAccount;

public interface DigitalBankRepository extends CrudRepository<DigitalBankAccount, String>{

}
