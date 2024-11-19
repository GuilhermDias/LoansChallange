package com.guilherme.LoansChallenge.validations;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import com.guilherme.LoansChallenge.exceptions.ValidationsExceptions;
import com.guilherme.LoansChallenge.model.Loans;
import com.guilherme.LoansChallenge.model.LoansType;
import com.guilherme.LoansChallenge.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ConsignmentLoanValidation implements ValidationsLoans{

    @Autowired
    private CustomerRepository customerRepository;

    public Loans validation(CustomerDto dto) {
        boolean customerExists = customerRepository.existsByCpf(dto.cpf());

        if(customerExists){
            if(dto.income() >= 5000.00){
                return new Loans(LoansType.CONSIGNMENT);
            }
        } else {
            throw new ValidationsExceptions("CPF não encontrado");
        }
        return null;
    }
}
