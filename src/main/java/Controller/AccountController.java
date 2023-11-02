package Controller;

import DTO.AccountDTO;
import entities.Product;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.AccountService;

@RestController
@RequestMapping("/auth/accounts")
@RequiredArgsConstructor
public class AccountController {
    private final AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> getAccountById(@PathVariable("id")Long id){
        return new ResponseEntity<>(accountService.getAccountDtoById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO accountDTO) {
        return new ResponseEntity<>(accountService.createAccount(accountDTO), HttpStatus.CREATED);
    }
    @DeleteMapping("/{string}")
    public void deleteAccountByNumber(@PathVariable String string) {
        accountService.deleteAccountByNumber(string);
    }



}
