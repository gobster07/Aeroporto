package Documetacao;

import Voos.Voo;

import java.util.Scanner;

public class DocumentoCargo extends Documentos {


    private boolean mc;

    private boolean awb;

    private boolean notoc;

    private boolean sd;

    private boolean nf;

    @Override //polimorfismo (sobrescreve o método abstrato de Documentos)
    public void cadastraDocumento(Scanner in) {
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
