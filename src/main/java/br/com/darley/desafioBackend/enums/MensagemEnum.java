package br.com.darley.desafioBackend.enums;

public enum MensagemEnum {
    SUCESSO(1L, "Sucesso ao cadastrar os dados!!"),
    ERRO(2L, "Erro!! A confirmação de Senha não combina com a Senha"),
    JA_EXISTE(3L, "Este usuário já existe!");

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
