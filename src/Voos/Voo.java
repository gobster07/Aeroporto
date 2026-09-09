package Voos;

import Documentos.Documentacao;
import java.util.Scanner;

public abstract class Voo implements aut {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private String origem;

	private String Destino;

	private Documentacao documentacao;

	public Voo(String num, String aeronave, String companhia, double combustivel, String origem, String destino, Documentacao documentacao) {
		this.num = num;
		this.aeronave = aeronave;
		this.companhia = companhia;
		this.combustivel = combustivel;
		this.origem = origem;
		this.Destino = destino;
		this.documentacao = documentacao;
	}

	public Voo(){
		this.num = null;
		this.aeronave = null;
		this.companhia = null;
		this.combustivel = 0;
		this.origem = null;
		this.Destino = null;
		this.documentacao = null;
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

	public Documentacao getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(Documentacao documentacao) {
		this.documentacao = documentacao;
	}

	public abstract double calcularCusto();

	public double calcularCombustivel(){return-1;};

	public abstract String pendencia();

	public String getTipo() {
		return null;
	}

	public abstract void exibirResumo();

	public abstract void cadastraDocumento(Scanner in);

	public boolean verifyCd(){
		boolean verifica = false;
		if(this.num.equalsIgnoreCase(documentacao.getCm())){
			verifica = true;
		}
		return verifica;
	}

	@Override
	public boolean autorizacao() {
		return false;
	}


	

}
