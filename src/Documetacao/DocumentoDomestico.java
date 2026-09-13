package Documetacao;
import java.util.Scanner;
public class DocumentoDomestico extends Documentos {

	private String cm;

	private boolean ca;

	private boolean db;

	private boolean cva;

	private boolean radio;

	private boolean reta;

	public DocumentoDomestico(){
		this.cm = "";
		this.ca = false;
		this.db = false;
		this.cva = false;
		this.radio = false;
		this.reta = false;
	}

	public void cadastraDocumento(Scanner in) {
		System.out.println("Digite a Matricula da Aeronave");
		String cm = in.nextLine();
		this.setCm(cm);

		System.out.println("Responda as proximas perguntas com true ou false");

		System.out.println("A aeronave apresenta certificado de aeronavigabilidade?");
		boolean ca = in.nextBoolean();
		this.setCa(ca);

		System.out.println("A aeronave apresenta diário de bordo?");
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public boolean isCa() {
		return ca;
	}

	public void setCa(boolean ca) {
		this.ca = ca;
	}

	public boolean isDb() {
		return db;
	}

	public void setDb(boolean db) {
		this.db = db;
	}

	public boolean isCva() {
		return cva;
	}

	public void setCva(boolean cva) {
		this.cva = cva;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public boolean isReta() {
		return reta;
	}

	public void setReta(boolean reta) {
		this.reta = reta;
	}
}
