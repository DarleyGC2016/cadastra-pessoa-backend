package br.com.darley.desafioBackend.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.models.CadastroPessoa;
import br.com.darley.desafioBackend.service.CadastroPessoaService;

@RestController
@RequestMapping(path = "/cadastro")
@CrossOrigin(origins = "*")
public class CadastroPessoaRest {
        @Autowired
        private CadastroPessoaService cadastroPessoaService;

        @PostMapping(path = "/new")
        public ResponseEntity<CadastroPessoa> save(@RequestBody CadastroPessoaDTO dto){                       
                return new ResponseEntity<>(cadastroPessoaService.save(dto), HttpStatus.CREATED);
        }
}
