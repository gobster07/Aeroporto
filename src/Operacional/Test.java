package Operacional;

import Voos.Voo;
import Voos.VooDomestico;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Voo voo = new VooDomestico(); //polimorfismo (referência do tipo Voo apontando para um objeto VooDomestico)
        Scanner in = new Scanner(System.in);

        voo.cadastraVoo(in); //polimorfismo (chamada via referência Voo executa a versão de VooDomestico em tempo de execução)
        voo.exibirResumo(); //polimorfismo (chamada via referência Voo executa a versão de VooDomestico em tempo de execução)

    }
}
