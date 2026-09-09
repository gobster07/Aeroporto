package Documentos;

import java.util.Scanner;

public abstract class Documentacao {
    private String cm;
    private Boolean ca;
    private Boolean car;
    private Boolean lea;
    private Boolean reta;
    private Boolean eo;

    public Documentacao(String cm, Boolean ca, Boolean car, Boolean lea, Boolean  reta, Boolean eo) {
        this.cm = cm;
        this.ca = ca;
        this.car = car;
        this.lea = lea;
        this.reta = reta;
        this.eo = eo;
    }

    public Documentacao(){
        this.cm = "";
        this.ca = false;
        this.car = false;
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

    public Boolean getCa() {
        return ca;
    }

    public void setCa(Boolean ca) {
        this.ca = ca;
    }

    public Boolean getCar() {
        return car;
    }

    public void setCar(Boolean car) {
        this.car = car;
    }

    public Boolean getLea() {
        return lea;
    }

    public void setLea(Boolean lea) {
        this.lea = lea;
    }

    public Boolean getReta() {
        return reta;
    }

    public abstract void setReta(Boolean reta);

    public Boolean getEo(){
        return eo;
    }

    public abstract void setEo(Boolean eo);

    public abstract boolean verifyCa();

}
