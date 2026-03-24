package com.example.church.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.church.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // Additional query methods (if needed) can be defined here
}