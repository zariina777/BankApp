package com.example.bankapp.service;

import com.example.bankapp.DTO.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    void deleteCustomerById(String string);
}
