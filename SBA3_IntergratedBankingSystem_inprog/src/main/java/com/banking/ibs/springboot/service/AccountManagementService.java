package com.banking.ibs.springboot.service;

import java.util.List;

import com.banking.ibs.springboot.dto.BankDTO;
import com.banking.ibs.springboot.dto.BranchDTO;
import com.banking.ibs.springboot.dto.FixedDepositDTO;
import com.banking.ibs.springboot.dto.RecurringDepositDTO;
import com.banking.ibs.springboot.dto.SavingsAccountDTO;




public interface AccountManagementService 
{
	public List<BankDTO> fetchAllbanks(String bankName);
	public List<BranchDTO> fetchAllbranchs(Long bankBranchID);
	public List<FixedDepositDTO> fetchAllFDs(Long fixedDepositID);
	public List<RecurringDepositDTO> fetchAllRDs(Long recurringDepositID);
	public List<SavingsAccountDTO> fetchAllSavingAcc(Long savingsAccID);
	


}



