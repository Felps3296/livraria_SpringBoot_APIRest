package br.com.livraria.livraria.livro;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizarLivro(

        @NotNull
        Long id,

        String titulo,

        String autor,

        String editora,

        String isbn,

        String disponibilidade) {

}

