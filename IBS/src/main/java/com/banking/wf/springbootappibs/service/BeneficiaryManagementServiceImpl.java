package com.banking.wf.springbootappibs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.wf.springbootappibs.dto.CustomerCredentialsDTO;
import com.banking.wf.springbootappibs.dto.CustomerDTO;
import com.banking.wf.springbootappibs.dto.SessionDataDTO;
import com.banking.wf.springbootappibs.entity.Account;
import com.banking.wf.springbootappibs.entity.Beneficiary;
import com.banking.wf.springbootappibs.entity.Customer;
import com.banking.wf.springbootappibs.entity.CustomerCredentials;
import com.banking.wf.springbootappibs.entity.SessionData;
import com.banking.wf.springbootappibs.repository.AccountRepository;
import com.banking.wf.springbootappibs.repository.BeneficiaryRepository;
import com.banking.wf.springbootappibs.repository.CustomerCredentialsRepository;
import com.banking.wf.springbootappibs.repository.CustomerRepository;
import com.banking.wf.springbootappibs.repository.SessionDataRepository;
import com.banking.wf.springbootappibs.dto.AccountDTO;
import com.banking.wf.springbootappibs.dto.BeneficiaryDTO;


@Service
public class BeneficiaryManagementServiceImpl implements BeneficiaryManagementService
{
	@Autowired
	private CustomerRepository customerRepository;
	

	@Autowired
	private BeneficiaryRepository beneficiaryRepository;
	
	
	private BeneficiaryDTO convertBeneficiaryEntityToOutputDto(Beneficiary beneficiary) 
	{
		return new BeneficiaryDTO(beneficiary.getCustomerID(), beneficiary.getBeneficiaryID(), beneficiary.getBenfAccHolderName(), beneficiary.getBenfRelation(), beneficiary.getBenfBankAccountType(), beneficiary.getBenfBankAccID(), beneficiary.getBenfBankIFSC(), beneficiary.getBenfBankName());
	}
	
	private Beneficiary convertBeneficiaryDtoToEntity(BeneficiaryDTO beneficiaryDTO) 
	{
		return new Beneficiary(beneficiaryDTO.getBeneficiaryID(), beneficiaryDTO.getCustomerID(), beneficiaryDTO.getBenfAccHolderName(), beneficiaryDTO.getBenfRelation(), beneficiaryDTO.getBenfBankAccountType(), beneficiaryDTO.getBenfBankAccID(), beneficiaryDTO.getBenfBankIFSC(), beneficiaryDTO.getBenfBankName());
	}
	
	
	@Override
	public List<BeneficiaryDTO> fetchAllBeneficiariesByCustID(Long customerId) {
		List<Beneficiary> benfList = this.beneficiaryRepository.findByCustomerId(customerId);
		return	benfList.stream().map(this :: convertBeneficiaryEntityToOutputDto).collect(Collectors.toList());
	}

	@Override
	public BeneficiaryDTO updateBeneficiaryData(BeneficiaryDTO updatedBeneficiaryDTO) {
		return convertBeneficiaryEntityToOutputDto(this.beneficiaryRepository.save(convertBeneficiaryDtoToEntity(updatedBeneficiaryDTO)));
	}
 
	public BeneficiaryDTO fetchSingleBeneficiary(Long benfID)
	{
		return convertBeneficiaryEntityToOutputDto(this.beneficiaryRepository.getOne(benfID));
	}
	
}
