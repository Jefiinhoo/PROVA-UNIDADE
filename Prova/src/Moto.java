import java.util.Scanner;

public class Moto {
private static final int Marchamin = 0;
private static final int Marchamax = 4;
private static int Marcham = 0;
// Atributos
	
	String Marca;
	String Modelo;
	String Cor;
int Marcha;
	int Qmarcha;
	boolean Status;
	String On;
	Moto(){
		
	}
	Moto(int marchaMax){
		Marcha = marchaMax;
	}
		
	
	
	//metodos
	
		void inicializa (int Marchamin){
		Marcha = Marchamin;	
		}
				
	void incializa	(int Marchamax ){
		Marcha = Marchamax;
	}
		
		 
		
		void marchasobe() {
			if(Marcha >= Marchamin && Marcha < 3){
				Marcha++;
				System.out.println("Marcha atual: " + Marcha);
			} else {
				System.out.println("Marcha maxima alcançada.");
			}
					
				
				}
				
			double marchadesce(){
	
		if ( Marcha > 0){
			Marcha--;
			System.out.println("Marcha atual: " + Marcha);
		}else {
			System.out.println("Marcha minima alcançada: ");
			
		}
		return Marcha;
			}
	
 String Status() {
	 if(Marcha > 0){
		 Status = true;
		 On = "Ligada";
	 } else{
		 Status = false;
		 On = "Desligada";
		 
				
				 
	 }
 return On;
 }
 }
			
		

		
		
		
		
		



	
	
	
	
	

