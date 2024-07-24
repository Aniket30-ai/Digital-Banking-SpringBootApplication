package com.digitalBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalBank.entity.BankAccount;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long>{

}
