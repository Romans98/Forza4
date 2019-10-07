/**
 * 
 */
package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

import Player.Player;
import Player.botPlayer;
import View.View;
import View.ViewInterface;


/**
 * @author matti
 *
 */
public class gestioneIO {
	
	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	Scanner scan = new Scanner(System.in);
	Random random= new Random();
	private ViewInterface view;
	public gestioneIO(ViewInterface view2) {
		// TODO Auto-generated constructor stub
		this.view=view2;
	}
	public int askColumn(Player uno) throws IOException {
		view.playerTurn(uno.getId());
		if(uno instanceof botPlayer) {
			int colonna=random.nextInt(7);
			view.botColumnChoose(colonna);
			return colonna;
		}
		int column=0;
		do {
			view.askColumn();
			column=scan.nextInt();
		}
		while(column<0 || column >6 ) ;
					
		return column;
		
	}
	public String askWhoPlay() throws IOException {
		
		view.askWhoPlay();
		return in.readLine();
	}
	public void notifyBoardFull() {
		view.notifyBoardFull();
		
	}
	public void notifyWin(String s) {
		view.notifyWin(s);
		
	}
	public void notifyColumnFull() {
		// TODO Auto-generated method stub
		view.notifyColumnFull();
		
	}
	

}
