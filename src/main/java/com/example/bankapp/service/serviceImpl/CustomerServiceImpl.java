package com.example.bankapp.service.serviceImpl;

import com.example.bankapp.DTO.CustomerDTO;
import lombok.RequiredArgsConstructor;
import com.example.bankapp.mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import com.example.bankapp.repository.CustomerRepository;
import com.example.bankapp.service.CustomerService;

import java.util.UUID;
@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;
    @Override
    public CustomerDTO getCustomerById(UUID id) {
        return null;
    }

    @Override
    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public void deleteCustomerById(String string) {

    }
}
