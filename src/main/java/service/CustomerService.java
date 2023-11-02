package service;

import DTO.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID id);

    CustomerDTO createCustomer(CustomerDTO customerDTO);

    void deleteCustomerById(String string);
}
