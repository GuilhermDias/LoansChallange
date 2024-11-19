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
public class GuaranteedLoanValidationAgeAndLocation implements ValidationsLoans {

    @Autowired
    private CustomerRepository customerRepository;

    public Loans validation(CustomerDto dto) {
        boolean customerExists = customerRepository.existsByCpf(dto.cpf());

        if(customerExists){
            if(dto.income() <= 3000.00 || dto.income() >= 5000.00 && dto.age() < 30 && dto.location().contains("SP")){
                return new Loans(LoansType.GUARANTEED);
            }
        } else {
            throw new ValidationsExceptions("CPF não encontrado");
        }
        return null;
    }
}
