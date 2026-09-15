package Voos;

import java.util.Scanner;
import Documetacao.DocumentoInternacional;

public class VooInternacional extends Voo {

	private DocumentoInternacional documentacao;
	private int nPassageiros;

	public DocumentoInternacional getDocumentacao() {
		return documentacao;
	}

	public void setDocumentacao(DocumentoInternacional documentacao) {
		this.documentacao = documentacao;
	}

	public int getnPassageiros() {
		return nPassageiros;
	}

	public void setnPassageiros(int nPassageiros) {
		this.nPassageiros = nPassageiros;
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

		System.out.println("Digite quantos passageiros estarao no voo:");
		int passageiros = in.nextInt();
		setnPassageiros(passageiros);
	}

	@Override
	public void atualizaDocumento(Scanner in){
	}

	public double calcularCombustivel() {
		double combTotal= super.getDistancia()*0.12;
		double pct = combTotal/5;
		combTotal = combTotal+pct;

		return combTotal;
	}

	public double calcularCusto() {
		double custoTotal = (super.getDistancia()*12)+(getnPassageiros() *60)+8000;
		return custoTotal;
	}

	public void pendencia(){
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
		if(!documentacao.getFp()){
			System.out.println("A tripulacao nao apresentou passaporte valido");
		}
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
