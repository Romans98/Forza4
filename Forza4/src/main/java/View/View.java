/**
 * 
 */
package View;

import Model.Model;

/**
 * <b>Responsabilità :</b> Implementa una vista del gioco forza4
 * 
 * @author Matteo
 *
 */
public class View implements ViewInterface {

	/**
	 * Costruttore della view
	 */
	public View() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void showBoard(Model m) {
		// TODO Auto-generated method stub
		System.out.print(m);

	}

	@Override
	public void notifyBoardFull() {
		System.out.println("--------> The board is full !!");
	}

	@Override
	public void askWhoPlay() {
		System.out.println("inserisci nome giocatore");
	}

	@Override
	public void notifyWin(String s, String player) {
		System.out.println("Il giocatore " + player + " ha vinto " + s + " !!");
	}

	@Override
	public void notifyColumnFull() {
		System.out.println("La colonna e' piena !");
	}

	@Override
	public void playerTurn(String s) {
		System.out.println("Turno del giocatore : " + s);
	}

	@Override
	public void botColumnChoose(int c) {
		System.out.println("Il bot ha scelto la colonna : " + c);
	}

	@Override
	public void askColumn() {
		System.out.println("Scegli la colonna dove far cadere il disco ");
	}

	/**
	 * Menu del gioco
	 */
	public static void menu() {
		System.out.println("********** MENU **********");
		System.out.println("1 - Forza4 ");
		System.out.println("2 - Per un altro gioco");
		System.out.println("3 - Esci ");
		System.out.println("Scegliere un numero per l'opzione desiderata : ");
	}

	@Override
	public void columnInputError() {

		System.out.println("Input error : inserisci un numero intero compreso tra 0 e 6 ");
	}

}
