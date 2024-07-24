package com.digitalBank.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalBank.entity.Transaction;

public interface TransactionRepository  extends CrudRepository<Transaction, String>{

}
