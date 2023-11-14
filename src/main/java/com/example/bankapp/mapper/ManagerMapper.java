package com.example.bankapp.mapper;

import com.example.bankapp.DTO.ManagerDTO;
import com.example.bankapp.entities.Manager;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface ManagerMapper {
    @Named("toDto")
    ManagerDTO ToDTO(Manager manager);
}
