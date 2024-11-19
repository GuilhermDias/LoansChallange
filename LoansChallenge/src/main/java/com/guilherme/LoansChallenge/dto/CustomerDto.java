package com.guilherme.LoansChallenge.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record CustomerDto(@NotBlank String name,
                          @NotBlank @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve ser no formato xxx.xxx.xx-xx") String cpf,
                          @NotNull Integer age,
                          @NotNull Float income,
                          @NotNull String location) {
}
