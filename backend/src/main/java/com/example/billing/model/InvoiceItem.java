package com.example.billing.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.util.Objects;
 
@Entity
@Table(name = "invoice_items")
public class InvoiceItem {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    private Long invoiceId;
    private Long productId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private BigDecimal totalPrice;
 
    // Constructors
    public InvoiceItem() {
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
 
    public Long getProductId() {
        return productId;
    }
 
    public void setProductId(Long productId) {
        this.productId = productId;
    }
 
    public Integer getQuantity() {
        return quantity;
    }
 
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
 
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
 
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }
 
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }
 
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
 
    // equals, hashCode, and toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceItem that = (InvoiceItem) o;
        return Objects.equals(id, that.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public String toString() {
        return "InvoiceItem{" +
                "id=" + id +
                ", invoiceId=" + invoiceId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                '}';
    }
}
 