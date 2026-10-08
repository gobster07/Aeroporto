package app;

import enums.TipoOperacao;
import operacoes.GravarCsv;
import operacoes.GravarTxt;
import operacoes.LerCsv;
import operacoes.LerTxt;
import operacoes.OperacaoArquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Ponto de entrada do Sistema de Manipulação de Arquivos.
 */
public class App {

    private static final Path PASTA_DADOS = Paths.get("dados");
    private static final Path ARQUIVO_TXT = PASTA_DADOS.resolve("texto.txt");
    private static final Path ARQUIVO_CSV = PASTA_DADOS.resolve("pessoas.csv");

    public static void main(String[] args) {
        if (!criarPastaDados()) {
            return;
        }

        try (Scanner entrada = new Scanner(System.in)) {
            executarMenu(entrada);
        }
    }

    private static boolean criarPastaDados() {
        try {
            Files.createDirectories(PASTA_DADOS);
            return true;
        } catch (IOException excecao) {
            System.err.println("Não foi possível criar a pasta de dados: " + excecao.getMessage());
            return false;
        }
    }

    private static void executarMenu(Scanner entrada) {
        while (true) {
            exibirMenu();
            TipoOperacao tipo = lerTipoOperacao(entrada);

            if (tipo == null) {
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }

            if (tipo == TipoOperacao.SAIR) {
                System.out.println("Programa encerrado. Até logo!");
                return;
            }

            try {
                OperacaoArquivo operacao = criarOperacao(tipo, entrada);
                operacao.executar();
            } catch (IOException excecao) {
                System.err.println("Erro ao manipular o arquivo: " + excecao.getMessage());
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n========================================");
        System.out.println("  SISTEMA DE MANIPULAÇÃO DE ARQUIVOS");
        System.out.println("========================================");

        for (TipoOperacao tipo : TipoOperacao.values()) {
            System.out.println(tipo.getCodigo() + " - " + tipo.getDescricao());
        }

        System.out.print("Escolha uma opção: ");
    }

    private static TipoOperacao lerTipoOperacao(Scanner entrada) {
        if (!entrada.hasNextLine()) {
            return TipoOperacao.SAIR;
        }

        String valor = entrada.nextLine().trim();

        try {
            return TipoOperacao.buscarPorCodigo(Integer.parseInt(valor));
        } catch (NumberFormatException excecao) {
            return null;
        }
    }

    private static OperacaoArquivo criarOperacao(TipoOperacao tipo, Scanner entrada) {
        switch (tipo) {
            case GRAVAR_TXT:
                return new GravarTxt(ARQUIVO_TXT, entrada);
            case LER_TXT:
                return new LerTxt(ARQUIVO_TXT);
            case GRAVAR_CSV:
                return new GravarCsv(ARQUIVO_CSV, entrada);
            case LER_CSV:
                return new LerCsv(ARQUIVO_CSV);
            default:
                throw new IllegalArgumentException("Operação não suportada: " + tipo);
        }
    }
}
