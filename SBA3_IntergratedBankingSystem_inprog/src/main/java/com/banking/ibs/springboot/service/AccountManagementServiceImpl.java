package com.banking.ibs.springboot.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.ibs.springboot.dto.CustomerDTO;
import com.banking.ibs.springboot.entity.Customer;

import com.banking.ibs.springboot.respository.bankRepository;
import com.banking.ibs.springboot.respository.branchRepository;
import com.banking.ibs.springboot.respository.fixedDepositRepository;
import com.banking.ibs.springboot.respository.recurringDepositRepository;
import com.banking.ibs.springboot.respository.savingsAccountRepository;

import com.banking.ibs.springboot.dto.BankInputDTO;
import com.banking.ibs.springboot.dto.BankOutputDTO;
import com.banking.ibs.springboot.dto.BankDTO;
import com.banking.ibs.springboot.entity.Bank;

import com.banking.ibs.springboot.dto.BranchDTO;
import com.banking.ibs.springboot.entity.Branch;

import com.banking.ibs.springboot.dto.FixedDepositDTO;
import com.banking.ibs.springboot.entity.FixedDeposit;

import com.banking.ibs.springboot.dto.RecurringDepositDTO;
import com.banking.ibs.springboot.entity.RecurringDeposit;

import com.banking.ibs.springboot.dto.SavingsAccountDTO;
import com.banking.ibs.springboot.entity.SavingsAccount;


@Service
public class AccountManagementServiceImpl implements AccountManagementService{

	// injecting a dependency
	@Autowired
	private bankRepository bankrepository;
	
	
	// utility method
			private BankDTO convertBankEntityToOutputDto(Bank bank) {
				BankDTO bankOutputDTO = new BankDTO(bank.getBankBranch(),bank.getBankLocation(),bank.getBankName());
				return bankOutputDTO;
				
				
			}
			
			private Bank convertBankInputDtoToEntity(BankDTO bankInputDto) {
				Bank bank = new Bank();
				
				bank.setBankLocation(bankInputDto.getBankLocation());
				bank.setBankName(bankInputDto.getBankName());
				
				return bank;
			}
			
	@Override
	public List<BankDTO> fetchAllbanks(String bankName) {
		List<Bank> banks = this.bankrepository.findAll();
		
		List<BankDTO> bankDtos=
				banks.stream()
				 .map(this :: convertBankEntityToOutputDto)
				 .collect(Collectors.toList());

				
		return bankDtos;
	}


	// injecting a dependency
	@Autowired
	private branchRepository branchrepository;
	
	private BranchDTO convertBranchEntityToOutputDto(Branch branch) {
		BranchDTO branchOutputDTO = new BranchDTO(branch.getBankBranchID(),branch.getIFSC_code(),branch.getBankAddress());
		return branchOutputDTO;
		
		
	}
	
	private Branch convertBranchInputDtoToEntity(BranchDTO branchInputDto) {
		Branch branch = new Branch();
		
		branch.setIFSC_code(branchInputDto.getIFSC_code());
		branch.setBankAddress(branchInputDto.getBankAddress());
		
		return branch;
	}
	
	@Override
	public List<BranchDTO> fetchAllbranchs(Long bankBranchID) {
		List<Branch> branchs = this.branchrepository.findAll();
		
		List<BranchDTO> branchDtos=
				branchs.stream()
				 .map(this :: convertBranchEntityToOutputDto)
				 .collect(Collectors.toList());

				
		return branchDtos;
	}
	
	// injecting a dependency
		@Autowired
		private fixedDepositRepository fixdeporepository;
		
		// utility method
		
				/*	private FixedDepositDTO convertFDEntityToOutputDto(FixedDeposit fixedDeposit) {
						FixedDepositDTO fixedDepOutputDTO = new FixedDepositDTO(fixedDeposit.getCustomerID(),fixedDeposit.getFixedDepositAmt(),fixedDeposit.
						return fixedDepOutputDTO;
						
						
					}
					
					private FixedDeposit convertFDInputDtoToEntity(FixedDepositDTO fixedDepoInputDto) {
						FixedDeposit fixedDepoit = new FixedDeposit();
						
						fixedDepoit.setBankLocation(fixedDepoInputDto.getBankLocation());
						fixedDepoit.setBankName(fixedDepoInputDto.getBankName());
						
						return fixedDepoit;
					}
					*/
		@Override
		public List<FixedDepositDTO> fetchAllFDs(Long fixedDepositID) {
		// TODO Auto-generated method stub
		List<FixedDeposit> fixedDeposits = this.fixdeporepository.findAll();

				

				
		return null;
	}

	
	// injecting a dependency
	@Autowired
	private recurringDepositRepository recdeporepository;
	// utility method
	@Override
	public List<RecurringDepositDTO> fetchAllRDs(Long recurringDepositID) {

		List<RecurringDeposit> recurringDeposits = this.recdeporepository.findAll();
		
		
				
		return null;
	}




	// injecting a dependency
	@Autowired
	private savingsAccountRepository savingsrepository;
	// utility method
	
	@Override
	public List<SavingsAccountDTO> fetchAllSavingAcc(Long savingsAccID) {
		List<SavingsAccount> savingsAccounts = this.savingsrepository.findAll();
		
		

				
		return null;
	}

	
	

}
