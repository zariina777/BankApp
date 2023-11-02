package service.serviceImpl;

import DTO.TransactionDTO;
import lombok.RequiredArgsConstructor;
import mapper.TransactionMapper;
import org.springframework.stereotype.Service;
import repository.TransactionRepository;
import service.TransactionService;

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
