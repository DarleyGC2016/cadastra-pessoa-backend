package br.com.darley.desafioBackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.enums.MensagemEnum;
import br.com.darley.desafioBackend.models.CadastroPessoa;
import br.com.darley.desafioBackend.parse.CadastroPessoaParse;
import br.com.darley.desafioBackend.resposittory.CadastroPessoaRepository;

@Service
public class CadastroPessoaService{

    @Autowired
    private CadastroPessoaRepository cadastroPessoaRepository;


    public CadastroPessoa save (CadastroPessoaDTO dto) {   
        CadastroPessoa cadastroPessoa = null;  
        if (!dto.getNome().isEmpty() && !dto.getEmail().isEmpty() && !dto.getSenha().isEmpty() &&
            !dto.getConfirmarSenha().isEmpty() && dto.getConfirmarSenha().equals(dto.getSenha())) {                         
            cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto);
            cadastroPessoaRepository.save(cadastroPessoa);
        } else {
            cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto, MensagemEnum.ERRO.getDescricao());
        }
        return cadastroPessoa;
    }
}
