package operacoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Lê e exibe o conteúdo de um arquivo de texto.
 */
public class LerTxt implements OperacaoArquivo {

    private final Path caminho;

    public LerTxt(Path caminho) {
        this.caminho = caminho;
    }

    @Override
    public void executar() throws IOException {
        if (Files.notExists(caminho)) {
            System.out.println("\nO arquivo TXT ainda não existe. Grave-o primeiro.");
            return;
        }

        System.out.println("\nConteúdo de " + caminho.toAbsolutePath() + ":");
        System.out.println("----------------------------------------");

        boolean possuiConteudo = false;

        try (InputStream entrada = Files.newInputStream(caminho);
             Reader leitor = new InputStreamReader(entrada, StandardCharsets.UTF_8);
             BufferedReader buffer = new BufferedReader(leitor)) {

            String linha;
            while ((linha = buffer.readLine()) != null) {
                System.out.println(linha);
                possuiConteudo = true;
            }
        }

        if (!possuiConteudo) {
            System.out.println("(arquivo vazio)");
        }

        System.out.println("----------------------------------------");
    }
}
