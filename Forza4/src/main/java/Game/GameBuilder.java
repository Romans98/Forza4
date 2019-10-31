/**
 * 
 */
package Game;

import java.io.IOException;
import Controller.Controller;
import Controller.gestioneInput;
import Model.Board;
import Model.Disco;
import Player.Player;
import Player.playerFactory;
import Player.playerRegistry;
import View.View;
import View.ViewInterface;

/**
 * <b>Responsabilità :</b> Costruisce un gioco qualsiasi  
 * 
 * @author Matteo
 *
 */
public class GameBuilder {
	/**
	 * Costruttore del gioco Forza4
	 * @param Player 1
	 * @param Player 2
	 * @param disco 1
	 * @param disco 2
	 * @param controller
	 * @param view
	 * @param board
	 * @param io
	 * @param game
	 * @throws IOException
	 */
	public void builderForza4(Player p1, Player p2, Disco disco, Disco discostu, Controller controller, ViewInterface view, Board board, gestioneInput io, GameInterface game) throws IOException {
		board = new Board(7,6);
		disco=new Disco();
		discostu= new Disco();
		view= new View();
		io=new gestioneInput(view);
		controller=new Controller(io);
		game= new Game(view);
		String player1=io.askWhoPlay();
        String player2=io.askWhoPlay();
        playerFactory playerFactory1 = playerRegistry.getInstance().getPlayerFactoryFromString(player1);
		playerFactory playerFactory2 = playerRegistry.getInstance().getPlayerFactoryFromString(player2);
		Player playeruno =playerFactory1.createPlayer(player1, disco);
		Player playerdue =playerFactory2.createPlayer(player2, discostu);
		game.start(playeruno, playerdue, board, controller, view, io);
		
	}

}
