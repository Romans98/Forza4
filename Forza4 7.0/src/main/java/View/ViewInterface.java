/**
 * 
 */
package View;

import java.io.IOException;

import Model.Model;

/**
 * @author matti
 *
 */
public interface ViewInterface {

	void showBoard(Model model);
	void notifyBoardFull();
	void askWhoPlay();
	void notifyWin(String s);
	void notifyColumnFull();
	void playerTurn(String s);
	void botColumnChoose(int c);
	void askColumn();
	void forza4();

}
