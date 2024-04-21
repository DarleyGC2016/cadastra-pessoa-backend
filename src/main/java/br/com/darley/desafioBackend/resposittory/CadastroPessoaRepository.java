package br.com.darley.desafioBackend.resposittory;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.darley.desafioBackend.models.CadastroPessoa;

public interface CadastroPessoaRepository extends JpaRepository<CadastroPessoa, Long>{
    Optional<CadastroPessoa> findByEmail(String email);
}
