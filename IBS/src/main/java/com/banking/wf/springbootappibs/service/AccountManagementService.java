package com.banking.wf.springbootappibs.service;

import java.util.List;


import com.banking.wf.springbootappibs.dto.BeneficiaryDTO;

import com.banking.wf.springbootappibs.dto.FixedDepositDTO;
import com.banking.wf.springbootappibs.dto.RecurringDepositDTO;
import com.banking.wf.springbootappibs.dto.SavingsAccountDTO;
import com.banking.wf.springbootappibs.dto.ServiceProviderDTO;
import com.banking.wf.springbootappibs.dto.TransactionDTO;
import com.banking.wf.springbootappibs.entity.Bank;
import com.banking.wf.springbootappibs.entity.Branch;

import com.banking.wf.springbootappibs.entity.FixedDeposit;
import com.banking.wf.springbootappibs.entity.RecurringDeposit;
import com.banking.wf.springbootappibs.entity.SavingsAccount;
import com.banking.wf.springbootappibs.entity.Transaction;

import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;





public interface AccountManagementService 
{
	public CustomerCredentialsDTO findCustomer(Long UID);
	public List<Bank> fetchAllbanks(String bankName);
	public List<Branch> fetchAllbranchs(Long bankBranchID);
	public List<FixedDeposit> fetchAllFDs(Long fixedDepositID);
	public List<RecurringDeposit> fetchAllRDs(Long recurringDepositID);
	public List<SavingsAccount> fetchAllSavingAcc(Long customerID);
	public List<Transaction> fetchAlltransactions(Long customerId);
	public List<Transaction> fetchMonTrans(Long customerID,String date);
	public CustomerDTO findDetails(Long customerID);
	public FixedDepositDTO saveFDDetails(FixedDepositDTO fixedDepositInputDto, Long customerID);
	public RecurringDepositDTO saveRDDetails(RecurringDepositDTO recurringDepositInputDto, Long customerID);
	public List<FixedDepositDTO> findFixedDeposit(Long customerID);
	public List<RecurringDepositDTO> findRecurringDeposit(Long customerID);
	public List<Transaction> fetchPerTrans(Long customerID,String startDate,String endDate);
	public List<Transaction> fetchAnnTrans(Long customerID,String year1,String year2);
	public SavingsAccountDTO saveSavingsDetails(SavingsAccountDTO savingsInputDto, Long customerID);
	public List<ServiceProviderDTO> fetchSPIdetails();
	public List<ServiceProviderDTO> fetchApprovedSPIdetails();
	public List<BeneficiaryDTO> fetchAllBeneficiary(Long customerID);
	public TransactionDTO saveTxnDetails(TransactionDTO transactionInputDto, Long customerID);
	public TransactionDTO saveSPTxnDetails(TransactionDTO transactionDTO, Long customerID);
	public TransactionDTO saveWithdrawTxnDetails(TransactionDTO transactionDTO, Long customerID);
	public ServiceProviderDTO SaveSPIdetails(ServiceProviderDTO serviceInputDto);
	
}








