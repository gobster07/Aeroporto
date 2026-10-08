package operacoes;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Grava as linhas digitadas pelo usuário em um arquivo de texto.
 */
public class GravarTxt implements OperacaoArquivo {

    private final Path caminho;
    private final Scanner entrada;

    public GravarTxt(Path caminho, Scanner entrada) {
        this.caminho = caminho;
        this.entrada = entrada;
    }

    @Override
    public void executar() throws IOException {
        Files.createDirectories(caminho.getParent());

        System.out.println("\nDigite o conteúdo do arquivo TXT.");
        System.out.println("Para terminar, digite FIM em uma linha separada.");

        int quantidadeLinhas = 0;

        try (OutputStream saida = Files.newOutputStream(
                caminho,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
             Writer escritor = new OutputStreamWriter(saida, StandardCharsets.UTF_8);
             BufferedWriter buffer = new BufferedWriter(escritor)) {

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();

                if ("FIM".equalsIgnoreCase(linha.trim())) {
                    break;
                }

                buffer.write(linha);
                buffer.newLine();
                quantidadeLinhas++;
            }
        }

        System.out.println("Arquivo TXT gravado com sucesso em: " + caminho.toAbsolutePath());
        System.out.println("Linhas gravadas: " + quantidadeLinhas);
    }
}
