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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Grava uma lista de pessoas em um arquivo CSV separado por ponto e vírgula.
 */
public class GravarCsv implements OperacaoArquivo {

    private final Path caminho;
    private final Scanner entrada;

    public GravarCsv(Path caminho, Scanner entrada) {
        this.caminho = caminho;
        this.entrada = entrada;
    }

    @Override
    public void executar() throws IOException {
        Files.createDirectories(caminho.getParent());

        int quantidade = lerQuantidade();
        List<String[]> pessoas = lerPessoas(quantidade);

        try (OutputStream saida = Files.newOutputStream(
                caminho,
                StandardOpenOption.CREATE,
                StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.WRITE);
             Writer escritor = new OutputStreamWriter(saida, StandardCharsets.UTF_8);
             BufferedWriter buffer = new BufferedWriter(escritor)) {

            escreverLinha(buffer, "Nome", "Idade", "E-mail");

            for (String[] pessoa : pessoas) {
                escreverLinha(buffer, pessoa);
            }
        }

        System.out.println("\nArquivo CSV gravado com sucesso em: " + caminho.toAbsolutePath());
        System.out.println("Registros gravados: " + quantidade);
    }

    private int lerQuantidade() throws IOException {
        while (true) {
            System.out.print("\nQuantas pessoas deseja gravar? ");
            verificarEntradaDisponivel();
            String valor = entrada.nextLine().trim();

            try {
                int quantidade = Integer.parseInt(valor);
                if (quantidade > 0) {
                    return quantidade;
                }
            } catch (NumberFormatException excecao) {
                // A mensagem abaixo também cobre valores que não são números.
            }

            System.out.println("Digite um número inteiro maior que zero.");
        }
    }

    private List<String[]> lerPessoas(int quantidade) throws IOException {
        List<String[]> pessoas = new ArrayList<String[]>();

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\nPessoa " + i + " de " + quantidade + ":");
            String nome = lerCampo("Nome: ");
            String idade = lerCampo("Idade: ");
            String email = lerCampo("E-mail: ");

            pessoas.add(new String[] {nome, idade, email});
        }

        return pessoas;
    }

    private String lerCampo(String mensagem) throws IOException {
        System.out.print(mensagem);
        verificarEntradaDisponivel();
        return entrada.nextLine();
    }

    private void verificarEntradaDisponivel() throws IOException {
        if (!entrada.hasNextLine()) {
            throw new IOException("A entrada foi encerrada antes da conclusão do cadastro.");
        }
    }

    private void escreverLinha(BufferedWriter buffer, String... campos) throws IOException {
        for (int i = 0; i < campos.length; i++) {
            if (i > 0) {
                buffer.write(';');
            }
            buffer.write(escaparCampo(campos[i]));
        }
        buffer.newLine();
    }

    private String escaparCampo(String campo) {
        String campoSeguro = campo.replace("\"", "\"\"");

        if (campoSeguro.indexOf(';') >= 0
                || campoSeguro.indexOf('"') >= 0
                || campoSeguro.indexOf('\n') >= 0
                || campoSeguro.indexOf('\r') >= 0) {
            return '"' + campoSeguro + '"';
        }

        return campoSeguro;
    }
}
