package com.guilherme.LoansChallenge.repository;

import com.guilherme.LoansChallenge.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    boolean existsByCpf( String cpf);
}
