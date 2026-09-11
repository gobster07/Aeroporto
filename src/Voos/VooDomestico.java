package Voos;

import Documetacao.Documentos;

public abstract class VooDomestico extends Voo {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private String origem;

	private String destino;

	private Documentos documento;

	public double calcularCusto() {
		return 0;
	}

	public double calcularCombustivel() {
		return 0;
	}

	public boolean autorização() {
		return false;
	}

	public String pendencia() {
		return null;
	}

	public String getTipo() {
		return null;
	}

	public void exibirResumo() {

	}

}
