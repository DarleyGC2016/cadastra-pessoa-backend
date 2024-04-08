package br.com.darley.desafioBackend.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_MENSAGEM")
@Setter
@Getter
public class Mensagem implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @OneToOne(mappedBy = "mensagem")
    private CadastroPessoa cadastroPessoa;

    public Mensagem() {
    }

    public Mensagem(String descricao) {
        this.descricao = descricao;
    }

    
}
