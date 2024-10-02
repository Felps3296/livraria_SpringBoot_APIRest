package br.com.livraria.livraria.livro;

public record DadosListrarLivro(Long id, String titulo, String autor, String editora, String isbn, Boolean disponibilidade) {

    public DadosListrarLivro(Livro livro) {

        this(livro.getId(), livro.getTitulo(), livro.getAutor(), livro.getEditora(), livro.getIsbn(), livro.isDisponibilidade());

    }
}
