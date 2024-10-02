package br.com.livraria.livraria.controller;

import br.com.livraria.livraria.livro.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroLivro dados) {

        var livro = new Livro(dados);
        var livroSalvo = livroRepository.save(livro);
        return ResponseEntity.ok(livroSalvo);
    }

    @GetMapping
    public ResponseEntity <Page<DadosListrarLivro>> listar(@PageableDefault Pageable paginacao) {

        var page = livroRepository.findAll(paginacao).map(DadosListrarLivro::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping()
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizarLivro dados) {

        var livro = livroRepository.getReferenceById(dados.id());
        livro.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosListrarLivro(livro));
    }
}
