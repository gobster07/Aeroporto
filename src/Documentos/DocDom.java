package Documentos;
import java.util.Scanner;

public class DocDom extends Documentacao {

    public DocDom() {
		super();
	}

    public DocDom(String cm, boolean ca, boolean car, boolean lea, boolean  reta, boolean eo, boolean db) {
        super(cm, ca, car, lea, reta, eo, db);
    }

    @Override
    public void cadastraDocument(Scanner in) {
        System.out.println("Digite a Matricula da Aeronave: ");
        String cm =  in.nextLine();
        super.setCm(cm);

        System.out.println("===Responda as proximas verificações com true ou false=== ");

        System.out.println("A aeronave apresenta Certificado de Aeronavigabilidade(CA)?");
        boolean ca = in.nextBoolean();
        super.setCa(ca);

        System.out.println("A aeronave apresenta Certificado de Ruído?");
        boolean car = in.nextBoolean();
        super.setCar(car);

        System.out.println("A aeronave apresenta Licença de Estação?");
        boolean lea = in.nextBoolean();
        super.setLea(lea);

        System.out.println("A aeronave apresenta os Seguros Obrigatótios(RETA)?");
        boolean reta = in.nextBoolean();
        super.setReta(reta);

        System.out.println("As Especificações Operacionais estão anexas e completas?");
        boolean eo = in.nextBoolean();
        this.setEo(eo);

        System.out.println("A aeronave emtiu Diario de Bordo?");
        boolean db = in.nextBoolean();
        super.setDb(db);
    }



    public boolean getEo() {
        return super.getEo();
    }

    @Override
    public boolean verifyCa(){
        if(this.getCa()){
            return true;
        } else{
            return false;
        }
    }
}



