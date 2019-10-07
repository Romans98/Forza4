/**
 * 
 */
package Game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import Controller.Controller;
import Controller.gestioneIO;
import Model.Board;
import Model.Disco;
import Player.Player;
import View.ViewInterface;

/**
 * @author matti
 *
 */
public class GameConfiguration {
	
	private Player p1;
	private Player p2;
	private Disco disco;
	private Disco discostu;
	private Controller controller;
	private ViewInterface view;
	private Board board;
	private gestioneIO io;
	private GameInterface game;
	GameBuilder builder= new GameBuilder();
	
	public void callForza4Builder() throws IOException {
		builder.builderForza4(p1, p2, disco, discostu, controller, view, board, io, game);
	}
	

	
	
	
	
	

}
