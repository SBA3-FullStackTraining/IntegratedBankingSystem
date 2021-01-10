package com.banking.wf.springbootappibs.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.banking.wf.springbootappibs.dto.LoanDTO;
import com.banking.wf.springbootappibs.dto.LoanEmiDTO;
import com.banking.wf.springbootappibs.dto.LoanOutputDTO;
import com.banking.wf.springbootappibs.entity.Loan;
import com.banking.wf.springbootappibs.entity.LoanEmi;
import com.banking.wf.springbootappibs.repository.loanEmiRepository;
import com.banking.wf.springbootappibs.repository.loanRepository;



public class LoanManagementServiceimpl implements LoanManagementService {
	
	//imp dependency
	@Autowired
	private loanRepository loanrepository;
	private loanEmiRepository loanemirepository;
	
	public Loan convertloanDtotoLoanEntity(LoanDTO loandto) {
		
		Loan loan = new Loan();
		loan.setCustomerId(loandto.getCustomerId());
		loan.setLoanAmount(loandto.getLoanAmount());
		loan.setLoanApplicationDate(loandto.getLoanApplicationDate());
		loan.setLoanName(loandto.getLoanName());
		loan.setBillingIndicator(loandto.getBillingIndicator());
		loan.setBusinessStructure(loandto.getBusinessStructure());
		loan.setTaxIndicator(loandto.getTaxIndicator());
		loan.setLoanTenure(loandto.getLoanTenure());
		
		
		return loan;
	}

	
    public LoanOutputDTO convertloanEntitytoloanoutputDto(Loan loan) {
    	
    	LoanOutputDTO loanoutputdto = new LoanOutputDTO();
    	loanoutputdto.setLoanId(loan.getloanId());
    	loanoutputdto.setCustomerId(loan.getCustomerId());
    	loanoutputdto.setBillingIndicator(loan.getBillingIndicator());
    	loanoutputdto.setBusinessStructure(loan.getBusinessStructure());
    	loanoutputdto.setLoanAmount(loan.getLoanAmount());
    	loanoutputdto.setLoanApplicationDate(loan.getLoanApplicationDate());
    	loanoutputdto.setLoanName(loan.getLoanName());
    	loanoutputdto.setLoanTenure(loan.getLoanTenure());
    	loanoutputdto.setRemark(loan.getRemark());
		return loanoutputdto;
    	
    } 
    
    public LoanEmi convertLoanEMIDTOtoentity(LoanEmiDTO loanemidto) {
    LoanEmi loanemi = new LoanEmi();
    loanemi.setLoanId(loanemidto.getLoanId());
    loanemi.setCustomerId(loanemidto.getCustomerId());
    loanemi.setEmiAmount(loanemidto.getEmiAmount());
    loanemi.setMonth(loanemidto.getMonth());
    loanemi.setYear(loanemidto.getYear());
       
    return loanemi;
    }
    public LoanEmiDTO convertLoanemiEntitytoLoanEmiDto(LoanEmi loanemi) {
    LoanEmiDTO loanemidto = new LoanEmiDTO();
    loanemidto.setEmiTransId(loanemi.getEmiTransId());
    loanemidto.setLoanId(loanemi.getLoanId());
    loanemidto.setCustomerId(loanemi.getCustomerId());
    loanemidto.setEmiAmount(loanemi.getEmiAmount());
    loanemidto.setMonth(loanemi.getMonth());
    loanemidto.setYear(loanemi.getYear());
       
    return loanemidto;
    }
    
    
   
	@Override
	public LoanOutputDTO fetchLoan(Long loanId) {
		// method to fetch loan
		Loan loan = this.loanrepository.getOne(loanId);
		LoanOutputDTO loanoutputdto = convertloanEntitytoloanoutputDto(loan);
		return loanoutputdto;
	}

	@Override
	public List<LoanEmiDTO> fetchAllEmistatement(Long customerId) {
		// to getall emi tranactions for a custoner
		List<LoanEmi> loanemi = this.loanemirepository.findAll();
        List<LoanEmiDTO> loanemidto = loanemi.stream()
        		                      .filter(cid -> cid.equals(customerId))
        		                      .map(this :: convertLoanemiEntitytoLoanEmiDto)
        		                      .collect(Collectors.toList());
		
		
		return loanemidto;
	}

	@Override
	public List<LoanOutputDTO> fetchAllLoans() {
		// fetch all loans
		List<Loan> loan = this.loanrepository.findAll();
		List<LoanOutputDTO> loanout = loan.stream()
				                      .map(this :: convertloanEntitytoloanoutputDto)
				                      .collect(Collectors.toList());
		return loanout;
	}

	@Override
	public List<LoanOutputDTO> fetchLoanStatus(String status) {
		// Fetch loan of specific status
		List<Loan> loan = this.loanrepository.findAll();
        List<LoanOutputDTO> loanstatus = loan.stream()
        								 .filter(sts -> sts.equals(status))
        								 .map(this :: convertloanEntitytoloanoutputDto)
        								 .collect(Collectors.toList());
		
		return null;
	}

	@Override
	public LoanOutputDTO applyLoan(Long customerId, LoanDTO loanDTO) {
		// TODO Auto-generated method stub
		Loan loans = this.convertloanDtotoLoanEntity(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}
	
}
