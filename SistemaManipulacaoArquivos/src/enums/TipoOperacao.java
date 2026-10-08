package enums;

public enum TipoOperacao {

    GRAVAR_TXT(1, "Gravar arquivo TXT"),
    LER_TXT(2, "Ler arquivo TXT"),
    GRAVAR_CSV(3, "Gravar arquivo CSV"),
    LER_CSV(4, "Ler arquivo CSV"),
    SAIR(0, "Sair");

    private final int codigo;
    private final String descricao;

    TipoOperacao(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoOperacao buscarPorCodigo(int codigo) {
        for (TipoOperacao tipo : values()) {
            if (tipo.codigo == codigo) {
                return tipo;
            }
        }

        return null;
    }
}
