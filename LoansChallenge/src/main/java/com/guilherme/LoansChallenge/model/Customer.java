package com.guilherme.LoansChallenge.model;

import com.guilherme.LoansChallenge.dto.CustomerDto;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Customers")
@Data
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private Integer age;
    private Float income;
    private String location;


    public Customer(CustomerDto dto) {
        this.name = dto.name();
        this.cpf = dto.cpf();
        this.age = dto.age();
        this.income = dto.income();
        this.location = dto.location();
    }
}
