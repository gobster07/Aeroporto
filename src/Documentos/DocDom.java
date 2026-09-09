package Documentos;
import java.util.Scanner;

public class DocDom extends Documentacao {

    public DocDom() {
		super();
	}

    public DocDom(String cm, Boolean ca, Boolean car, Boolean lea, Boolean  reta, Boolean eo) {
        super(cm, ca, car, lea, reta, eo);
    }

    @Override
    public void setReta(Boolean reta) {
        reta = reta;
    }

    @Override
    public void setEo(Boolean eo) {
        eo = eo;
    }

    @Override
    public void setCar(Boolean car) {
        car = car;
    }

    @Override
    public void setCm(String cm) {
        cm =cm;
    }

    @Override
    public void setCa(Boolean ca) {
        ca = ca;
    }

    public Boolean getEo() {
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



