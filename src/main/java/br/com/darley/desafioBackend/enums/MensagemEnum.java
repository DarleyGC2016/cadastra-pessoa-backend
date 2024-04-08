package br.com.darley.desafioBackend.enums;

public enum MensagemEnum {
    SUCESSO(1L, "Sucesso ao cadastrar os dados!!"),ERRO(2L, "Erro!! A confirmação de Senha não é igual a Senha");

    private Long id;

    private String descricao;

    public Long getId() {
        return id;
    }
    
    public String getDescricao() {
        return descricao;
    }

    private MensagemEnum(Long id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }


    
}
