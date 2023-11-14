package com.example.bankapp.mapper;

import com.example.bankapp.DTO.AccountDTO;
import com.example.bankapp.entities.Account;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    @Named("toDto")
    AccountDTO mapToDTO(Account account);
    @Mapping(source = "id", target = "id")
    Account mapToEntity (AccountDTO accountDTO); //принимает ДТО и превращает в ентити

    //Named("stringToEnums")//данный метод будет использоваться для выполнения маппинга при преобразовании строки в перечисление (enum).
    //default String converStringToEnum(String name) {return name.toUpperCase();

    }


