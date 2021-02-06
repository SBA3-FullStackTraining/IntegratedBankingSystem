package com.banking.wf.springbootappibs.service;

import java.util.List;



import com.banking.wf.springbootappibs.dto.LoanDTO;
import com.banking.wf.springbootappibs.dto.LoanEmiDTO;
import com.banking.wf.springbootappibs.dto.LoanOutputDTO;


public interface LoanManagementService
{
	
	public LoanOutputDTO fetchLoan(Long loanId);
	public List<LoanEmiDTO> fetchAllEmistatement(Long loanId);
	public List<LoanOutputDTO> fetchAllLoans(Long customerId, String status);
	public List<LoanOutputDTO> fetchLoanStatus(String status);
	public LoanOutputDTO applyLoan(Long customerId,
			   LoanDTO loanDTO);
    public LoanOutputDTO updateLoan(LoanDTO loanDTO);
    public LoanOutputDTO approvedeclineLoan(LoanDTO loanDTO);
    public LoanEmiDTO payemi(LoanEmiDTO loanemidto);
    public LoanOutputDTO loanpreclose(LoanDTO loanDTO);
	public LoanOutputDTO adminloanpreclose(LoanDTO loanDTO);
    
}