package com.guilherme.LoansChallenge.controller;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import com.guilherme.LoansChallenge.model.Customer;
import com.guilherme.LoansChallenge.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<Customer> createCustomer(@RequestBody @Valid CustomerDto dto){
        Customer newCustomer = new Customer(dto);
        customerRepository.save(newCustomer);
        return ResponseEntity.ok().body(newCustomer);
    }
}
