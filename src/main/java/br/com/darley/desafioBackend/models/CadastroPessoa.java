package br.com.darley.desafioBackend.models;

import java.io.Serializable;

import br.com.darley.desafioBackend.enums.MensagemEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_CADASTRO_PESSOA")
@Setter
@Getter
public class CadastroPessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_cadastro_pessoa")
    private Long id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "email")
    private String email;

    @Column(name = "senha")
    private String senha;

    @Column(name = "confirmar_senha")
    private String confirmarSenha;
    
    @Column(name = "mensagem")
    @Enumerated(EnumType.STRING)
    private MensagemEnum mensagemEnum;
}
