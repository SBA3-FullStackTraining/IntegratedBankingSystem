package com.banking.wf.springbootappibs.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.wf.springbootappibs.entity.ServiceProvider;





@Repository

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long>{
	
	@Query(value="select * from service_provider where spkycstatus ='Approved'", nativeQuery = true)
	//List<ServiceProvider> fetchAllSPI();
	List<ServiceProvider> fetchApproved();
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "Update service_provider ser Set ser.spkycstatus = :status WHERE ser.spi = :spi", nativeQuery = true)
	void updateKYCStatus(@Param("spi") Long spi, @Param("status") String status);
}
