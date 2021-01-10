package com.banking.wf.springbootappibs.service;

import java.util.List;


import com.banking.wf.springbootappibs.dto.ServiceProviderDTO;







public interface ServiceProviderManagementService 
{
	public List<ServiceProviderDTO> fetchSPIdetails();
	public ServiceProviderDTO SaveSPIdetails(ServiceProviderDTO serviceInputDto);
	public List<ServiceProviderDTO> fetchApprovedSPIdetails(); 
	public ServiceProviderDTO updateKYCStatus(Long spi, String status);
}








