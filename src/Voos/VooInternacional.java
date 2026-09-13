package Voos;

import java.util.Scanner;

public abstract class VooInternacional extends Voo {

	private String Num;

	private String Aeronave;

	private String Companhia;

	private double Combustivel;

	private String Origem;

	private String Destino;

	private int documentação;

	public void atualizaDocumento(Scanner in){
	}

	public double calcularCusto() {
		return 0;
	}

	public double calcularCombustivel() {
		return 0;
	}

	public boolean autorização() {
		return false;
	}

	public void pendencia() {

	}

	public String getTipo() {
		return null;
	}

	public void exibirResumo() {

	}

	public boolean autorizacao() {
		return false;
	}

}
