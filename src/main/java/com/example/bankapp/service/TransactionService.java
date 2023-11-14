package com.example.bankapp.service;

import com.example.bankapp.DTO.TransactionDTO;

import java.util.UUID;

public interface TransactionService {
    TransactionDTO findTransactionById(UUID id);

    void deleteTransactionById(UUID uuid);
}
