CREATE TABLE livros (
           id INT AUTO_INCREMENT PRIMARY KEY,
           titulo VARCHAR(255) NOT NULL,
           autor VARCHAR(255) NOT NULL,
           editora VARCHAR(255) NOT NULL,
           isbn VARCHAR(20) NOT NULL,
           disponibilidade BOOLEAN
);
