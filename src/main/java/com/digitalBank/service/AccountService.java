package com.digitalBank.service;

import java.util.List;

import com.digitalBank.dto.AccountDto;
import com.digitalBank.dto.BankAccountDto;
import com.digitalBank.dto.TransactionDto;
import com.digitalBank.exception.DigitalBankException;

public interface AccountService {

	String createAccount(AccountDto accountDto) throws DigitalBankException;

	List<BankAccountDto> listAccounts(Long mobileNo) throws DigitalBankException;

	String linkAccount(Long mobileNo, Long accountNo) throws DigitalBankException;

	Double checkBalance(Long mobileNo, Long accountNo) throws DigitalBankException;

	String fundTransfer(TransactionDto transactionDto) throws DigitalBankException;

	List<TransactionDto> accountStatement(Long mobileNo) throws DigitalBankException;

}
