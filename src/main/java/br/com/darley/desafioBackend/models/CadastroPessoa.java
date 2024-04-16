package br.com.darley.desafioBackend.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

    @Column(name = "confirmar_senha", nullable = true)
    private String confirmarSenha;
    
    @Column(nullable = true, columnDefinition = "")
    private String mensagem;

    @Override
    public String toString() {
        return "CadastroPessoa{" +
                "nome='" + nome + '\'' +
                ", mensagem=" + mensagem +
                ", senha='" + senha + '\'' +
                ", confirmarSenha='" + confirmarSenha + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
