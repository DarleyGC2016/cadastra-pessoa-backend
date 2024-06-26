package br.com.darley.desafioBackend.parse;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.enums.MensagemEnum;
import br.com.darley.desafioBackend.models.CadastroPessoa;
import br.com.darley.desafioBackend.models.Mensagem;

public class CadastroPessoaParse {
    
    public static CadastroPessoaParse get() {
        return new CadastroPessoaParse();
    }

    public CadastroPessoa entity(CadastroPessoaDTO dto){
        CadastroPessoa pessoa = new CadastroPessoa();
            pessoa.setNome(dto.getNome());
            pessoa.setEmail(dto.getEmail());
            pessoa.setSenha(dto.getSenha());
            pessoa.setConfirmarSenha(dto.getConfirmarSenha());
            pessoa.setMensagem(new Mensagem(MensagemEnum.SUCESSO.getDescricao()));
            return pessoa;
    }

    public CadastroPessoa entity(CadastroPessoaDTO dto, String msg){
        CadastroPessoa pessoa = new CadastroPessoa();
            pessoa.setNome(dto.getNome());
            pessoa.setEmail(dto.getEmail());
            pessoa.setSenha(dto.getSenha());
            pessoa.setConfirmarSenha(dto.getConfirmarSenha());
            pessoa.setMensagem(new Mensagem(msg));
            return pessoa;
    }
}
