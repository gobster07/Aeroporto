package Documetacao;

import Voos.Voo;

import java.util.Scanner;

public class DocumentoCargo extends Documentos {

    private String cm;

    private boolean ca;

    private boolean car;

    private boolean db;

    private boolean lea;


    private boolean reta;

    private boolean eo;

    private boolean mc;

    private boolean awb;

    private boolean notoc;

    private boolean sd;

    private boolean nf;

    @Override
    public void cadastraDocumento(Scanner in) {
        System.out.println("Digite a Matricula da Aeronave");
        String cm = in.nextLine();
        this.setCm(cm);

        System.out.println("Responda as proximas perguntas com true ou false");

        System.out.println("A aeronave apresenta certificado de aeronavigabilidade?");
        boolean ca = in.nextBoolean();
        this.setCa(ca);

        System.out.println("A aeronave apresenta diário de bordo?");
        boolean db = in.nextBoolean();
        this.setDb(db);

        System.out.println("A aeronave apresenta Certificado de Ruído?");
        boolean car = in.nextBoolean();
        this.setCar(car);

        System.out.println("A aeronave apresenta Licença de Estação?");
        boolean lea = in.nextBoolean();
        this.setLea(lea);

        System.out.println("A aeronave apresenta Seguros Obrigatórios Regularizados?");
        boolean reta = in.nextBoolean();
        this.setReta(reta);

        System.out.println("A aeronave apresenta Especificações Operacionais");
        boolean eo = in.nextBoolean();
        this.setEo(eo);

        System.out.println("O manifesto de carga doi emitido?");
        boolean mc =  in.nextBoolean();
        this.setMc(mc);

        System.out.println("o documento de Conhecimento de Transporte áereo foi emitido");
        boolean awb = in.nextBoolean();
        this.setAwb(awb);

        System.out.println("O documento de Notificação ao Capitão foi emitido?");
        boolean notoc = in.nextBoolean();
        this.setNotoc(notoc);

        System.out.println("A Declaração do Expedidor foi Emitida");
        boolean sd = in.nextBoolean();
        this.setSd(sd);

        System.out.println("As Notas Fiscaís foram emitidas?");
        boolean nf = in.nextBoolean();
        this.setNf(nf);
    }

    @Override
    public String getCm() {
        return cm;
    }

    @Override
    public void setCm(String cm) {
        this.cm = cm;
    }

    @Override
    public boolean getCa() {
        return ca;
    }

    @Override
    public void setCa(boolean ca) {
        this.ca = ca;
    }

    @Override
    public boolean getCar() {
        return car;
    }

    @Override
    public void setCar(boolean car) {
        this.car = car;
    }

    @Override
    public boolean getDb() {
        return db;
    }

    @Override
    public void setDb(boolean db) {
        this.db = db;
    }

    @Override
    public boolean getLea() {
        return lea;
    }

    @Override
    public void setLea(boolean lea) {
        this.lea = lea;
    }

    @Override
    public boolean getReta() {
        return reta;
    }

    @Override
    public void setReta(boolean reta) {
        this.reta = reta;
    }

    @Override
    public boolean getEo(){return this.eo;}

    @Override
    public void setEo(boolean eo){
        this.eo = eo;
    }

    public boolean getNf() {
        return nf;
    }

    public void setNf(boolean nf) {
        this.nf = nf;
    }

    public boolean getSd() {
        return sd;
    }

    public void setSd(boolean sd) {
        this.sd = sd;
    }

    public boolean getNotoc() {
        return notoc;
    }

    public void setNotoc(boolean notoc) {
        this.notoc = notoc;
    }

    public boolean getAwb() {
        return awb;
    }

    public void setAwb(boolean awb) {
        this.awb = awb;
    }

    public boolean getMc() {
        return mc;
    }

    public void setMc(boolean mc) {
        this.mc = mc;
    }
}







