package Voos;

import java.util.Scanner;

public abstract class Voo implements aut { //polimorfismo (classe abstrata + implementação da interface aut)

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


	public String getNum() {return num;}

	public void setNum(String num) {this.num = num;}

	public String getAeronave() {return aeronave;}

	public void setAeronave(String aeronave) {this.aeronave = aeronave;}

	public String getCompanhia() {return companhia;}

	public void setCompanhia(String companhia) {this.companhia = companhia;}

	public double getDistancia() {return distancia;}

	public void setDistancia(double distancia) {this.distancia = distancia;}

	public double getConsumo() {return consumo;}

	public void setConsumo(double consumo) {this.consumo = consumo;}

	public double getCombustivel() {return combustivel;}

	public void setCombustivel(double combustivel) {this.combustivel = combustivel;}

	public String getOrigem() {return origem;}

	public void setOrigem(String origem) {this.origem = origem;}

	public String getDestino() {return Destino;}

	public void setDestino(String destino) {Destino = destino;}


	public abstract double calcularCusto(); //polimorfismo (método abstrato: cada tipo de voo calcula o custo de forma diferente)

	public abstract double calcularCombustivel(); //polimorfismo (método abstrato: cada tipo de voo calcula o combustível de forma diferente)

	public abstract String getTipo(); //polimorfismo (método abstrato: cada tipo de voo retorna seu próprio tipo)

	public abstract void pendencia(); //polimorfismo (método abstrato, vindo da interface aut, implementado de forma diferente em cada subclasse)

	public abstract void exibirResumo(); //polimorfismo (método abstrato: cada tipo de voo exibe seu resumo de forma diferente)

	public abstract void cadastraVoo(Scanner in); //polimorfismo (método abstrato: cada tipo de voo cadastra seus próprios dados)

	public abstract boolean autorizacao(); //polimorfismo (método abstrato, vindo da interface aut, implementado de forma diferente em cada subclasse)

	public abstract void atualizaDocumento(Scanner in); //polimorfismo (método abstrato: cada tipo de voo atualiza sua documentação de forma diferente)




	

}
