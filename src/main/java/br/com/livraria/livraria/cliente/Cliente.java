package br.com.livraria.livraria.cliente;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "cliente")
@Entity(name = "Cliente")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class Cliente {

    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;

    public Cliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.dataNascimento();
        this.dataNascimento = dados.dataNascimento();
    }
}
