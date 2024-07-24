package com.digitalBank.serviceImpl;

import java.util.List;

import com.digitalBank.dto.AccountDto;
import com.digitalBank.dto.BankAccountDto;
import com.digitalBank.dto.TransactionDto;
import com.digitalBank.exception.DigitalBankException;
import com.digitalBank.service.AccountService;

public class AccountServiceImpl implements AccountService {

	@Override
	public String createAccount(AccountDto accountDto) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BankAccountDto> listAccounts(Long mobileNo) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String linkAccount(Long mobileNo, Long accountNo) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double checkBalance(Long mobileNo, Long accountNo) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fundTransfer(TransactionDto transactionDto) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TransactionDto> accountStatement(Long mobileNo) throws DigitalBankException {
		// TODO Auto-generated method stub
		return null;
	}

}
