package com.guilherme.LoansChallenge.controller;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import com.guilherme.LoansChallenge.dto.LoansResponse;
import com.guilherme.LoansChallenge.model.Loans;
import com.guilherme.LoansChallenge.service.LoansService;
import com.guilherme.LoansChallenge.validations.ValidationsLoans;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer-loans")
public class LoansController {

    @Autowired
    private LoansService loansService;

    @PostMapping
    @Transactional
    public ResponseEntity<LoansResponse> loanConsultation(@RequestBody @Valid CustomerDto dto){
        List<Loans> loansList = loansService.validatesLoanRequirements(dto);

        LoansResponse response = new LoansResponse(dto.name(), loansList);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
