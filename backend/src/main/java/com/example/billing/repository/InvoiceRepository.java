package com.example.billing.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.model.Invoice;
 
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
 