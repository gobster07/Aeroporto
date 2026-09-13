package Documentos;

import java.util.Scanner;

public abstract class Documentacao {
    private String cm;
    private boolean ca;
    private boolean car;
    private boolean lea;
    private boolean reta;
    private boolean eo;
    private boolean db;

    public Documentacao(String cm, boolean ca, boolean car, boolean lea, boolean  reta, boolean eo, boolean db) {
        this.cm = cm;
        this.ca = ca;
        this.car = car;
        this.lea = lea;
        this.reta = reta;
        this.eo = eo;
        this.db = db;
    }

    public Documentacao(){
        this.cm = "";
        this.ca = false;
        this.car = false;
        this.lea = false;
        this.reta = false;
        this.eo = false;
        this.db = false;
    }

    public boolean getDb() {
        return db;
    }

    public void setDb(boolean db) {
        this.db = db;
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

    public abstract boolean verifyCa();

    public abstract void cadastraDocument(Scanner in);

}
