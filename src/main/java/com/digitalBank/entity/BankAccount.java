package com.digitalBank.entity;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class BankAccount {


	@Id
	private Long accountNumber;
	private String bankName;
	private Double balance;
	private String accountType;
	private String ifscCode;
	@UpdateTimestamp
	private LocalDate openingDate;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mobile_number")
	private User user;
	
}
