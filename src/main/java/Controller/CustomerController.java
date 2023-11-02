package Controller;

import DTO.AccountDTO;
import DTO.CustomerDTO;
import entities.Customer;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CustomerService;

import java.util.UUID;

@AllArgsConstructor
@RestController // work with objekt
@RequestMapping("/customers") // links browser
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomerById(@PathVariable("id") UUID id) {
        return new ResponseEntity<>(customerService.getCustomerById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        return new ResponseEntity<>(customerService.createCustomer(customerDTO), HttpStatus.CREATED);
    }
    @DeleteMapping("/{string}")
    public void deleteCustomerById(@PathVariable String string) {customerService.deleteCustomerById(string);
    }


}
