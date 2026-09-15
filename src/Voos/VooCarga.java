package Voos;
import  java.util.Scanner;
import Documetacao.DocumentoCargo;

public class VooCarga extends Voo {
	private DocumentoCargo documentacao;

	private double peso;

	private double capacidadeCarga;

	private boolean situacaoInsp;

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public DocumentoCargo getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(DocumentoCargo documentacao) {
		this.documentacao = documentacao;
	}

	@Override
	public String getTipo() {
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
	public void exibirResumo() {

	}

	@Override
	public void atualizaDocumento(Scanner in) {
	}

	@Override
	public double calcularCombustivel() {

		double combTotal = (super.getDistancia() * 0.15) + (peso * 0.02);
		return combTotal;
	}

	@Override
	public double calcularCusto() {
		double custoTotal = (super.getDistancia() * 8.5) + (peso * 1.5);
		return custoTotal;
	}

	@Override
	public boolean autorizacao() {

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
		if (!documentacao.getNotoc()){
			System.out.println("A aeronave nao emitiu o DOCUMENTO DE NOTIFICACAO AO CAPITAO");
		}
		if (!documentacao.getMc()){
			System.out.println("A aeronave nao emitiu MANIFESTO DE CARGA");
		}
		if (!documentacao.getAwb()){
			System.out.println("A aeronave nao apresentou o DOCUMENTO DE CONHECIMENTO DE TRANSPORTE AEREO");
		}
		if (!documentacao.getSd()){
			System.out.println("A DECLARACAO DO EXPEDIDOR nao foi emitida");
		}
		if (!documentacao.getNf()){
			System.out.println("A Aeronave nao emitiu NOTA FISCAL");
		}
	}
}