package DTO;

import lombok.Data;

@Data
public class TransactionDTO {
    private String transactionType;
    private String description;
    private String transactionDate;
}
