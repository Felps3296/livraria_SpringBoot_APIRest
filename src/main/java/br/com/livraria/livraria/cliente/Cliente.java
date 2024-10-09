package br.com.livraria.livraria.cliente;

import br.com.livraria.livraria.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "clientes")
@Entity(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.dataNascimento();
        this.dataNascimento = dados.dataNascimento();
        this.endereco = new Endereco(dados.endereco());
    }
}
