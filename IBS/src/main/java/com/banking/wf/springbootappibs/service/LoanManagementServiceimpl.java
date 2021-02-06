package com.banking.wf.springbootappibs.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.wf.springbootappibs.dto.LoanDTO;
import com.banking.wf.springbootappibs.dto.LoanEmiDTO;
import com.banking.wf.springbootappibs.dto.LoanOutputDTO;
import com.banking.wf.springbootappibs.entity.Loan;
import com.banking.wf.springbootappibs.entity.LoanEmi;
import com.banking.wf.springbootappibs.repository.loanEmiRepository;
import com.banking.wf.springbootappibs.repository.loanRepository;


@Service
public class LoanManagementServiceimpl implements LoanManagementService {
	
	//imp dependency
	@Autowired
	private loanRepository loanrepository;
	
	@Autowired
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
		loan.setStatus(loandto.getStatus());
		loan.setLoanInterestRate(loandto.getLoanInterestRate());
		loan.setRemark(loandto.getRemark());
		loan.setEmi(0.0);
		return loan;
	}
	
public Loan convertloanDtotoLoanEntitypreclosereq(LoanDTO loandto) {
		
		Loan loan = new Loan();
		
		loan.setloanId(loandto.getLoanId());
		
		  loan.setCustomerId(loandto.getCustomerId());
		  loan.setLoanAmount(loandto.getLoanAmount());
		  System.out.println("pc "+loandto.getLoanAmount());
		  loan.setLoanApplicationDate(loandto.getLoanApplicationDate());
		  loan.setLoanName(loandto.getLoanName());
		  loan.setBillingIndicator(loandto.getBillingIndicator());
		  loan.setBusinessStructure(loandto.getBusinessStructure());
		  loan.setTaxIndicator(loandto.getTaxIndicator());
		  loan.setLoanTenure(loandto.getLoanTenure()); loan.setEmi(loandto.getEmi());
		  loan.setLoanInterestRate(loandto.getLoanInterestRate());
		  loan.setEmi(loandto.getEmi());
		  loan.setRemark(loandto.getRemark());
		 
		 loan.setStatus(loandto.getStatus());
		return loan;
	}
	
public Loan convertloanDtotoLoanEntitywithEMI(LoanDTO loandto) {
		
		Loan loan = new Loan();
		loan.setloanId(loandto.getLoanId());
		loan.setCustomerId(loandto.getCustomerId());
		loan.setLoanAmount(loandto.getLoanAmount());
		loan.setLoanApplicationDate(loandto.getLoanApplicationDate());
		loan.setLoanName(loandto.getLoanName());
		loan.setBillingIndicator(loandto.getBillingIndicator());
		loan.setBusinessStructure(loandto.getBusinessStructure());
		loan.setTaxIndicator(loandto.getTaxIndicator());
		loan.setLoanTenure(loandto.getLoanTenure());
		loan.setStatus(loandto.getStatus());
		loan.setLoanInterestRate(loandto.getLoanInterestRate());
		loan.setRemark(loandto.getRemark());
		Double lamount = loandto.getLoanAmount();
		System.out.println("lamount "+lamount);
		Double linterest = loandto.getLoanInterestRate();
		System.out.println("lint "+linterest);
		Integer ltenure = Integer.parseInt(loandto.getLoanTenure());
		System.out.println(ltenure);
		linterest=linterest/(12*100);
		Double lemi = Math.round(lamount*linterest*Math.pow(1+linterest,ltenure))/(Math.pow(1+linterest,ltenure)-1);
		System.out.println(lemi);
		if((loandto.getStatus()).equalsIgnoreCase("Approved")) {
			loan.setEmi(lemi);
		}else {
			loan.setEmi(0.0);			
		}
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
    	loanoutputdto.setTaxIndicator(loan.getTaxIndicator());
    	loanoutputdto.setRemark(loan.getRemark());
    	loanoutputdto.setLoanInterestRate(loan.getLoanInterestRate());
    	loanoutputdto.setStatus(loan.getStatus());
    	loanoutputdto.setEmi(loan.getEmi());
		return loanoutputdto;
    	
    } 
    
public LoanOutputDTO fetchSubmitted(Loan loan) {
    	
    	LoanOutputDTO loanoutputdto = new LoanOutputDTO();
    	loanoutputdto.setLoanId(loan.getloanId());
		
		  loanoutputdto.setCustomerId(loan.getCustomerId());
		  loanoutputdto.setBillingIndicator(loan.getBillingIndicator());
		  loanoutputdto.setBusinessStructure(loan.getBusinessStructure());
		  loanoutputdto.setLoanAmount(loan.getLoanAmount());
		  loanoutputdto.setLoanApplicationDate(loan.getLoanApplicationDate());
		  loanoutputdto.setLoanName(loan.getLoanName());
		  loanoutputdto.setTaxIndicator(loan.getTaxIndicator());
		  loanoutputdto.setLoanTenure(loan.getLoanTenure());
		  loanoutputdto.setRemark(loan.getRemark());
		  loanoutputdto.setLoanInterestRate(loan.getLoanInterestRate());
		  loanoutputdto.setStatus(loan.getStatus());
		 
    return loanoutputdto;
}

    public LoanEmi convertLoanEMIDTOtoentity(LoanEmiDTO loanemidto) {
    LoanEmi loanemi = new LoanEmi();
    loanemi.setLoanId(loanemidto.getLoanId());
    loanemi.setCustomerId(loanemidto.getCustomerId());
    loanemi.setEmi(loanemidto.getEmi());
    loanemi.setMonth(loanemidto.getMonth());
    loanemi.setYear(loanemidto.getYear());
    loanemi.setLoanEmiDate(loanemidto.getLoanEmiDate());
       
    return loanemi;
    }
    public LoanEmiDTO convertLoanemiEntitytoLoanEmiDto(LoanEmi loanemi) {
    LoanEmiDTO loanemidto = new LoanEmiDTO();
    loanemidto.setEmiTransId(loanemi.getEmiTransId());
    loanemidto.setLoanId(loanemi.getLoanId());
    loanemidto.setCustomerId(loanemi.getCustomerId());
    loanemidto.setEmi(loanemi.getEmi());
    loanemidto.setMonth(loanemi.getMonth());
    loanemidto.setYear(loanemi.getYear());
    loanemidto.setLoanEmiDate(loanemi.getLoanEmiDate());   
    return loanemidto;
    }
    
    
   
	@Override
	public LoanOutputDTO fetchLoan(Long loanId) {
		// method to fetch loan
		Loan loan = this.loanrepository.getOne(loanId);
		LoanOutputDTO loanoutputdto = this.convertloanEntitytoloanoutputDto(loan);
		return loanoutputdto;
	}
	
	@Override
	public LoanOutputDTO updateLoan(LoanDTO loanDTO) {
		// TODO Auto-generated method stub
		Loan loans = this.convertloanDtotoLoanEntity(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}
	
    
	@Override
	public List<LoanEmiDTO> fetchAllEmistatement(Long loanId) {
		// to getall emi tranactions for a custoner
		List<LoanEmi> loanemi = this.loanemirepository.findByloanId(loanId);
        List<LoanEmiDTO> loanemidto = loanemi.stream()
        		                      .map(this :: convertLoanemiEntitytoLoanEmiDto)
        		                      .collect(Collectors.toList());
		
		
		return loanemidto;
	}

	@Override
	public List<LoanOutputDTO> fetchAllLoans(Long customerId, String status) {
		// fetch all loans
		List<Loan> loan = this.loanrepository.findByCustomerIdAndStatus(customerId, status);
		System.out.println(loan);
		List<LoanOutputDTO> loanout = loan.stream()
				                      .map(this :: convertloanEntitytoloanoutputDto)
				                      .collect(Collectors.toList());
		return loanout;
	}

	@Override
	public List<LoanOutputDTO> fetchLoanStatus(String status) {
		/*
		 * // Fetch loan of specific status List<Loan> loan =
		 * this.loanrepository.findAll(); List<LoanOutputDTO> loanstatus = loan.stream()
		 * .filter(sts -> sts.equals(status)) .map(this ::
		 * convertloanEntitytoloanoutputDto) .collect(Collectors.toList());
		 */
		System.out.println(status);
		List<Loan> loan = this.loanrepository.findLoanByStatus(status);
		System.out.println(loan);
		
		return loan.stream().map(this :: fetchSubmitted).collect(Collectors.toList());
	}
	
	
	
	
	@Override
	public LoanOutputDTO applyLoan(Long customerId, LoanDTO loanDTO) {
		// TODO Auto-generated method stub
		Loan loans = this.convertloanDtotoLoanEntity(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}


	@Override
	public LoanOutputDTO approvedeclineLoan(LoanDTO loanDTO) {
		// TODO Auto-generated method stub
		Loan loans = this.convertloanDtotoLoanEntitywithEMI(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}
   
	@Override
	public LoanEmiDTO payemi(LoanEmiDTO loanemidto) {
		// TODO Auto-generated method stub
		LoanEmi loans = this.convertLoanEMIDTOtoentity(loanemidto);
		LoanEmi loan = this.loanemirepository.save(loans);
		LoanEmiDTO loanout = this.convertLoanemiEntitytoLoanEmiDto(loan);
		return loanout;
	}

	@Override
	public LoanOutputDTO loanpreclose(LoanDTO loanDTO) {
		Loan loans = this.convertloanDtotoLoanEntitypreclosereq(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}
    
	@Override
	public LoanOutputDTO adminloanpreclose(LoanDTO loanDTO) {
		Loan loans = this.convertloanDtotoLoanEntitypreclosereq(loanDTO);
		Loan loan = this.loanrepository.save(loans);
		LoanOutputDTO loanout = this.convertloanEntitytoloanoutputDto(loan);
		return loanout;
	}

	
	
	
}
