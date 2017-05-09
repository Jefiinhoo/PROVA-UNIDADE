import java.util.Scanner;
public class Quadrado {
    
    Scanner entrada = new Scanner(System.in);
    double lado, area, perimetro;
    
    
    double calcularArea (){
        
        area = lado*lado;
        
        return area;
    }
     double calcularPerimetro (){
        
        perimetro = 4*lado;
        
        return perimetro;
    }
     
    void imprimir(){
        
        System.out.println("O quadrado de lado: "
                +lado+"\n Área: "+calcularArea()
                +"\nPerimetro: "+calcularPerimetro());
    }
    
    void construtor(){
   System.out.println("Informe do valor do lado do quadrado");
        lado = entrada.nextDouble();
    }
    
}