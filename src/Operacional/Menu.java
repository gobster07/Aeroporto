package Operacional;

import java.util.Scanner;

public class Menu {

    private Scanner in;

    private Aeroporto aeroporto;

    public Menu() {
        in = new Scanner(System.in);
        aeroporto = new Aeroporto();
    }

    public void menuStart(){
        System.out.println("==Escolha uma Opção==");
        System.out.println("1 - Cadastar Voo");
        System.out.println("2 - Exibir todos os Voos");
        System.out.println("3 - Exibir Voos autorizados");
        System.out.println("4 - Exibir Voos com pendências");
        System.out.println("5 - Buscar Voo");
        System.out.println("6 - Buscar Voo com maior custo operacional");
        System.out.println("7 - Contar Voos por tipo");

        int op = in.nextInt();

        switch(op){
            case 1:
                aeroporto.adicionarVoo(in);
                menuStart();
                break;
            case 2:
                aeroporto.mostraVoo();
                menuStart();
                break;
            case 3:
                aeroporto.mostraAutorizados();
                menuStart();
                break;
            case 4:
                aeroporto.mostraNaoAutorizados();
                menuStart();
                break;
            case 5:
                aeroporto.buscarVoo(in);
                menuStart();
                break;
            case 6:
                aeroporto.contaVoo();
                menuStart();
                break;
            default:
                break;
        }

    }
}
