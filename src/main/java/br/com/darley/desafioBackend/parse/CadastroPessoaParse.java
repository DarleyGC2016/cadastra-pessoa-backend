package br.com.darley.desafioBackend.parse;

import br.com.darley.desafioBackend.dto.CadastroPessoaDTO;
import br.com.darley.desafioBackend.models.CadastroPessoa;

public class CadastroPessoaParse {
    
    public static CadastroPessoaParse get() {
        return new CadastroPessoaParse();
    }

    public CadastroPessoa entity(CadastroPessoaDTO dto){
        CadastroPessoa pessoa = new CadastroPessoa();
            pessoa.setNome(dto.getNome());
            pessoa.setEmail(dto.getEmail());
            pessoa.setSenha(dto.getSenha());         
            return pessoa;
    }

    public CadastroPessoa entity(CadastroPessoaDTO dto, String msg){
        CadastroPessoa pessoa = new CadastroPessoa();
        pessoa.setMensagem(msg);
        return pessoa;
    }

    
}
