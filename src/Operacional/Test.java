package Operacional;

import Voos.Voo;
import Voos.VooDomestico;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Voo voo = new VooDomestico();
        Scanner in = new Scanner(System.in);

        voo.cadastraVoo(in);
        voo.exibirResumo();

    }
}
