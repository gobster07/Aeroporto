package operacoes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Lê um arquivo CSV, inclusive campos protegidos por aspas.
 */
public class LerCsv implements OperacaoArquivo {

    private final Path caminho;

    public LerCsv(Path caminho) {
        this.caminho = caminho;
    }

    @Override
    public void executar() throws IOException {
        if (Files.notExists(caminho)) {
            System.out.println("\nO arquivo CSV ainda não existe. Grave-o primeiro.");
            return;
        }

        System.out.println("\nDados de " + caminho.toAbsolutePath() + ":");
        System.out.println("----------------------------------------");

        try (InputStream entrada = Files.newInputStream(caminho);
             Reader leitor = new InputStreamReader(entrada, StandardCharsets.UTF_8);
             BufferedReader buffer = new BufferedReader(leitor)) {

            String linha;
            int numeroLinha = 0;

            while ((linha = buffer.readLine()) != null) {
                List<String> campos = separarCampos(linha);

                if (numeroLinha == 0) {
                    System.out.println(formatarCampos(campos));
                    System.out.println("----------------------------------------");
                } else {
                    System.out.println(numeroLinha + ". " + formatarCampos(campos));
                }

                numeroLinha++;
            }

            if (numeroLinha == 0) {
                System.out.println("(arquivo vazio)");
            } else if (numeroLinha == 1) {
                System.out.println("(nenhum registro cadastrado)");
            }
        }

        System.out.println("----------------------------------------");
    }

    private List<String> separarCampos(String linha) {
        List<String> campos = new ArrayList<String>();
        StringBuilder campoAtual = new StringBuilder();
        boolean dentroDeAspas = false;

        for (int i = 0; i < linha.length(); i++) {
            char caractere = linha.charAt(i);

            if (caractere == '"') {
                if (dentroDeAspas && i + 1 < linha.length() && linha.charAt(i + 1) == '"') {
                    campoAtual.append('"');
                    i++;
                } else {
                    dentroDeAspas = !dentroDeAspas;
                }
            } else if (caractere == ';' && !dentroDeAspas) {
                campos.add(campoAtual.toString());
                campoAtual.setLength(0);
            } else {
                campoAtual.append(caractere);
            }
        }

        campos.add(campoAtual.toString());
        return campos;
    }

    private String formatarCampos(List<String> campos) {
        StringBuilder texto = new StringBuilder();

        for (int i = 0; i < campos.size(); i++) {
            if (i > 0) {
                texto.append(" | ");
            }
            texto.append(campos.get(i));
        }

        return texto.toString();
    }
}
