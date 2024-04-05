package br.com.darley.desafioBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.models.CadastroPessoa;
import br.com.darley.desafioBackend.parse.CadastroPessoaParse;
import br.com.darley.desafioBackend.resposittory.CadastroPessoaRepository;

@Service
public class CadastroPessoaService{

    @Autowired
    private CadastroPessoaRepository cadastroPessoaRepository;


    public CadastroPessoa save (CadastroPessoaDTO dto) {                   
            CadastroPessoa cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto);

            cadastroPessoaRepository.save(cadastroPessoa);

            return cadastroPessoa;
    }
}
