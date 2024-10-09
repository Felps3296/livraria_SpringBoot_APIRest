CREATE TABLE clientes (

         id INT AUTO_INCREMENT PRIMARY KEY,
         nome VARCHAR(255) NOT NULL,
         email VARCHAR(255) NOT NULL,
         telefone VARCHAR(255) NOT NULL,
         dataNascimento VARCHAR(255) NOT NULL,
         logradouro VARCHAR(255),
         bairro VARCHAR(255),
         cep VARCHAR(50),
         numero VARCHAR(50),
         complemento VARCHAR(255),
         cidade VARCHAR(255),
         uf VARCHAR(2)
);