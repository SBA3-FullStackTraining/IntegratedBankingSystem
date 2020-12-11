package com.banking.ibs.springboot.old_model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Transaction {

	@NotNull(message = "Txn ID is required!")
	private int id;
	@NotNull(message = "Payer ID is required!")
	private int payer_id;
	@NotNull(message = "Payee ID is required!")
	private int payee_id;
	@NotNull(message = "Amount is required!")
	private BigDecimal amount;
	@NotBlank(message = "Txn Type is required!")
	private String transactionType;
	@NotBlank(message = "Description is required!")
	private String description;
	@NotBlank(message = "Status is required!")
	private String status;
	@NotNull(message = "Txn Time is required!")
	private Timestamp transactionTime;
	
	public Transaction(int id, int payer_id, int payee_id, BigDecimal amount, String transactionType,
			String description, String status, Timestamp transactionTime) {
		super();
		this.id = id;
		this.payer_id = payer_id;
		this.payee_id = payee_id;
		this.amount = amount;
		this.transactionType = transactionType;
		this.description = description;
		this.status = status;
		this.transactionTime = transactionTime;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPayer_id() {
		return payer_id;
	}
	public void setPayer_id(int payer_id) {
		this.payer_id = payer_id;
	}
	public int getPayee_id() {
		return payee_id;
	}
	public void setPayee_id(int payee_id) {
		this.payee_id = payee_id;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}
	
	
}
