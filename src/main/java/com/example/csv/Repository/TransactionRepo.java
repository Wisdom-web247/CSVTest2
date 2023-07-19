package com.example.csv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.csv.Models.Transactions;

@Repository
public interface TransactionRepo extends JpaRepository<Transactions, Integer> {
	
}

