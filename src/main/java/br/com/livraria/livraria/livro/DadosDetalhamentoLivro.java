package br.com.livraria.livraria.livro;


public record DadosDetalhamentoLivro(String titulo,String autor,String editora,String ano_publicacao,String isbn) {

        public DadosDetalhamentoLivro(Livro livro) {

            this(livro.getTitulo(), livro.getAutor(), livro.getEditora(), livro.getIsbn());

        }
}
