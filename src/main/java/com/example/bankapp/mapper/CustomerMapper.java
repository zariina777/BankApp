package com.example.bankapp.mapper;

import com.example.bankapp.DTO.CustomerDTO;
import com.example.bankapp.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Named("toDto")
    CustomerDTO ToDTO(Customer customer);
}
