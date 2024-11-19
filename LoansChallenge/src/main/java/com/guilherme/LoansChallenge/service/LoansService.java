package com.guilherme.LoansChallenge.service;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import com.guilherme.LoansChallenge.model.Loans;
import com.guilherme.LoansChallenge.validations.ValidationsLoans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoansService {

    @Autowired
    private List<ValidationsLoans> validationsLoansList;

    public List<Loans> validatesLoanRequirements(CustomerDto dto){
        List<Loans> loansList = new ArrayList<>();

        validationsLoansList.forEach(v -> {
            Loans loans = v.validation(dto);
            if(loans != null){
                loansList.add(loans);
            }
        });
        return loansList;
    }
}
