package com.digitalBank.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class DigitalBankAccount {

	@Id
	private String digitalBankingId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile_number")
	private User user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="account_number",unique = true)
	private BankAccount bankAccount;
	
	private String accountType;
	
}
