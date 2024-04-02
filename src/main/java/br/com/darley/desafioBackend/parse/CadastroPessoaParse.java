package br.com.darley.desafioBackend.parse;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.enums.MensagemEnum;
import br.com.darley.desafioBackend.models.CadastroPessoa;

public class CadastroPessoaParse {
    
    public static CadastroPessoaParse get() {
        return new CadastroPessoaParse();
    }

    public CadastroPessoa entity(CadastroPessoaDTO dto){
        CadastroPessoa pessoa = new CadastroPessoa();
        if (dto.getNome().isEmpty() &&
            dto.getEmail().isEmpty() &&
            dto.getSenha().isEmpty() &&
            dto.getConfirmarSenha().isEmpty()) {
            pessoa.setMensagemEnum(MensagemEnum.ERRO);
            return pessoa;
        } else {
            pessoa.setNome(dto.getNome());
            pessoa.setEmail(dto.getEmail());
            pessoa.setSenha(dto.getSenha());
            pessoa.setConfirmarSenha(dto.getConfirmarSenha());
            pessoa.setMensagemEnum(MensagemEnum.SUCESSO);
            return pessoa;
        }
    }
}
