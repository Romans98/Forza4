/**
 * 
 */
package Forza4Main;

import java.io.IOException;


import Game.Menu;

/**
 * <b>Responsabilità:</b> Console che avvia il sistema.
 *  @author Mattia
 *  
 */
public class consoleGame {

	/**
	 * Metodo per avviare il sistema
	 * @param args
	 * @throws IOException 
	 *  
	 */
	public static void main(String[] args) throws IOException{
			
		Menu.menu();
		
		
		//figura arbitro come intermezzo ?
		//creare eccezioni di gioco nel menu e usare anche i logger
		//il setup va fatto sul gameconfigurator ?
		// rivedere il player registry
        // risolvere il problema della scelta della colonna che se scelgo la colonna 1 fa la 2

	}

}
