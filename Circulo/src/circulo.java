import java.util.Scanner;
public class circulo {
	
	public class Circulo {
	    
	    Scanner entrada = new Scanner(System.in);
	    double raio, area, perimetro;
	    
	    
	    double calcularArea (){
	        
	        area = 3.141516*raio*raio;
	        
	        return area;
	    }
	     double calcularPerimetro (){
	        
	        perimetro = 2*3.141516*raio;
	        
	        return perimetro;
	    }
	     
	    void imprimir(){
	        
	        System.out.println("O c�rculo de raio: "
	                +raio+"\n�rea: "+calcularArea()
	                +"\nPerimetro: "+calcularPerimetro());
	    }
	    
	    void construtor(){
	        
	        System.out.println("Informe do valor do raio do       c�rculo");
	        raio = entrada.nextDouble();
	       
	    }
	    
	}

	public void construtor() {
		// TODO Auto-generated method stub
		
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		
	}
}
