package com.guilherme.LoansChallenge.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Loans {

    private Integer interestRate;
    private LoansType loansType;

    public Loans(){
    }

    public Loans(LoansType loansType){
        this.loansType = loansType;
        switch(loansType){
            case PERSONAL -> interestRate = 4;
            case GUARANTEED -> interestRate = 3;
            case CONSIGNMENT -> interestRate = 2;
        }
    }
}
