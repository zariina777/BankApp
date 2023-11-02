package service.serviceImpl;

import DTO.AccountDTO;
import lombok.RequiredArgsConstructor;
import mapper.AccountMapper;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import service.AccountService;
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
