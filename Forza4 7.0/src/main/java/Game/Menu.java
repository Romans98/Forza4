/**
 * 
 */
package Game;

import View.View;
import com.sun.tools.javac.file.SymbolArchive;
import sun.jvm.hotspot.memory.SystemDictionary;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author matti
 *
 */
public class Menu {
	
	public static void menu() throws IOException {
		//some stuff

		View.menu();

		Scanner scanner = new Scanner(System.in);
		int scelta = 0;

		do{
			try {
				String input = scanner.nextLine();
				scelta = Integer.parseInt(input);
			}
			catch(Exception e) {
				System.err.println("Inserisci un numero...");
				System.out.print("--> ");
			}
		} while(scelta < 1 || scelta > 3);

		switch(scelta) {
			case 1:
				GameConfiguration forza4Configuration = new GameConfiguration();
				forza4Configuration.callForza4Builder();
				break;
			case 2:
				System.out.println("Working progres ...");
				break;
			case 3:
				break;
		}
	}
}
