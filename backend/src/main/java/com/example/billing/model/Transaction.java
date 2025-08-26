package com.example.billing.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
 
@Entity
@Table(name = "transactions")
public class Transaction {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long invoiceId;
    private LocalDateTime transactionDate;
    private BigDecimal amount;
    private String paymentMethod;
    private String status;
 
    // Constructors
    public Transaction() {
    }
 
    // Getters and Setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public Long getInvoiceId() {
        return invoiceId;
    }
 
    public void setInvoiceId(Long invoiceId) {
        this.invoiceId = invoiceId;
    }
 
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
 
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
 
    public BigDecimal getAmount() {
        return amount;
    }
 
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
 
    public String getPaymentMethod() {
        return paymentMethod;
    }
 
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
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
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", invoiceId=" + invoiceId +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
 