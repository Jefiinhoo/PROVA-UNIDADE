import java.util.Scanner;

public class Eletrodomestico {
	boolean ligado;
	boolean on;
	String a��o;
	
	
	Eletrodomestico(){
		
	}
	
	Scanner leitor = new Scanner (System.in);
	
	String ligado() {
	if (ligado == on){
		ligado = true;
		a��o = "Ligada"; 
    
	}else{
		ligado = false;
		a��o = "Desligada";
	}
	return a��o;
	
	}
	
  void imprimir(){
	  
	System.out.println("O estado �: " + a��o);  
	
  }
	void ler(){
		System.out.println("O que voc� que fazer: ");
		a��o = leitor.next();
	}

}






