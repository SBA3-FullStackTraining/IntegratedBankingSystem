package com.banking.wf.springbootappibs.service;

import java.util.List;

import com.banking.wf.springbootappibs.dto.AccountDTO;
import com.banking.wf.springbootappibs.dto.BeneficiaryDTO;
import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.SessionDataDTO;


public interface BeneficiaryManagementService 
{
	
	//for beneficiary
	public List<BeneficiaryDTO> fetchAllBeneficiariesByCustID(Long customerId);
	public BeneficiaryDTO updateBeneficiaryData(BeneficiaryDTO updatedBeneficiaryDTO);
	public BeneficiaryDTO fetchSingleBeneficiary(Long benfID);
}
