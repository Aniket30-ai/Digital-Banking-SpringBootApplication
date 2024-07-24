package com.digitalBank.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TransactionDto {

	private String transactionId;
	private String modeofTransaction;
	private Long paidTo;
	private Long receriverAccountNumber;
	private Double amount;
	private LocalDateTime transactionTime;
	private String remark;
	private Long paidFrom;
	private Long senderAccountNumber;
	
}
