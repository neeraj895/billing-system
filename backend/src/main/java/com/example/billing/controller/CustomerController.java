package com.example.billing.controller;
 
import com.example.billing.model.Customer;
import com.example.billing.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
 
import java.util.List;
 
@RestController // Marks this class as a REST controller
@RequestMapping("/api/customers") // Base URL for all endpoints in this controller
public class CustomerController {
 
	
    private final CustomerService customerService;
 
    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
 
    @GetMapping // Maps HTTP GET requests to this method
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
 