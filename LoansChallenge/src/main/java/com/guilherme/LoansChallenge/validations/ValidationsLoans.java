package com.guilherme.LoansChallenge.validations;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import com.guilherme.LoansChallenge.model.Loans;


public interface ValidationsLoans {

    Loans validation(CustomerDto dto);
}
