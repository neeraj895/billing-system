package com.example.billing.service;
 
import com.example.billing.model.Customer;
import com.example.billing.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
 
@Service // Marks this class as a Spring service component
public class CustomerService {
 
    private final CustomerRepository customerRepository;
 
    @Autowired // Spring will automatically inject the repository here
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
 
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
 