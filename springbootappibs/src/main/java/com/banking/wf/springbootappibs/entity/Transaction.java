package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity

public class Transaction {

	@Id
	@Column(length=10, nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String transID;
	
	@Column(length=5, nullable=false)
	private int savingsAccID;
	@Column(length=20, nullable=false)
	private String lastTransationDate;
	@Column(length=5, nullable=false)
	private Long toAcc;
	@Column(length=20, nullable=false)
	private double amount;
	@Column(length=50, nullable=false)
	private String message;
	@Column(length=16, nullable=false)
	private Long customerId;
	@Column(length=10, nullable=false)
	private String txnType;
	
	
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public int getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(int savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getLastTransationDate() {
		return lastTransationDate;
	}
	public void setLastTransationDate(String lastTransationDate) {
		this.lastTransationDate = lastTransationDate;
	}
	public Long getToAcc() {
		return toAcc;
	}
	public void setToAcc(Long toAcc) {
		this.toAcc = toAcc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTransID() {
		return transID;
	}
	public void setTransID(String transID) {
		this.transID = transID;
	}
	
	
	
	
}
