package br.com.livraria.livraria.cliente;

public record DadosCadastroCliente(
        String nome,
        String email,
        String telefone,
        String dataNascimento) {
}
