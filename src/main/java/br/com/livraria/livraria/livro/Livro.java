package br.com.livraria.livraria.livro;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "livros")
@Entity(name = "livro")//Define a classe como uma entidade JPA
@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String titulo;
    private String autor;
    private String editora;
    private String isbn;
    private boolean disponibilidade = true;


    public Livro(DadosCadastroLivro dados) {
        this.titulo = dados.titulo();
        this.autor = dados.autor();
        this.editora = dados.editora();
        this.isbn = dados.isbn();
        this.disponibilidade = dados.disponibilidade();

    }

}
