package com.banking.wf.springbootappibs.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.banking.wf.springbootappibs.entity.SavingsAccount;
import com.banking.wf.springbootappibs.entity.Transaction;




@Repository

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
	
	//@Query("select txn from transaction txn where customer_id=:customerId")
	List<Transaction> findByCustomerId(Long customerId);
	
	
	//@Query(value ="select * from Transaction t where t.customer_id =:id and t.last_transation_date=:date%", nativeQuery = true)
	//@Query(value ="select * from Transaction t where t.customer_id =:id", nativeQuery = true)
	//List<Transaction> findByTxnMonth(@Param("id") Long id, @Param("date")String date);
	//List<Transaction> findByCustomerId(Long customerId);
	
	//@Query(value ="select t from Transaction t where t.customer_id =:id and MONTH(t.last_transation_date) =?'month' AND YEAR(t.last_transation_date) =?'year'", nativeQuery = true)
	//List<Transaction> findByMonTxn(@Param("id") Long id, @Param("month")String month,@Param("year")String year);
	
	@Query(value = "SELECT * FROM Transaction  WHERE customer_id =:id and last_transation_date like %:date%", nativeQuery = true)
	
	List<Transaction> findBylastTransationDate(@Param("id") Long id,@Param("date") String date);
	
		
	
}
