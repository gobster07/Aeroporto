package Voos;

import Documentos.DocDom;
import Documentos.Documentacao;

import java.util.Scanner;

public abstract class VooDomestico extends Voo {

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

	@Override
	public void cadastraDocumento(Scanner in) {
		DocDom doc = new DocDom();

		System.out.println("Digite a Matricula da Aeronave: ");
		String cm =  in.nextLine();
		in.nextLine();
		doc.setCm(cm);

		System.out.println("===Responda as proximas verificações com true ou false=== ");

		System.out.println("A aeronave apresenta Certificado de Aeronavigabilidade(CA)?");
		Boolean ca = in.nextBoolean();
		doc.setCa(ca);

		System.out.println("A aeronave apresenta Certificado de Ruído?");
		Boolean car = in.nextBoolean();
		doc.setCar(car);

		System.out.println("A aeronave apresenta Licença de Estação?");
		Boolean lea = in.nextBoolean();
		doc.setLea(lea);

		System.out.println("A aeronave apresenta os Seguros Obrigatótios(RETA)?");
		Boolean reta = in.nextBoolean();
		doc.setReta(reta);

		System.out.println("As Especificações Operacionais estão anexas e completas?");
		Boolean eo = in.nextBoolean();
		doc.setEo(eo);

		documentacao = doc;
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
		boolean autorizado = this.verifyCd();
		return autorizado;
	}

	@Override
	public String pendencia() {
		if (!documentacao.verifyCa()){
			return "A aeronave não apresenta o seguinte documento: CERTIFICADO DE AERONAVEGABILIDADE";
		}
		return "Aeronave pronta para decolagem!";
	}

	@Override
	public String getTipo() {
		return null;
	}

	@Override
	public void exibirResumo() {

	}

}
