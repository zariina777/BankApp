package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.AccountDTO;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.AccountMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.AccountRepository;
import com.example.bankapp.service.AccountService;
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    public AccountDTO getAccountDtoById(Long id) {
        return null;
    }

    @Override
    public AccountDTO createAccount(AccountDTO accountDTO) {
        return null;
    }

    @Override
    public void deleteAccountByNumber(String string) {

    }
}
