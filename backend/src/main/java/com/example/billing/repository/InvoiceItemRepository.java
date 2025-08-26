package com.example.billing.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.model.InvoiceItem;
 
public interface InvoiceItemRepository extends JpaRepository<InvoiceItem, Long> {
}