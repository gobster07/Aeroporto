package Documetacao;
import java.util.Scanner;
public class DocumentoDomestico extends Documentos {

	private boolean pl;

	public DocumentoDomestico(){
		super();
		this.pl = false;
	}

	@Override
	public void cadastraDocumento(Scanner in) {
		System.out.println("Digite a Matricula da Aeronave");
		String cm = in.nextLine();
		this.setCm(cm);

		System.out.println("Responda as proximas perguntas com true ou false");

		System.out.println("A aeronave apresenta certificado de aeronavigabilidade?");
		boolean ca = in.nextBoolean();
		super.setCa(ca);

		System.out.println("A aeronave apresenta diário de bordo?");
		boolean db = in.nextBoolean();
		super.setDb(db);

		System.out.println("A aeronave possui certificado de verificação de aeronavigabilidade?");
		boolean cva = in.nextBoolean();
		super.setCva(cva);

		System.out.println("A aeronave apresenta certificado de verificação de rádio?");
		boolean radio = in.nextBoolean();
		super.setRadio(radio);

		System.out.println("A aeronave apresenta os seguros obrigatórios(RETA) ?");
		boolean reta = in.nextBoolean();
		super.setReta(reta);

		System.out.println("A aeronave apresenta lista de passageiros válida?");
		boolean pl = in.nextBoolean();
		this.setPl(pl);
	}

	@Override
	public String toString(){
		return "Matrícula: " + super.getCm()
				+ "\nCertificado de Aeronavigabilidade: " + super.isCa();
	}

	public boolean getPl() {
		return pl;
	}

	public void setPl(boolean pl) {
		this.pl = pl;
	}

}
