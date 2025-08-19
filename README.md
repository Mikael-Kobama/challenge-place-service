# Challenge place service API

Esta é uma API RESTful robusta, desenvolvida para um desafio técnico, utilizando **Java** e **Spring Boot**. A API foi construída com foco em boas práticas de desenvolvimento, performance e manutenibilidade, seguindo os princípios e tecnologias a seguir.

### Tecnologias e Práticas Adotadas

O projeto demonstra um forte domínio das seguintes práticas de desenvolvimento e tecnologias:

* **Programação Reativa**: Uso de **Spring WebFlux** e **R2DBC** para criar uma API reativa e de alta performance, capaz de lidar com um grande volume de requisições de forma eficiente.
* **Princípios SOLID**: Código estruturado de forma coesa, flexível e de fácil manutenção, seguindo os princípios de design de software.
* **Testes Automatizados**: Ampla cobertura de testes unitários e de integração para garantir a confiabilidade e o comportamento esperado da aplicação.
* **Queries Dinâmicas**: Implementação de consultas dinâmicas usando o **Query By Example**, permitindo a criação de filtros flexíveis para a API.
* **DTOs**: Padrão de design (Data Transfer Object) aplicado para desacoplar a camada de API da camada de persistência.
* **Injeção de Dependências**: Utilização do container do Spring para gerenciar as dependências, facilitando a testabilidade e o reuso de código.
* **Documentação da API**: Geração automática de documentação interativa com **Swagger** e **OpenAPI 3**, tornando o consumo da API mais simples e intuitivo.
* **Geração de Slugs**: Utilização do **Slugify** para criar *slugs* (strings amigáveis para URLs) de forma automática.
* **Auditoria de Entidades**: Registro automático de dados sobre a criação e a atualização das entidades, garantindo a rastreabilidade das informações.

---

### Como Rodar o Projeto

Siga os passos abaixo para executar a aplicação em sua máquina.

**Pré-requisitos**:
* Java 17+
* Docker (para o banco de dados)
* Maven

1.  **Clone o repositório**:
    ```bash
    git clone https://github.com/Mikael-Kobama/challenge-place-service.git
    ```

2.  **Acesse a pasta do projeto**:
    ```bash
    cd challenge-place-service
    ```

3.  **Suba o banco de dados com Docker**:
    Se houver um arquivo `docker-compose.yml` na raiz do projeto, use:
    ```bash
    docker-compose up -d
    ```

4.  **Execute a aplicação com Maven**:
    ```bash
    ./mvnw spring-boot:run
    ```

A API estará disponível em `http://localhost:8080`.

---

