package Documetacao;
import java.util.Scanner;
public class DocumentoDomestico extends Documentos {

	private String cm;

	private boolean ca;

	private boolean car;

	private boolean db;


	private boolean lea;

	private boolean reta;

	private boolean eo;

	public DocumentoDomestico(){
		super();
	}

	public void cadastraDocumento(Scanner in) { //polimorfismo (sobrescreve o método abstrato de Documentos)
		System.out.println("Digite a Matricula da Aeronave");
		String cm = in.nextLine();
		super.setCm(cm);

		System.out.println("Responda as proximas perguntas com true ou false");

		System.out.println("A aeronave apresenta certificado de aeronavigabilidade?");
		boolean ca = in.nextBoolean();
		super.setCa(ca);

		System.out.println("A aeronave apresenta diário de bordo?");
		boolean db = in.nextBoolean();
		super.setDb(db);

		System.out.println("A aeronave apresenta Certificado de Ruído?");
		boolean car = in.nextBoolean();
		super.setCar(car);

		System.out.println("A aeronave apresenta Licença de Estação?");
		boolean lea = in.nextBoolean();
		super.setLea(lea);

		System.out.println("A aeronave apresenta Seguros Obrigatórios Regularizados?");
		boolean reta = in.nextBoolean();
		super.setReta(reta);

		System.out.println("A aeronave apresenta Especificações Operacionais");
		boolean eo = in.nextBoolean();
		super.setEo(eo);
	}
}
