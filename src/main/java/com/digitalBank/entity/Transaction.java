package com.digitalBank.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Transaction {

	@Id
	private String transactionId;
	private String modeofTransaction;
	private Long paidTo;
	private Long receriverAccountNumber;
	private Double amount;
	@UpdateTimestamp
	private LocalDateTime transactionTime;
	private String remark;
	private Long paidFrom;
	private Long senderAccountNumber;
	
	
}
