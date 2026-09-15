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
        super.setCm(cm);

        System.out.println("Responda as proximas perguntas com true ou false");

        System.out.println("Todos os tripulantes possume passaporte válido?");
        boolean fp = in.nextBoolean();
        this.setFp(fp);

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


    public boolean getFp() {
        return fp;
    }

    public void setFp(boolean fp) {
        this.fp = fp;
    }


}
