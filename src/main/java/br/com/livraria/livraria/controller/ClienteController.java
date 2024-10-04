package br.com.livraria.livraria.controller;

import br.com.livraria.livraria.cliente.Cliente;
import br.com.livraria.livraria.cliente.DadosCadastroCliente;
import br.com.livraria.livraria.livro.Livro;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    public ResponseEntity cadastro(@RequestBody DadosCadastroCliente dados) {

        var cliente = new Cliente();

    }
}
