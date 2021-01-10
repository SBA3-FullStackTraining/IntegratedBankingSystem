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
	@Column(length=5, nullable=false)
	@ColumnDefault("11111")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transID;
	
	@Column(length=5, nullable=false)
	private Long savingsAccID;
	@Column(length=20, nullable=false)
	private String lastTransationDate;
	//@Column(length=5, nullable=false)
	private Long toAcc;
	@Column(length=20, nullable=false)
	private Double amount;
	@Column(length=50)
	private String message;
	@Column(length=16, nullable=false)
	private Long customerId;
	@Column(length=100, nullable=false)
	private Double closingBal;
	@Column(length=10, nullable=false)
	private String txnType;
	
	
	public Double getClosingBal() {
		return closingBal;
	}
	public void setClosingBal(Double closingBal) {
		this.closingBal = closingBal;
	}
	
	
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public Long getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(Long savingsAccID) {
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getTransID() {
		return transID;
	}
	public void setTransID(Long transID) {
		this.transID = transID;
	}
	
	
}
