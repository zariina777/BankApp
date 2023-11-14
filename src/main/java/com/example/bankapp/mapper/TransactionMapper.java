package com.example.bankapp.mapper;

import com.example.bankapp.DTO.TransactionDTO;
import com.example.bankapp.entities.Transaction;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    @Named("toDto")
    TransactionDTO ToDTO(Transaction transaction);
}
