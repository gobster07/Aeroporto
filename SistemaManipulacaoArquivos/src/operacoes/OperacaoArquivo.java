package operacoes;

import java.io.IOException;

/**
 * Contrato comum para todas as opções de manipulação de arquivos.
 */
public interface OperacaoArquivo {

    void executar() throws IOException;
}
