<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>📚 Projeto Livraria - Spring Boot API REST</h1>

<p>
    Este é um sistema de gerenciamento de uma livraria, desenvolvido com <strong>Spring Boot</strong> e <strong>MySQL</strong>. O projeto permite o gerenciamento de livros, clientes e empréstimos, seguindo as regras de negócio pré-definidas.
</p>

<h2>🚀 Funcionalidades</h2>

<h3>1. Gerenciamento de Livros</h3>
<ul>
    <li><strong>Regras de Negócio</strong>:
        <ul>
            <li>Todos os campos (<code>titulo</code>, <code>autor</code>, <code>editora</code>, <code>isbn</code> e <code>disponibilidade</code>) são obrigatórios.</li>
            <li>Não permitir a criação de dois livros com o mesmo ISBN.</li>
            <li>Não permitir a remoção de um livro que não esteja disponível (emprestado).</li>
        </ul>
    </li>
</ul>

<h3>2. Gerenciamento de Clientes</h3>
<ul>
    <li><strong>Regras de Negócio</strong>:
        <ul>
            <li>Todos os campos (<code>nome</code>, <code>email</code>, <code>telefone</code>, <code>data de nascimento</code> e <code>endereço</code>) são obrigatórios.</li>
            <li>O email deve ser único para cada cliente.</li>
            <li>Permitir a atualização de dados do cliente, mas mantendo o email único.</li>
        </ul>
    </li>
</ul>

<h3>3. Empréstimo de Livros</h3>
<ul>
    <li><strong>Objetivo</strong>: Registrar e controlar os empréstimos de livros.</li>
    <li><strong>Regras de Negócio</strong>:
        <ul>
            <li>Um cliente pode pegar no máximo 3 livros emprestados ao mesmo tempo.</li>
            <li>Um livro só pode ser emprestado se estiver disponível (<code>disponibilidade = true</code>).</li>
            <li>Ao registrar um empréstimo, o livro é marcado como indisponível.</li>
            <li>Quando o livro é devolvido, ele volta a ficar disponível.</li>
        </ul>
    </li>
</ul>

## ⚙️ Funcionalidades

- [x] CRUD de livros;
- [ ] CRUD de clientes;
- [ ] CRUD Empréstimo de Livros

<h2>🛠️ Tecnologias Utilizadas</h2>
<div>
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
</div>
<ul>
    <li><strong>Java 17</strong></li>
    <li><strong>Spring Boot 3.0</strong></li>
    <li><strong>MySQL</strong> (ou H2 para testes)</li>
    <li><strong>Spring Data JPA</strong></li>
    <li><strong>Lombok</strong> (para reduzir o código boilerplate)</li>
    <li><strong>Flyway</strong> (para migração de banco de dados)</li>
    <li><strong>Bean Validation</strong> (para validações nos DTOs)</li>
    <li><strong>Postman</strong> (para testar a API)</li>
</ul>

<h2>⚙️ Instalação e Configuração</h2>

<h3>Pré-requisitos</h3>
<ul>
    <li><strong>Java 17</strong> instalado</li>
    <li><strong>MySQL</strong> ou outro banco de dados configurado</li>
    <li><strong>Maven</strong> para gerenciar dependências</li>
</ul>

<h2>✍️ Autor</h2>

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/64935845?v=4" width=115><br><sub>Felipe Viana Reis</sub>](https://github.com/Felps3296)

</body>
</html>
