/**
 * 
 */
package Game;

import java.io.IOException;
import java.util.ArrayList;

import Controller.Controller;
import Controller.gestioneIO;
import Model.Board;
import Model.Disco;
import Player.Player;
import Player.playerFactory;
import Player.playerRegistry;
import View.View;
import View.ViewInterface;

/**
 * @author matti
 *
 */
public class GameBuilder {
	
	public void builderForza4(Player p1, Player p2, Disco disco, Disco discostu,
							  Controller controller, ViewInterface view, Board board,
							  gestioneIO io, GameInterface game) throws IOException {
		board = new Board(7,6);
		disco =new Disco();
		discostu = new Disco();
		view = new View();
		io = new gestioneIO(view);
		controller = new Controller(io);
		game = new Game(view);

		view.forza4();

		String player1 = io.askWhoPlay();
        String player2 = io.askWhoPlay();

        playerFactory playerFactory1 = playerRegistry.getInstance().getPlayerFactoryFromString(player1);
		playerFactory playerFactory2 = playerRegistry.getInstance().getPlayerFactoryFromString(player2);

		Player playeruno = playerFactory1.createPlayer(player1, disco);
		Player playerdue = playerFactory2.createPlayer(player2, discostu);

		game.start(playeruno, playerdue, board, controller, view, io);
		
	}

}
