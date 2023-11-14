package com.example.bankapp.mapper;

import com.example.bankapp.DTO.AgreementDTO;
import com.example.bankapp.entities.Agreement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface AgreementMapper {
    @Named("toDto")
    AgreementDTO ToDTO(Agreement agreement);
    @Mapping(source = "id", target = "id")
    Agreement ToEntity (AgreementDTO agreementDTO); //принимает ДТО и превращает в ентити
}
