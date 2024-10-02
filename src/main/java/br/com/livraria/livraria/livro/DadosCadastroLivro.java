package br.com.livraria.livraria.livro;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroLivro(

        @NotBlank
        String titulo,

        @NotBlank
        String autor,

        @NotBlank
        String editora,

        @NotBlank
        String ano_publicacao,

        @NotBlank
        @Column(unique = true)
        String isbn,

        Boolean disponibilidade) {
}

