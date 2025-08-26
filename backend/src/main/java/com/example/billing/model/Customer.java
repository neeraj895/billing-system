package com.example.billing.model;
 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;
 
@Entity
@Table(name = "customers")
public class Customer {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String address;
    private String contactEmail;
 
    // A no-argument constructor is required by JPA
    public Customer() {
    }
 
    // Getters
    public Long getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String getContactEmail() {
        return contactEmail;
    }
 
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAddress(String address) {
        this.address = address;
    }
 
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
    
    // equals(), hashCode(), and toString()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                '}';
    }
}
 