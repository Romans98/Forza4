/**
 * 
 */
package Forza4Main;

import java.io.IOException;

import Controller.Controller;
import Controller.gestioneIO;
import Game.Game;
import Game.GameBuilder;
import Game.GameConfiguration;
import Game.GameInterface;
import Game.Menu;
import Model.Board;
import Model.Disco;
import Model.Model;
import Player.Player;
import Player.playerFactory;
import Player.playerRegistry;
import View.View;
import View.ViewInterface;

/**
 * @author matti
 *
 */
public class consoleGame {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Menu.menu();
		/*Model board = new Board();
		Disco disco= new Disco();
		Disco discostu= new Disco();
		ViewInterface view = new View();
		gestioneIO io = new gestioneIO(view);
		Controller controller = new Controller(io);       
        GameInterface game = new Game(view);
        String player1=io.askWhoPlay();
        String player2=io.askWhoPlay();
        playerFactory playerFactory1 = playerRegistry.getInstance().getPlayerFactoryFromString(player1);
		playerFactory playerFactory2 = playerRegistry.getInstance().getPlayerFactoryFromString(player2);
		Player playeruno =playerFactory1.createPlayer(player1, disco);
		Player playerdue =playerFactory2.createPlayer(player2, discostu);
        game.start(playeruno , playerdue , board , controller , view , io);*/
		
        

	}

}
