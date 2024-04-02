package br.com.darley.desafioBackend.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CadastroPessoaDTO {
    private String nome;    

    private String email;

    private String senha;

    private String confirmarSenha;
}
