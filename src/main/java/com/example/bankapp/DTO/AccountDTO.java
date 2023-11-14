package com.example.bankapp.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Data
@Setter
public class AccountDTO {
    private String accountNumber;
    private String accountType;
    private long id;
}
