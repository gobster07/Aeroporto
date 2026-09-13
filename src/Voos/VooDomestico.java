package Voos;

import Documentos.DocDom;
import Documentos.Documentacao;

import java.util.Scanner;

public class VooDomestico extends Voo {

	private String num;

	private String aeronave;

	private String companhia;

	private double combustivel;

	private String origem;

	private String destino;

	private DocDom documentacao;

	public VooDomestico(String num, String aeronave, String companhia, String origem, String destino, DocDom documentacao, double combustivel) {
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
		this.documentacao = new DocDom();
		this.combustivel = 0;
	}

	@Override
	public void cadastraVoo(Scanner in) {
		System.out.println("Digite o número do voo");
		this.num = in.nextLine();

		System.out.println("Digite a matricula da aeronave");
		this.aeronave = in.nextLine();

		documentacao.cadastraDocument(in);
	}

	public void atualizaDocumento(Scanner in){
		documentacao.cadastraDocument(in);
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
		else if (!documentacao.verifyCa()){
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

		if (!documentacao.verifyCa()){
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
