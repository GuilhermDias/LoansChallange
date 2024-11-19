package com.guilherme.LoansChallenge.dto;

import com.guilherme.LoansChallenge.model.Customer;
import com.guilherme.LoansChallenge.model.Loans;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoansResponse {
    private String customer;
    private List<Loans> loans;
}
