package Documetacao;

import java.util.Scanner;

public abstract class Documentos {

	private String cm;

	private boolean ca;

	private boolean db;

	private boolean cva;

	private boolean radio;

	private boolean reta;

	public String getCm(){
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public abstract String toString();

	public abstract void cadastraDocumento(Scanner in);

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
