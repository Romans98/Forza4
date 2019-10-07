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
public interface GameInterface {

	//public void start();

	Winner start(Player uno , Player due , Model model ,Controller controller , ViewInterface view , gestioneIO io) throws IOException;

}
