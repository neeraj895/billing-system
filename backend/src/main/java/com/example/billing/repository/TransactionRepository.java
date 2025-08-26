package com.example.billing.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.model.Transaction;
 
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}