package Operacional;
import Voos.Voo;
import Voos.VooCarga;
import Voos.VooDomestico;
import Voos.VooInternacional;

import java.util.ArrayList;
import java.util.Scanner;

public class Aeroporto {

    private ArrayList<Voo> voos = new ArrayList<>();

    public Aeroporto() {
        voos = new ArrayList<>();
    }

    public void adicionarVoo(Scanner in) {
        Voo vooD = new VooDomestico();

        Voo vooI = new VooInternacional();

        Voo vooC = new VooCarga();

        System.out.println("Qual o tipo do Voo ?");
        System.out.println("1 - Domestico");
        System.out.println("2 - Internacional");
        System.out.println("3 - Carga");

        int op = in.nextInt();

        switch (op) {
            case 1:
                vooD.cadastraVoo(in);

                if (autCadastro(vooD)){
                    this.voos.add(vooD);
                }

                break;
            case 2:
                vooI.cadastraVoo(in);

                if (autCadastro(vooI)){
                    this.voos.add(vooI);
                }
                break;
            case 3:
                vooC.cadastraVoo(in);
                if (autCadastro(vooC)){
                    this.voos.add(vooC);
                }
                break;
            default:
                break;
        }

    }

    public int indetificaTipoVoo(Voo voo) {
        String tipo = voo.getTipo();
        if (tipo.equalsIgnoreCase("Domestico")){
            return 0;
        }
        else if (tipo.equalsIgnoreCase("Internacional")){
            return 1;
        }
        else if (tipo.equalsIgnoreCase("Carga")){
            return 2;
        }
        return -1;
    }

    public void contaVoo(){
        int countD = 0;
        int countI = 0;
        int countC = 0;

        for (int i = 0; i<this.voos.size(); i++){
            int tipo = indetificaTipoVoo(this.voos.get(i));
            switch (tipo){
                case 0:
                    countD++;
                    break;
                case 1:
                    countI++;
                    break;
                case 2:
                    countC++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Domesticos: " + countD);
        System.out.println("Internacionais: " + countI);
        System.out.println("Cargas: " + countC);
    }

    public void buscarVoo(Scanner in) {
        System.out.println("Qual o número do Voo ?");
        String n = in.next();

        for (int i = 0; i < this.voos.size(); i++) {
            if (n.equalsIgnoreCase(voos.get(i).getNum())){
                voos.get(i).exibirResumo();
                return;
            }
        }
    }

    public void mostraVoo() {
        for (int i = 0; i < this.voos.size(); i++) {
            voos.get(i).exibirResumo();
        }
    }

    public void mostraAutorizados(){
        for (int i = 0; i < this.voos.size(); i++) {
            if (this.voos.get(i).autorizacao()){
                voos.get(i).exibirResumo();
            }
        }
    }

    public void mostraNaoAutorizados(){
        for (int i = 0; i < this.voos.size(); i++) {
            if (!this.voos.get(i).autorizacao()){
                voos.get(i).exibirResumo();
            }
        }
    }

    public boolean autCadastro(Voo voo) {
        for (int i = 0; i < this.voos.size(); i++) {
            if (voo.getNum().equals(this.voos.get(i).getNum())) {
                System.out.println("Voo com código já existente");
                return false;
            }
        }
        return true;
    }



    public ArrayList<Voo> getVoos() {
        return voos;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }
}
