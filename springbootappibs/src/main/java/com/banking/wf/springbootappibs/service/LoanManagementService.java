package com.banking.wf.springbootappibs.service;

import java.util.List;

import com.banking.wf.springbootappibs.dto.LoanDTO;
import com.banking.wf.springbootappibs.dto.LoanEmiDTO;
import com.banking.wf.springbootappibs.dto.LoanOutputDTO;


public interface LoanManagementService
{
	
	public LoanOutputDTO fetchLoan(Long loanId);
	public List<LoanEmiDTO> fetchAllEmistatement(Long customerId);
	public List<LoanOutputDTO> fetchAllLoans();
	public List<LoanOutputDTO> fetchLoanStatus(String status);
	public LoanOutputDTO applyLoan(Long customerId,
			   LoanDTO loanDTO);

}
