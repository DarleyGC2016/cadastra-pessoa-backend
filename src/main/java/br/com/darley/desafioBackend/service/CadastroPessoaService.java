package br.com.darley.desafioBackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.darley.desafioBackend.config.ConfigSeguranca;
import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.enums.MensagemEnum;
import br.com.darley.desafioBackend.models.CadastroPessoa;
import br.com.darley.desafioBackend.parse.CadastroPessoaParse;
import br.com.darley.desafioBackend.resposittory.CadastroPessoaRepository;

@Service
public class CadastroPessoaService{

    @Autowired
    private CadastroPessoaRepository cadastroPessoaRepository;

    @Autowired
    private ConfigSeguranca seguranca;

    public CadastroPessoa save (CadastroPessoaDTO dto) {   
        CadastroPessoa cadastroPessoa = null; 
         
        Optional<CadastroPessoa> pessoaOptional = cadastroPessoaRepository.findAll()
        .stream()
        .filter(pessoa -> pessoa.getEmail().equals(dto.getEmail()))
        .findFirst();
        if (pessoaOptional.isPresent()){
            cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto, MensagemEnum.JA_EXISTE.getDescricao());
            return cadastroPessoa;
        }
        else if (dto.getConfirmarSenha().equals(dto.getSenha())) {
           seguranca = new ConfigSeguranca();
          
            dto.setSenha(seguranca.passwordEncoder().encode(dto.getSenha()));
            cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto);

            cadastroPessoaRepository.save(cadastroPessoa);
            cadastroPessoa.setMensagem(MensagemEnum.SUCESSO.getDescricao());   
        } else {
            cadastroPessoa = CadastroPessoaParse
            .get()
            .entity(dto, MensagemEnum.ERRO.getDescricao());
        }
        return cadastroPessoa;
    }
}
