/**
 * 
 */
package Model;

import Player.Player;

/**
 * @author matti
 *
 */
public interface Model {

	boolean insertDisc(int c, Player player);

	String checkWinner(Player pippo);
	void reset();

	boolean checkColumnFull(int c);
	boolean boardIsFull();

}
