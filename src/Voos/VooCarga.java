package Voos;
import  java.util.Scanner;

public class VooCarga extends Voo {

	private String num;

	private String aeronave;

	private String companhia;

	private double peso;

	private double capacidadeCarga;

	private double combustivel;

	private boolean situaçãoInsp;

	public String getTipo(){
		return "Cargo";
	}

	public void cadastraVoo(Scanner in) {
		System.out.println("Digite o número do voo");
		String num = in.nextLine();
		super.setNum(num);

		System.out.println("Digite a Matricula da aeronave");
		String aeronave = in.nextLine();
		super.setAeronave(aeronave);

		System.out.println("Digite a Companhia da aeronave");
		String companhia = in.nextLine();
		super.setCompanhia(companhia);

		System.out.println("Digite o aeroporto de origem da aeronave");
		String origem = in.nextLine();
		super.setOrigem(origem);

		System.out.println("Digite o aeroporto de destino da aeronave");
		String destino = in.nextLine();
		super.setDestino(destino);

		System.out.println("Digite a distancia entre a origem e o destino");
		double distancia = in.nextDouble();
		super.setDistancia(distancia);
		in.nextLine();
	}

	public void exibirResumo(){

	}

	public void atualizaDocumento(Scanner in){
	}

	public double calcularCusto() {
		return 0;
	}

	public double calcularCombustivel() {
		return 0;
	}

	public boolean autorizacao() {
		return false;
	}

	public void pendencia() {}

}


