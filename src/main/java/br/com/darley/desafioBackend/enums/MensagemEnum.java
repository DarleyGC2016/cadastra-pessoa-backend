package br.com.darley.desafioBackend.enums;

public enum MensagemEnum {
    SUCESSO(1L, "Sucesso"),ERRO(2L, "Erro");

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
