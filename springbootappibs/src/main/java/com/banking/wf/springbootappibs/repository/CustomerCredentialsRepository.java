package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.banking.wf.springbootappibs.entity.Customer;
import com.banking.wf.springbootappibs.entity.CustomerCredentials;


@Repository
public interface CustomerCredentialsRepository extends JpaRepository<CustomerCredentials, Long>
{

	@Query(value = "SELECT * FROM Customer c WHERE c.email = :email", nativeQuery = true)
	List<Customer> checkExistByEmail(@Param("email") String email);

	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value = "Update customer_credentials crd Set crd.password = :password WHERE crd.customerid = :customerid", nativeQuery = true)
	void updatePassword(@Param("customerid") Long customerid, @Param("password") String password);
	
}
