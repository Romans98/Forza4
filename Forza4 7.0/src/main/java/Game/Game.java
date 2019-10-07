/**
 * 
 */
package Game;

import java.io.IOException;

import Controller.Controller;
import Controller.gestioneIO;
import Model.Model;
import Player.Player;
import View.View;
import View.ViewInterface;

/**
 * @author matti
 *
 */
public class Game implements GameInterface {

	private int turn;

	public Game(ViewInterface view) {
		// TODO Auto-generated constructor stub
	}

	private int opponent() {
		return turn++;
	}

	private int current() {
		return turn;
	}

	@Override
	public Winner start(Player uno, Player due, Model model, Controller controller, ViewInterface view, gestioneIO io)
			throws IOException {

		model.reset();
		setup(uno, due);
		
		while (controller.boardIsFull(model) == false) {
			
            
			view.showBoard(model);

			controller.takeColumn(model, io.askColumn(currentPlayer(uno, due)), currentPlayer(uno, due));
			if(controller.checkWinner(model,(currentPlayer(uno, due))) == true) {
				view.showBoard(model);
            	return new Winner((currentPlayer(uno, due)).getId());
            }
			opponent();
			//todo: la view e un output quindi gestioneIO diventa gestione input quindi i vari print li fa la view
			//todo: other problem is quando giocano i bot vede la board full ma non e vero
			//todo: controlli condizione vittoria 
			//todo: questo metodo deve ritornare un winner , nel while solo la condizione boardfull poi if per la win

		}
		
		return new Winner("Tie");

	}

	private void setup(Player uno, Player due) {
		uno.getDisco().setForma("X");
		due.getDisco().setForma("O");
	}

	public Player currentPlayer(Player uno, Player due) {
		if (current() % 2 == 0) {
			return uno;
		} else
			return due;
	}

}
