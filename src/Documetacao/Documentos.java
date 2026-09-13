package Documetacao;

import java.util.Scanner;

public abstract class Documentos {

	private String cm;

	private boolean ca;

	private boolean car;

	private boolean db;


	private boolean lea;

	private boolean radio;

	private boolean reta;

	private boolean eo;

	public abstract String getCm();

	public abstract void setCm(String cm);

	public abstract boolean getCa();

	public abstract void setCa(boolean ca);

	public abstract boolean getCar();

	public abstract void setCar(boolean car);

	public abstract boolean getReta();

	public abstract void setReta(boolean reta);

	public abstract boolean getEo();

	public abstract void setEo(boolean eo);

	public abstract boolean getDb();

	public abstract void setDb(boolean db);

	public abstract boolean getLea();

	public abstract void setLea(boolean lea);

	public abstract void cadastraDocumento(Scanner in);

}
