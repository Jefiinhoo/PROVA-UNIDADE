import java.util.Scanner;
public class retangulo {
	
	public class Retangulo {
	    
	    Scanner entrada = new Scanner(System.in);
	    double comprimento,largura, area, perimetro;
	    
	    
	    double calcularArea (){
	        
	        area = comprimento*largura;
	        
	        return area;
	    }
	     double calcularPerimetro (){
	        
	        perimetro = (2*comprimento)+(2*largura);
	        
	        return perimetro;
	    }
	     
	    void imprimir(){
	        
	        System.out.println("O retangulo de largura: "
	                +largura+"\nComprimento: "+comprimento+"\n¡rea: "+calcularArea()
	                +"\nPerimetro: "+calcularPerimetro());
	    }
	    
	    void construtor(){
	        
	     System.out.println("Informe do valor do comprimento do ret‚ngulo");
	        comprimento = entrada.nextDouble();
	   System.out.println("Informe do valor da largura do ret‚ngulo");
	        largura = entrada.nextDouble();
	    }
	    
	}

	public void imprimir() {
		// TODO Auto-generated method stub
		
	}

	public void construtor() {
		// TODO Auto-generated method stub
		
	}

}
