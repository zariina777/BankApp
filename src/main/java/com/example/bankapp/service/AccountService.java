package com.example.bankapp.service;

import com.example.bankapp.DTO.AccountDTO;

public interface AccountService {
    AccountDTO getAccountDtoById(Long id);
    AccountDTO createAccount(AccountDTO accountDTO);
    void deleteAccountByNumber(String string);
}
