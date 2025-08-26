package com.example.billing.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.billing.model.User;
 
public interface UserRepository extends JpaRepository<User, Long> {
}
 