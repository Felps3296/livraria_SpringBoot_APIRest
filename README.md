<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<h1>📚 Projeto Livraria - Spring Boot API REST</h1>

<p>
    Este é um sistema de gerenciamento de uma livraria, desenvolvido com <strong>Spring Boot</strong> e <strong>MySQL</strong>. O projeto permite o gerenciamento de livros, clientes e empréstimos de forma simples e eficiente, seguindo as regras de negócio pré-definidas.
</p>

<h2>🚀 Funcionalidades</h2>

<h3>1. Gerenciamento de Livros</h3>
<ul>
    <li><strong>Objetivo</strong>: Manter um catálogo de livros com operações de adicionar, listar, editar e remover.</li>
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
    <li><strong>Objetivo</strong>: Registrar os clientes que podem pegar livros emprestados.</li>
    <li><strong>Regras de Negócio</strong>:
        <ul>
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

<h2>📖 Endpoints</h2>

<h3>Livros</h3>
<ul>
    <li><code>POST /livros</code> - Cadastrar um novo livro</li>
    <li><code>GET /livros</code> - Listar todos os livros</li>
    <li><code>GET /livros/{id}</code> - Obter os detalhes de um livro específico</li>
    <li><code>PUT /livros/{id}</code> - Atualizar um livro</li>
    <li><code>DELETE /livros/{id}</code> - Remover um livro (somente se <code>disponibilidade = true</code>)</li>
</ul>

<h3>Clientes</h3>
<ul>
    <li><code>POST /clientes</code> - Adicionar um novo cliente</li>
    <li><code>GET /clientes</code> - Listar todos os clientes</li>
    <li><code>GET /clientes/{id}</code> - Obter os detalhes de um cliente específico</li>
    <li><code>PUT /clientes/{id}</code> - Atualizar os dados de um cliente</li>
    <li><code>DELETE /clientes/{id}</code> - Remover um cliente</li>
</ul>

<h3>Empréstimos</h3>
<ul>
    <li><code>POST /emprestimos</code> - Registrar um novo empréstimo</li>
    <li><code>GET /emprestimos</code> - Listar todos os empréstimos</li>
    <li><code>GET /emprestimos/{id}</code> - Obter os detalhes de um empréstimo específico</li>
    <li><code>PUT /emprestimos/{id}/devolucao</code> - Registrar a devolução de um livro</li>
</ul>

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

<h3>Passos para rodar o projeto</h3>
<ol>
    <li>Clone o repositório:
        <pre><code>git clone https://github.com/seu-usuario/projeto_livraria_SpringBoot_APIRest.git</code></pre>
    </li>
    <li>Entre no diretório do projeto:
        <pre><code>cd projeto_livraria_SpringBoot_APIRest</code></pre>
    </li>
    <li>Configure o banco de dados no arquivo <code>application.properties</code>:
        <pre><code>spring.datasource.url=jdbc:mysql://localhost:3306/livraria
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update</code></pre>
    </li>
    <li>Execute o projeto:
        <pre><code>mvn spring-boot:run</code></pre>
    </li>
    <li>Acesse a API via Postman ou outra ferramenta na URL:
        <pre><code>http://localhost:8080</code></pre>
    </li>
</ol>

<h2>✍️ Autor</h2>

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/64935845?v=4" width=115><br><sub>Felipe Viana Reis</sub>](https://github.com/Felps3296)

</body>
</html>
