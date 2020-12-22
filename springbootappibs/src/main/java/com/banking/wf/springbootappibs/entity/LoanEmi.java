package com.banking.wf.springbootappibs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class LoanEmi {
	/*
	 * @TableGenerator(name="emi_id", initialValue = 10000)
	 * 
	 * @Id
	 * 
	 * @Column(name="Emi_Transaction_ID")
	 * 
	 * @GeneratedValue(strategy = GenerationType.TABLE)
	 */
	@Id
	@Column(length=5, nullable=false, name="Emi_Transaction_ID")
	@ColumnDefault("60000")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long emiTransId;
	private long loanId;
	private long customerID;
	@Column(length=100, nullable=false)
	private String month;
	@Column(length=4, nullable=false)
	private String year;
	@Column(length=100000000, nullable=false)
	private Double emiAmount;
	
	
	public long getEmiTransId() {
		return emiTransId;
	}
	public void setEmiTransId(long emiTransId) {
		this.emiTransId = emiTransId;
	}
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(long customerID) {
		this.customerID = customerID;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
     
}
