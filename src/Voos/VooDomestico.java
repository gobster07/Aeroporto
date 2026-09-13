package Voos;


import Documetacao.DocumentoDomestico;
import Documetacao.Documentos;

import java.util.Scanner;

public class VooDomestico extends Voo {

	private Documentos documentacao;


	public VooDomestico() {
		super();
		this.documentacao = new DocumentoDomestico();
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

		System.out.println("Digite a quantidade de combustivel no tanque");
		double combustivel = in.nextDouble();
		super.setCombustivel(combustivel);
		in.nextLine();

		documentacao.cadastraDocumento(in);
	}

	@Override
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
		if (super.getAeronave().equalsIgnoreCase(documentacao.getCm())){
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
		else if (documentacao.getDb()){
			return false;
		}
		return true;
	}

	@Override
	public void pendencia() {
		if (!super.getAeronave().equalsIgnoreCase(documentacao.getCm())){
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
		System.out.println("Numero do voo: " + super.getNum());
		System.out.println("Matricula da Aeronave: " + super.getAeronave());
		System.out.println("Companhia: " + super.getCompanhia());
		System.out.println("Origem: " + super.getOrigem());
		System.out.println("Destino: " + super.getDestino());
		System.out.println("Combustivel: " + super.getCombustivel());
		System.out.println("Documentação Regularizada: " + autorizacao());
		System.out.println("Pedências: ");
		pendencia();

	}

}
