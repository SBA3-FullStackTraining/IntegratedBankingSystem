package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.Beneficiary;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long>{
	
	@Query(value = "SELECT * FROM beneficiary b WHERE b.customerid = :customerId", nativeQuery = true)
	List<Beneficiary> findByCustomerId(@Param("customerId") Long customerId);
	
	
}
