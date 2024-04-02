package br.com.darley.desafioBackend.resposittory;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.darley.desafioBackend.models.CadastroPessoa;

public interface CadastroPessoaRepository extends JpaRepository<CadastroPessoa, Long>{

}
