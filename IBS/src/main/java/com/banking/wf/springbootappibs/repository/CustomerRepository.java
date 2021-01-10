package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.wf.springbootappibs.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	@Query("select cus from Customer cus where cus.city=:city")
	List<Customer> findByCityName(@Param("city")String city);
	
	@Query("select cus from Customer cus where cus.kycStatus=:kycStatus")
	List<Customer> findByKYCStatus(@Param("kycStatus")String kycStatus);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "Update customer cus Set cus.kyc_status = :status WHERE cus.customerid = :customerid", nativeQuery = true)
	void updateKYCStatus(@Param("customerid") Long customerid, @Param("status") String status);
	
}
