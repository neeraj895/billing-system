package com.example.billing.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.model.Customer;
 
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
 