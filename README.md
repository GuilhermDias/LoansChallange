# Sistema de Consultas de Empréstimos(Loans)

Este projeto é uma API REST desenvolvida em Java utilizando Spring Boot para gerenciar a consulta de empréstimos disponíveis para clientes com base em regras específicas de validação. O objetivo é fornecer uma solução eficiente e extensível para identificar quais tipos de empréstimos são mais adequados para cada cliente.

## Funcionalidades

- Consulta de empréstimos disponíveis com base no perfil do cliente.
- Regras de validação parametrizadas por implementações da interface `LoanValidation`.
- Retorno estruturado com informações do cliente e dos empréstimos disponíveis.
- Fácil extensibilidade para adicionar novas validações ou tipos de empréstimos.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **Lombok**
- **Validation**
- **Hibernate**
- **Maven**
- **H2 Database (para testes locais)**

## Endpoints Principais

### Consulta de Empréstimos

**POST** `/loans`

**Request Body: **
```json
{
    "name": "Guilherme Dias",
    "income": 4500,
    "age": 25,
    "residence": "SP"
}
```
**Response Body: **
```json
{
    "customer": "Guilherme Dias",
    "loans": [
        {
            "type": "PERSONAL",
            "interestRate": 4
        },
        {
            "type": "GUARANTEED",
            "interestRate": 3
        },
        {
            "type": "CONSIGNMENT",
            "interestRate": 2
        }
    ]
}
```
**Como executar o projeto: **
--Clone o repositório
`git clone https://github.com/GuilhermDias/LoansChallange`
--Navegue até o diretório do projet
`cd nome-do-repositorio`
--Execute o projeto
`mvn spring-boot:run`
--Acesse a API por
`http://localhost:8080`
