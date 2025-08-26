package com.example.billing.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
 
@Entity
@Table(name = "invoices")
public class Invoice {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long customerId;
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private BigDecimal totalAmount;
    private String status;
 
    // Constructors
    public Invoice() {
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
 
    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }
 
    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
 
    public LocalDate getDueDate() {
        return dueDate;
    }
 
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
 
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
 
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }
 
    public String getStatus() {
        return status;
    }
 
    public void setStatus(String status) {
        this.status = status;
    }
    
    // equals, hashCode, and toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(id, invoice.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
 