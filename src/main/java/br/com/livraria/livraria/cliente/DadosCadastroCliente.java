package br.com.livraria.livraria.cliente;

import br.com.livraria.livraria.endereco.DadosEndereco;

public record DadosCadastroCliente(
        String nome,
        String email,
        String telefone,
        String dataNascimento,
        DadosEndereco endereco) {
}
