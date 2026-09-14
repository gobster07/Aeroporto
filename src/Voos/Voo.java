package Voos;

import Documetacao.Documentos;

import java.util.Scanner;

public abstract class Voo implements aut {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private double distancia;

	private double consumo;

	private String origem;

	private String Destino;



	public Voo(){
		this.num = null;
		this.aeronave = null;
		this.companhia = null;
		this.combustivel = 0;
		this.origem = null;
		this.Destino = null;
	}


	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAeronave() {
		return aeronave;
	}

	public void setAeronave(String aeronave) {
		this.aeronave = aeronave;
	}

	public String getCompanhia() {
		return companhia;
	}

	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return Destino;
	}

	public void setDestino(String destino) {
		Destino = destino;
	}


	public abstract double calcularCusto();

	public abstract double calcularCombustivel();

	public abstract String getTipo();

	public abstract void pendencia();

	public abstract void exibirResumo();

	public abstract void cadastraVoo(Scanner in);

	public abstract boolean autorizacao();

	public abstract void atualizaDocumento(Scanner in);




	

}
