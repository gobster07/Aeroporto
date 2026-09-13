package Voos;


import Documetacao.DocumentoDomestico;
import Documetacao.Documentos;

import java.util.Scanner;

public class VooDomestico extends Voo {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private String origem;

	private String destino;

	private Documentos documentacao;

	public VooDomestico(String num, String aeronave, String companhia, String origem, String destino, Documentos documentacao, double combustivel) {
		this.num = num;
		this.aeronave = aeronave;
		this.companhia = companhia;
		this.origem = origem;
		this.destino = destino;
		this.documentacao = documentacao;
		this.combustivel = combustivel;
	}

	public VooDomestico() {
		this.num = "";
		this.aeronave = "";
		this.companhia = "";
		this.origem = "";
		this.destino = "";
		this.documentacao = new DocumentoDomestico();
		this.combustivel = 0;
	}

	@Override
	public void cadastraVoo(Scanner in) {
		System.out.println("Digite o número do voo");
		this.num = in.nextLine();

		System.out.println("Digite a Matricula da aeronave");
		this.aeronave = in.nextLine();

		System.out.println("Digite a Companhia da aeronave");
		this.companhia = in.nextLine();

		System.out.println("Digite o aeroporto de origem da aeronave");
		this.origem = in.nextLine();

		System.out.println("Digite o aeroporto de destino da aeronave");
		this.destino = in.nextLine();

		System.out.println("Digite a quantidade de combustivel no tanque");
		this.combustivel = in.nextDouble();
		in.nextLine();

		documentacao.cadastraDocumento(in);
	}

	public void atualizaDocumento(Scanner in){
		documentacao.cadastraDocumento(in);
	}

	@Override
	public double calcularCusto() {
		return 0;
	}

	@Override
	public double calcularCombustivel() {
		return 0;
	}

	@Override
	public boolean autorizacao() {
		if (!this.aeronave.equalsIgnoreCase(documentacao.getCm())){
			return false;
		}
		else if (!documentacao.getCa()){
			return false;
		}

		else if (!documentacao.getCar()){
			return false;
		}

		else if (!documentacao.getLea()){
			return false;
		}
		else if (!documentacao.getReta()){
			return false;
		}
		else if (!documentacao.getEo()){
			return false;
		}
		else if (!documentacao.getDb()){
			return false;
		}
		return true;
	}

	@Override
	public void pendencia() {
		if (!this.aeronave.equalsIgnoreCase(documentacao.getCm())){
			System.out.println("Matricula difere na documentação da aeronave");
		}

		if (!documentacao.getCa()){
			System.out.println("A aeronave não apresenta o seguinte documento: CERTIFICADO DE AERONAVEGABILIDADE");
		}

		if (!documentacao.getCar()){
			System.out.println("A aeronave não apresenta o seguinte documento: CERTIFICADO DE RUÍDO");
		}

		if (!documentacao.getLea()){
			System.out.println("A aeronave não apresenta o seguinte documento: LICENÇA DE ESTAÇÃO");
		}
		if (!documentacao.getReta()){
			System.out.println("A aeronave não apresenta os SEGUROS OBRIGATÓRIOS");
		}
		if (!documentacao.getEo()){
			System.out.println("A aeronave não apresenta ESPECIFICAÇÕES OPERACIONAIS");
		}
		if (!documentacao.getDb()){
			System.out.println("A aeronave não emitiu DIARIO DE BORDO");
		}
	}

	@Override
	public String getTipo() {
		return "Voo Domestico";
	}

	@Override
	public void exibirResumo() {
		System.out.println("==Voo Domestico==");
		System.out.println("Numero do voo: " + this.num);
		System.out.println("Matricula da Aeronave: " + this.aeronave);
		System.out.println("Companhia: " + this.companhia);
		System.out.println("Origem: " + this.origem);
		System.out.println("Destino: " + this.destino);
		System.out.println("Combustivel: " + this.combustivel);
		System.out.println("Documentação Regularizada: " + autorizacao());
		System.out.println("Pedências: ");
		pendencia();

	}

}
