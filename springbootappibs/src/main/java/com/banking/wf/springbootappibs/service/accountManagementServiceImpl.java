package com.banking.wf.springbootappibs.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.wf.springbootappibs.dto.BankDTO;
import com.banking.wf.springbootappibs.dto.BranchDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.FixedDepositDTO;
import com.banking.wf.springbootappibs.dto.RecurringDepositDTO;
import com.banking.wf.springbootappibs.dto.TransactionDTO;
import com.banking.wf.springbootappibs.entity.Bank;
import com.banking.wf.springbootappibs.entity.Branch;
import com.banking.wf.springbootappibs.entity.Customer;
import com.banking.wf.springbootappibs.entity.CustomerCredentials;
import com.banking.wf.springbootappibs.entity.FixedDeposit;
import com.banking.wf.springbootappibs.entity.RecurringDeposit;
import com.banking.wf.springbootappibs.entity.SavingsAccount;
import com.banking.wf.springbootappibs.entity.Transaction;
import com.banking.wf.springbootappibs.repository.BankRepository;
import com.banking.wf.springbootappibs.repository.BranchRepository;
import com.banking.wf.springbootappibs.repository.CustomerCredentialsRepository;
import com.banking.wf.springbootappibs.repository.CustomerRepository;
import com.banking.wf.springbootappibs.repository.FixedDepositRepository;
import com.banking.wf.springbootappibs.repository.RecurringDepositRepository;
import com.banking.wf.springbootappibs.repository.SavingsAccountRepository;
import com.banking.wf.springbootappibs.repository.TransactionRepository;




@Service
public class accountManagementServiceImpl implements accountManagementService{

	// injecting a dependency
	@Autowired
	private BankRepository bankrepository;
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CustomerCredentialsRepository customerCredentialsRepository;
	
	@Autowired
	private FixedDepositRepository fixedDepositRepository;
	
	@Autowired
	private CustomerRepository CustomerRepository;
	
	@Autowired
	private RecurringDepositRepository RecurringDepositRepository;
	
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
	public List<Bank> fetchAllbanks(String bankName) {
		List<Bank> banks = this.bankrepository.findAll();
		
		List<BankDTO> bankDtos=
				banks.stream()
				 .map(this :: convertBankEntityToOutputDto)
				 .collect(Collectors.toList());

				
		return null;
	}


	// injecting a dependency
	@Autowired
	private BranchRepository branchrepository;
	
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
	public List<Branch> fetchAllbranchs(Long bankBranchID) {
		List<Branch> branchs = this.branchrepository.findAll();
		
		List<BranchDTO> branchDtos=
				branchs.stream()
				 .map(this :: convertBranchEntityToOutputDto)
				 .collect(Collectors.toList());

				
		return null;
	}
	
	// injecting a dependency
		@Autowired
		private FixedDepositRepository fixdeporepository;
		
		
		
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
		public List<FixedDeposit> fetchAllFDs(Long fixedDepositID) {
		// TODO Auto-generated method stub
		List<FixedDeposit> fixedDeposits = this.fixdeporepository.findAll();

				

				
		return null;
	}

	
	// injecting a dependency
	@Autowired
	private RecurringDepositRepository recdeporepository;
	// utility method
	@Override
	public List<RecurringDeposit> fetchAllRDs(Long recurringDepositID) {

		List<RecurringDeposit> recurringDeposits = this.recdeporepository.findAll();
		
		
				
		return null;
	}




	// injecting a dependency
	@Autowired
	private SavingsAccountRepository savingsrepository;
	// utility method
	
	@Override
	public List<SavingsAccount> fetchAllSavingAcc(Long CustomerId) {
		System.out.println(CustomerId);
		List<SavingsAccount> savingsAccounts = this.savingsrepository.findByCustomerId(CustomerId);
		
		return savingsAccounts;
	}
	
	@Autowired
	private TransactionRepository statementGenerationRepository;
	@Override
	public List<Transaction> fetchAlltransactions(Long CustomerId) {
		// TODO Auto-generated method stub
		 List<Transaction> statement = this.statementGenerationRepository.findByCustomerId(CustomerId);	
		 //System.out.println(statement);
			//Collections.sort(statement,Collections.reverseOrder());
			return statement;
	}


	private CustomerCredentialsDTO convertEntityToOutputDto(CustomerCredentials customerCredentails) 
	{
		CustomerCredentialsDTO custOutputDto = new CustomerCredentialsDTO();
		//custOutputDto.setuId(customerCredentails.getUid());
		//custOutputDto.setPassword(customerCredentails.getPswd());
		
		
		return custOutputDto;
	}
	
	
	 private CustomerDTO convertCusEntityToOutputDto(Customer customerDetails) 
	{
		 CustomerDTO customerDto = new CustomerDTO();
		//custOutputDto.setuId(customerCredentails.getUid());
		//custOutputDto.setPassword(customerCredentails.getPswd());
		 customerDto.setFirstName(customerDetails.getFirstName());
		 customerDto.setLastName(customerDetails.getLastName());
		 
		
		return customerDto;
	} 
	
	
	
	@Override
	public CustomerCredentialsDTO findCustomer(Long UID) {
		// TODO Auto-generated method stub
		CustomerCredentials customerCredentails = this.customerCredentialsRepository.getOne(UID);//.findById(UID).orElse(null);
		CustomerCredentialsDTO customerCredentailsdto = this.convertEntityToOutputDto(customerCredentails);
		
		return customerCredentailsdto;
	}
	
	@Override
	public synchronized CustomerDTO findDetails(Long UID) {
		// TODO Auto-generated method stub
		Customer customerDetails = this.CustomerRepository.getOne(UID);//.findById(UID).orElse(null);
		CustomerDTO customerDto = this.convertCusEntityToOutputDto(customerDetails);
		
		return customerDto;
	}

	
	
	@Override
	public List<Transaction> fetchMonTrans(Long id,String date) {
		// TODO Auto-generated method stub
		
		 List<Transaction> statement = this.statementGenerationRepository.findBylastTransationDate(id,date);	
		
		
		return statement;
		
	}
	
	@Override
	public FixedDepositDTO saveFDDetails(FixedDepositDTO fixedDepositInputDto,Long customerID) {
		FixedDeposit fixedDeposit=this.convertFDInputDtoToEntity(fixedDepositInputDto);
		
		fixedDeposit.setCustomerID(customerID);
		String applicationDate = fixedDepositInputDto.getApplicationDate();
		int term = fixedDepositInputDto.getterm();
		//Maturity date
		Calendar cal = Calendar.getInstance();
		int endyear = (int) Math.ceil(term);
		cal.add(Calendar.YEAR, endyear);
		String fdMaturityDate = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		fixedDeposit.setMaturityDate(fdMaturityDate);
		//Total Amount after Maturity
		double depositAmt = fixedDepositInputDto.getFixedDepositAmt();
		double interestamount = (depositAmt*1*6.5)/100;
		double totalAmount = depositAmt+interestamount;
		fixedDeposit.setTotalAmt(totalAmount);
		fixedDeposit.setInterestAmt(interestamount);
		
		FixedDeposit newFixedDeposit=this.fixedDepositRepository.save(fixedDeposit);
		FixedDepositDTO fixedDepositDTO = this.convertFDEntityToOutputDto(newFixedDeposit);
			
		return fixedDepositDTO;
	}
	

	private Transaction convertTxnInputDtoToEntity(
			TransactionDTO transactionInputDto) {
		Transaction transaction =new Transaction();
		transaction.setCustomerId(transactionInputDto.getCustomerId());
		transaction.setAmount(transactionInputDto.getAmount());
		transaction.setLastTransationDate(transactionInputDto.getLastTransationDate());
		transaction.setMessage(transactionInputDto.getMessage());
		transaction.setSavingsAccID(transactionInputDto.getSavingsAccID());
		transaction.setToAcc(transactionInputDto.getToAcc());
		transaction.setTransID(transactionInputDto.getTransID());
		transaction.setTxnType(transactionInputDto.getTxnType());
		
		return transaction;
	}
	
	private FixedDeposit convertFDInputDtoToEntity(
			FixedDepositDTO fixedDepositInputDto) {
		FixedDeposit fixedDeposit =new FixedDeposit();
		
		fixedDeposit.setAccHolderName(fixedDepositInputDto.getAccHolderName());
		fixedDeposit.setApplicationDate(fixedDepositInputDto.getApplicationDate());
		
		fixedDeposit.setFixedDepositAmt(fixedDepositInputDto.getFixedDepositAmt());
		//fixedDeposit.setfixedDepositID(fixedDepositInputDto.getFixedDepositID());
		//fixedDeposit.setMaturityDate(fixedDepositInputDto.getMaturityDate());
		fixedDeposit.setROI(fixedDepositInputDto.getROI());
		fixedDeposit.setTerm(fixedDepositInputDto.getterm());
		//fixedDeposit.setTotalAmt(fixedDepositInputDto.getTotalAmt());
		
		return fixedDeposit;
	}
	
	private FixedDepositDTO convertFDEntityToOutputDto(FixedDeposit newFixedDeposit) {
		
		FixedDepositDTO fixedDepositDTO =new FixedDepositDTO();
		fixedDepositDTO.setCustomerID(newFixedDeposit.getCustomerID());
		fixedDepositDTO.setAccHolderName(newFixedDeposit.getAccHolderName());
		fixedDepositDTO.setApplicationDate(newFixedDeposit.getApplicationDate());
		fixedDepositDTO.setInterestAmt(newFixedDeposit.getInterestAmt());
		fixedDepositDTO.setFixedDepositAmt(newFixedDeposit.getFixedDepositAmt());
		fixedDepositDTO.setFixedDepositID(newFixedDeposit.getfixedDepositID());
		fixedDepositDTO.setMaturityDate(newFixedDeposit.getMaturityDate());
		fixedDepositDTO.setROI(newFixedDeposit.getROI());
		fixedDepositDTO.setterm(newFixedDeposit.getTerm());
		fixedDepositDTO.setTotalAmt(newFixedDeposit.getTotalAmt());
		
		return fixedDepositDTO;
	}
	
	
	private RecurringDeposit convertRDInputDtoToEntity(RecurringDepositDTO recurringDepositInputDto) {
		RecurringDeposit recurringDeposit =new RecurringDeposit();
		
		recurringDeposit.setAccHolderName(recurringDepositInputDto.getAccHolderName());
		recurringDeposit.setApplicationDate(recurringDepositInputDto.getApplicationDate());
		recurringDeposit.setCustomerID(recurringDepositInputDto.getCustomerID());
		recurringDeposit.setMaturityDate(recurringDepositInputDto.getMaturityDate());
		recurringDeposit.setMonthlydeposit(recurringDepositInputDto.getMonthlydeposit());
		recurringDeposit.setRecurringDepositID(recurringDepositInputDto.getRecurringDepositID());
		recurringDeposit.setROI(recurringDepositInputDto.getROI());
		recurringDeposit.setTerm(recurringDepositInputDto.getTerm());
		recurringDeposit.setTotalDepositAmt(recurringDepositInputDto.gettotalAmt());
		
		return recurringDeposit;
	}
	
	private RecurringDepositDTO convertRDEntityToOutputDto(RecurringDeposit newRecurringDeposit) {
		
		RecurringDepositDTO recurringDepositDTO =new RecurringDepositDTO();
		recurringDepositDTO.setAccHolderName(newRecurringDeposit.getAccHolderName());
		recurringDepositDTO.setApplicationDate(newRecurringDeposit.getApplicationDate());
		recurringDepositDTO.setCustomerID(newRecurringDeposit.getCustomerID());
		recurringDepositDTO.setMaturityDate(newRecurringDeposit.getMaturityDate());
		recurringDepositDTO.setMonthlydeposit(newRecurringDeposit.getMonthlydeposit());
		recurringDepositDTO.setRecurringDepositID(newRecurringDeposit.getRecurringDepositID());
		recurringDepositDTO.setROI(newRecurringDeposit.getROI());
		recurringDepositDTO.setTerm(newRecurringDeposit.getTerm());
		recurringDepositDTO.settotalAmt(newRecurringDeposit.getTotalDepositAmt());
		recurringDepositDTO.setInterestAmt(newRecurringDeposit.getInterestAmount());
		
		return recurringDepositDTO;
	}

	@Override
	public List<FixedDepositDTO> findFixedDeposit(Long customerID) {
		// TODO Auto-generated method stub
		
		List<FixedDeposit> fixeddeposit = this.fixedDepositRepository.findByCustomerID(customerID);
		List<FixedDepositDTO> fixedDepositDto = fixeddeposit.stream()
				 .map(this :: convertFDEntityToOutputDto)
				 .collect(Collectors.toList());
				
		return fixedDepositDto;
	}

	@Override
	public RecurringDepositDTO saveRDDetails(RecurringDepositDTO recurringDepositInputDto,Long customerID) {
		RecurringDeposit recurringDeposit=this.convertRDInputDtoToEntity(recurringDepositInputDto);
		
		recurringDeposit.setCustomerID(customerID);
		String applicationDate = recurringDepositInputDto.getApplicationDate();
		int term = recurringDepositInputDto.getTerm();
		//Maturity date
		Calendar cal = Calendar.getInstance();
		int endyear = (int) Math.ceil(term);
		cal.add(Calendar.YEAR, endyear);
		String fdMaturityDate = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
		recurringDeposit.setMaturityDate(fdMaturityDate);
		//Total Amount after Maturity
		double monthlyDeposit = recurringDepositInputDto.getMonthlydeposit();
		double interestamount = (monthlyDeposit*term*10)/100;
		double totalAmount = monthlyDeposit*term*12+interestamount;
		recurringDeposit.setTotalDepositAmt(totalAmount);
		recurringDeposit.setInterestAmount(interestamount);
		
		RecurringDeposit newRecurringDeposit=this.RecurringDepositRepository.save(recurringDeposit);
		RecurringDepositDTO recurringDepositDTO = this.convertRDEntityToOutputDto(newRecurringDeposit);
			
		return recurringDepositDTO;
	}

	
	@Override
	public List<RecurringDepositDTO> findRecurringDeposit(Long customerID) {
		// TODO Auto-generated method stub
		
		List<RecurringDeposit> recurringdeposit = this.RecurringDepositRepository.findByCustomerID(customerID);
		List<RecurringDepositDTO> recurringDepositDto = recurringdeposit.stream()
				 .map(this :: convertRDEntityToOutputDto)
				 .collect(Collectors.toList());
				
		return recurringDepositDto;
	}
}
