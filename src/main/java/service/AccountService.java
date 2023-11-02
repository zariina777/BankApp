package service;

import DTO.AccountDTO;

public interface AccountService {
    AccountDTO getAccountDtoById(Long id);
    AccountDTO createAccount(AccountDTO accountDTO);
    void deleteAccountByNumber(String string);
}
