
package Controller;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import Player.Player;
import Player.botPlayer;
import View.ViewInterface;


/**
 * <b>Reponsabilità:</b> Gestire gli input ricevuti dall'esterno.
 * 
 * @author Matteo
 *
 */
public class gestioneInput {
	
	/**
	 * Input scanner
	 */
	Scanner scan = new Scanner(System.in);
	/**
	 * Funzione random per il bot player
	 */
	Random random= new Random();
	/**
	 * Istanza della classe view per cooperare con essa
	 */
	private ViewInterface view;
	/**
	 * Costruttore di un gestore input
	 * @param view2
	 */
	public gestioneInput(ViewInterface view2) {
		// TODO Auto-generated constructor stub
		this.view=view2;
	}
	/**
	 * Metodo per chiedere e restituire la colonna desiderata per l'inserimento
	 * @param Player
	 * @return il numero della colonna desiderata
	 * @throws IOException
	 */
	public int askColumn(Player uno) throws IOException {
		view.playerTurn(uno.getId());
		if(uno instanceof botPlayer) {
			int colonna=random.nextInt(7);
			view.botColumnChoose(colonna);
			return colonna;
		}
		int column=10;		
		do {
			try {
			view.askColumn();
			String input = scan.nextLine();
			column = Integer.parseInt(input);

			}catch(NumberFormatException e) {
				view.columnInputError();
			}
		}
		while(column<0 || column >6 ) ;					
		return column;
		
	}
	/**
	 * Metodo che sfrutta la view per chiedere chi gioca
	 */
	public String askWhoPlay() throws IOException {
		
		view.askWhoPlay();
		return scan.next();
	}
	/**
	 * Metodo che sfrutta la view per notificare che la matrice è piena
	 */
	public void notifyBoardFull() {
		view.notifyBoardFull();
		
	}
	/**
	 * Metodo che prende in input l'id del player e la combinazione con cui ha vinto e le passa alla view
	 * @param player ID 
	 * @param combinazione vincente
	 */
	public void notifyWin(String s, String player) {
		view.notifyWin(s, player);
		
	}
	/**
	 * Metodo che sfrutta la view per notificare che la colonna è piena
	 */
	public void notifyColumnFull() {
		// TODO Auto-generated method stub
		view.notifyColumnFull();
		
	}
	

}
