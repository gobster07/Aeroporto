package Voos;

import java.util.Scanner;
import Documetacao.Documentos;

public abstract class Voo implements aut {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private String origem;

	private String destino;

	private Documentos documento;

	public abstract void cadastraVoo(Scanner in);

	public abstract double calcularCusto();

	public double calcularCombustivel() {
		return 0;
	}

	public abstract boolean autorização();

	public abstract String pendencia();

	public abstract String getTipo();

	public abstract void exibirResumo();


	/**
	 * @see aut#autorizacao()
	 */
	public boolean autorizacao() {
		return false;
	}

}
