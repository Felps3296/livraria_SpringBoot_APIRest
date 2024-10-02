package br.com.livraria.livraria.controller;

import br.com.livraria.livraria.livro.DadosCadastroLivro;
import br.com.livraria.livraria.livro.Livro;
import br.com.livraria.livraria.livro.LivroRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroLivro dados) {

        //convertendo o DTO DadosCadastroLivro em uma entidade Livro
        var livro = new Livro(dados);
        var livroSalvo = livroRepository.save(livro);
        return ResponseEntity.ok(livroSalvo);
    }
}
