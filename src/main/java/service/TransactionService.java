package service;

import DTO.TransactionDTO;

import java.util.UUID;

public interface TransactionService {
    TransactionDTO findTransactionById(UUID id);

    void deleteTransactionById(UUID uuid);
}
