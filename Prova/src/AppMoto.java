import java.util.Scanner;

public class AppMoto {

	public static void main(String[] args) {
	
			Moto Mo = new Moto(1);
				// int capElevador, int totalAndares
	 		
			Mo.Marca="Honda";	
			Mo.Cor= "Preto";
			Mo.Modelo= "H2000";
			System.out.println("Marca: " + Mo.Marca);
			System.out.println("Cor: " + Mo.Cor);
			System.out.println("Modelo: " + Mo.Modelo);
			
			System.out.println("-------------");
			
			System.out.println("Status: " + Mo.Status());
			Mo.marchasobe();
			Mo.marchasobe();
			Mo.marchasobe();
			
			System.out.println("--------------");
			
			Mo.marchadesce();	
			Mo.marchadesce();
			Mo.marchadesce();
			Mo.marchadesce();
			System.out.println("Status: " + Mo.Status());
			
			
		
				
					
					
					
					
						
			}

		

				
				
					
		}

	
	
		
	

	

