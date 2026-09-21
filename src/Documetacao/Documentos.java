package Documetacao;

import Voos.Voo;

import java.util.Scanner;

public abstract class Documentos {

	private String cm;

	private boolean ca;

	private boolean car;

	private boolean db;

	private boolean lea;

	private boolean reta;

	private boolean eo;

	public Documentos(){
		this.cm = "";
		this.ca = false;
		this.car = false;
		this.db = false;
		this.lea = false;
		this.reta = false;
		this.eo = false;
	}

	public String getCm() {
		return cm;
	}

	public void setCm(String cm) {
		this.cm = cm;
	}

	public boolean getCa() {
		return ca;
	}

	public void setCa(boolean ca) {
		this.ca = ca;
	}

	public boolean getCar() {
		return car;
	}

	public void setCar(boolean car) {
		this.car = car;
	}

	public boolean getDb() {
		return db;
	}

	public void setDb(boolean db) {
		this.db = db;
	}

	public boolean getLea() {
		return lea;
	}

	public void setLea(boolean lea) {
		this.lea = lea;
	}

	public boolean getReta() {
		return reta;
	}

	public void setReta(boolean reta) {
		this.reta = reta;
	}

	public boolean getEo() {
		return eo;
	}

	public void setEo(boolean eo) {
		this.eo = eo;
	}

	public abstract void cadastraDocumento(Scanner in); //polimorfismo (método abstrato: cada subclasse fornece sua própria implementação)

}
