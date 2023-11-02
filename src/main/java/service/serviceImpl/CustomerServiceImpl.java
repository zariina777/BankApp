package service.serviceImpl;

import DTO.CustomerDTO;
import lombok.RequiredArgsConstructor;
import mapper.AccountMapper;
import mapper.CustomerMapper;
import org.springframework.stereotype.Service;
import repository.AccountRepository;
import repository.CustomerRepository;
import service.AccountService;
import service.CustomerService;

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
