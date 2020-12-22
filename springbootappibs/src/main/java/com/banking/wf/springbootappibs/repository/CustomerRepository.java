package com.banking.wf.springbootappibs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.Customer;



@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByAccountID(Long accountID);
	
	@Query("select cus from Customer cus where cus.city=:city")
	List<Customer> findByCityName(@Param("city")String city);
	
}
