package com.banking.ibs.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class SavingsAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int savingsAccID;
	private int customerID;
	private double avlBalance;
	private String accHolderName;
	
	public int getSavingsAccID() {
		return savingsAccID;
	}
	public void setSavingsAccID(int savingsAccID) {
		this.savingsAccID = savingsAccID;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public double getAvlBalance() {
		return avlBalance;
	}
	public void setAvlBalance(double avlBalance) {
		this.avlBalance = avlBalance;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
}
