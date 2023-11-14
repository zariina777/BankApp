package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.TransactionDTO;
import com.example.bankapp.service.TransactionService;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.TransactionMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.TransactionRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    @Override
    public TransactionDTO findTransactionById(UUID id) {
        return null;
    }

    @Override
    public void deleteTransactionById(UUID uuid) {

    }
}
