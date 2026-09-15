package Documetacao;

import java.util.Scanner;

public class DocumentoInternacional extends Documentos {
    private String cm;

    private boolean ca;

    private boolean car;

    private boolean db;


    private boolean lea;

    private boolean reta;

    private boolean eo;

    private boolean fp;

    public DocumentoInternacional(){
        this.cm = "";
        this.ca = false;
        this.db = false;
        this.car = false;
        this.lea = false;
        this.reta = false;
        this.eo = false;
    }

    @Override
    public void cadastraDocumento(Scanner in) {
        System.out.println("Digite a Matricula da Aeronave");
        String cm = in.nextLine();
        this.setCm(cm);

        System.out.println("Responda as proximas perguntas com true ou false");

        System.out.println("Todos os tripulantes possume passaporte válido?");
        boolean fp = in.nextBoolean();
        this.setFp(fp);

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
    }


    public boolean getFp() {
        return fp;
    }

    public void setFp(boolean fp) {
        this.fp = fp;
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


}
