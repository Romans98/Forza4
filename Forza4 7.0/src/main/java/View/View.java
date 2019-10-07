/**
 * 
 */
package View;

import javax.swing.*; 
import javax.swing.border.*; 
import java.awt.*;
import java.io.IOException;

import Controller.Controller;
import Controller.gestioneIO;
import Model.Board;
import Model.Model;

/**
 * @author matti
 *
 */
public class View implements ViewInterface  {

	public View() {
		// TODO Auto-generated constructor stub
	}

	public void showBoard(Model m) {
		// TODO Auto-generated method stub
		System.out.print(m);
		
	}
	public void notifyBoardFull() {

		System.out.println("--------> The board is full !!");
		 }
	public void askWhoPlay() {

		System.out.println("inserisci nome giocatore");
		 }
	public void notifyWin(String s) {

		System.out.println("--------> Win " + s + " !!");
		 }
	public void notifyColumnFull() {

		System.out.println("La colonna e' piena !");
		 }
	public void playerTurn(String s) {

		System.out.println("Turno del giocatore : " + s);
	}
	public void botColumnChoose(int c) {

		System.out.println("Il bot ha scelto la colonna : " + c);
	}
	public void askColumn(){

		System.out.println("Scegli la colonna dove far cadere il disco " );
	}
	public void forza4() {
		System.out.println("\n********** FORZA 4 **********\n");
	}
	


	public static void menu() {
		System.out.println("********** MENU **********\n\n");
		System.out.println("1 - FORZA 4");
		System.out.println("2 - ALTRO GIOCO");
		System.out.println("3 - ESCI\n");
		System.out.print("Digita un'opzione ");
	}


	}
