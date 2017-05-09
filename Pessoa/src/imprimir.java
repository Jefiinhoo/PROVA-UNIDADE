import java.util.Scanner;

public class imprimir {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pessoa p = new Pessoa();//Objeto "p" criado
                
        p.construtor();
                p.imprimir();
        }       
}