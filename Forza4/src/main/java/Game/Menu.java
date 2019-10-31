/**
 * 
 */
package Game;

import java.io.IOException;
import java.util.Scanner;
import View.View;

/**
 * <b>Responsabilità:</b> Definire un menu per la scelta. 
 * 
 * @author Mattia
 *
 */
public class Menu {
	/**
	 * Crea un menu con le relative sequenze alternative
	 * @throws IOException
	 */
	public static void menu() throws IOException {
		
		int scelta = 0;
		boolean valid=false;
		Scanner scanner= new Scanner(System.in);
		View.menu();
		while(!valid) {
			
			do {	
				try {
			    String input = scanner.nextLine();
				scelta = Integer.parseInt(input);
				
				} catch(NumberFormatException e) {
					
					System.err.println("error");
				
				}
		
		}
		while(scelta<1 || scelta>3);
		valid=true;
	
		}
		switch(scelta) {
		
		case 1:
			GameConfiguration forza4Configuration = new GameConfiguration();
		    forza4Configuration.callForza4Builder();
		    break;
		    
		case 2 :
			
			System.out.println("working progress...");
			
		case 3 :
			
			break;
			
			
		}
		scanner.close();
		
	}

}
