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

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizarLivro dados) {

        var livro = livroRepository.getReferenceById(dados.id());
        livro.atualizarInformacoes(dados);
        return ResponseEntity.ok(new DadosDetalhamentoLivro(livro));
    }

    @DeleteMapping("{id}")
    @Transactional
    public ResponseEntity<Map<String, String>> excluirLivro(@PathVariable Long id) {
        Optional<Livro> livroOptional = livroRepository.findById(id);
        if (livroOptional.isPresent()) {
            Livro livro = livroOptional.get();
            if (livro.excluir()) {
                livroRepository.delete(livro);
                Map<String, String> response = new HashMap<>();
                response.put("mensagem", "Livro '" + livro.getTitulo() + "' excluído com sucesso!");
                return ResponseEntity.ok(response);
            } else {
                Map<String, String> response = new HashMap<>();
                response.put("mensagem", "Livro '" + livro.getTitulo() + "' não está disponivel para ser excluido");
                return ResponseEntity.ok(response);
            }
        } else {
            Map<String, String> response = new HashMap<>();
            response.put("mensagem", "Livro não encontrado.");
            return ResponseEntity.ok(response);
        }
    }
}
