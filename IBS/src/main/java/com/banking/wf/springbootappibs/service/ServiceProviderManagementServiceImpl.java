package com.banking.wf.springbootappibs.service;



import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.banking.wf.springbootappibs.dto.ServiceProviderDTO;

import com.banking.wf.springbootappibs.entity.ServiceProvider;

import com.banking.wf.springbootappibs.repository.ServiceProviderRepository;





@Service
public class ServiceProviderManagementServiceImpl implements ServiceProviderManagementService{

	// injecting a dependency
	
	
	@Autowired
	private ServiceProviderRepository serviceProviderRepository;
	
	
	// utility method
	
	
	
	private ServiceProviderDTO convertSPIEntityToOutputDto(ServiceProvider spidetails) {
		
		ServiceProviderDTO serviceProviderDTO =new ServiceProviderDTO();
		serviceProviderDTO.setSpi(spidetails.getSpi());
		serviceProviderDTO.setSpiUtility(spidetails.getSpiUtility());
		serviceProviderDTO.setProviderDetails(spidetails.getProviderDetails());
		serviceProviderDTO.setSpAccNo(spidetails.getSpAccNo());
		serviceProviderDTO.setSpBankName(spidetails.getSpBankName());
		serviceProviderDTO.setSpKYCStatus(spidetails.getSpKYCStatus());
		serviceProviderDTO.setGivenID(spidetails.getGivenID());
		return serviceProviderDTO;
	}
	
private ServiceProvider convertSPIInputDtoToEntity(ServiceProviderDTO serviceInputDto) {
		
		ServiceProvider serviceProvider =new ServiceProvider();
		serviceProvider.setSpi(serviceInputDto.getSpi());
		serviceProvider.setSpiUtility(serviceInputDto.getSpiUtility());
		serviceProvider.setProviderDetails(serviceInputDto.getProviderDetails());
		serviceProvider.setSpAccNo(serviceInputDto.getSpAccNo());
		serviceProvider.setSpBankName(serviceInputDto.getSpBankName());
		serviceProvider.setGivenID(serviceInputDto.getGivenID());
		serviceProvider.setSpKYCStatus("Pending");
		return serviceProvider;
	}
	
	

@Override
	public List<ServiceProviderDTO> fetchSPIdetails() {
		// TODO Auto-generated method stub
		
		List<ServiceProvider> spidetails =this.serviceProviderRepository.findAll();
		List<ServiceProviderDTO> serviceProviderDTO = spidetails.stream()
				 .map(this :: convertSPIEntityToOutputDto)
				 .collect(Collectors.toList());
			
		return serviceProviderDTO;
	}
	
	@Override
	public List<ServiceProviderDTO> fetchApprovedSPIdetails() {
		// TODO Auto-generated method stub
		
		List<ServiceProvider> spidetails =this.serviceProviderRepository.fetchApproved();
		List<ServiceProviderDTO> serviceProviderDTO = spidetails.stream()
				 .map(this :: convertSPIEntityToOutputDto)
				 .collect(Collectors.toList());
			
		return serviceProviderDTO;
	}


	@Override
	public ServiceProviderDTO SaveSPIdetails(ServiceProviderDTO serviceInputDto) {
		// TODO Auto-generated method stub
		ServiceProvider serviceprovider =this.convertSPIInputDtoToEntity(serviceInputDto);
		ServiceProvider serviceproviderdetails =this.serviceProviderRepository.save(serviceprovider);
		ServiceProviderDTO serviceDto = this.convertSPIEntityToOutputDto(serviceproviderdetails);
		return serviceDto;
	}

	@Override
	public ServiceProviderDTO updateKYCStatus(Long spi, String status) {
		// TODO Auto-generated method stub
		this.serviceProviderRepository.updateKYCStatus(spi, status);
		return convertSPIEntityToOutputDto(this.serviceProviderRepository.getOne(spi));
	}

	
}
