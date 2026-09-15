package Voos;
import  java.util.Scanner;

public class VooCarga extends Voo {

	private double peso;

	private double capacidadeCarga;

	private boolean situacaoInsp;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String getTipo(){
		return "Cargo";
	}

	@Override
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
		System.out.println("Digite o peso da carga");
		double peso = in.nextDouble();
		setPeso(peso);
	}

	@Override
	public void exibirResumo(){

	}

	@Override
	public void atualizaDocumento(Scanner in){
	}
	@Override
	public double calcularCombustivel() {

		double combTotal = (super.getDistancia()*0.15)+(peso*0.02);
		return combTotal;
	}
	@Override
	public double calcularCusto() {
		double custoTotal = (super.getDistancia()*8.5)+(peso*1.5);
		return custoTotal;
	}

	@Override
	public boolean autorizacao() {
		return false;
	}

	@Override
	public void pendencia() {}

}


