import Documetacao.DocumentoDomestico;
import Documetacao.Documentos;
import java.util.Scanner;
public class Test {
    public static void main(String[] args){
        Documentos doc = new DocumentoDomestico();
        Scanner in = new Scanner(System.in);
        doc.cadastraDocumento(in);
        System.out.println(doc.toString());
    }
}
