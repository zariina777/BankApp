package com.example.bankapp.repository;

import com.example.bankapp.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository  extends JpaRepository<Transaction, String> {
}
