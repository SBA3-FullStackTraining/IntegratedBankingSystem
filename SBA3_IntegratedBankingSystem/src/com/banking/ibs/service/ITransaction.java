package com.banking.ibs.service;

public interface ITransaction {

	public void displayBalance(int accountNumber);
	public void depositMoney(int accountNumber, int amount);
	public void withdrawMoney(int accountNumber, int amount);
	public void transferMoney(int accountNumber, int amount, int payee_accountNumber);
}
