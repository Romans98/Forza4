/**
 * 
 */
package Model;

import Player.Player;

/**
 * @author matti
 *
 */
public class Board implements Model {

	public static final int RIGHE = 6;
	public static final int COLONNE = 7;
	private Pedina[][] board;

	public Board(int colonne , int righe) {
		this.board = new Pedina[colonne][righe];
	}

	public void reset() {
		for (int col = 0; col < RIGHE; col++)
			for (int row = 0; row < COLONNE; row++)
				// board[row][col] = Cella.___E___;
				board[row][col] = null;
	}

	public String toString() {
		  String s = "";

		  for (int i = 0; i < RIGHE; i++) {
		   for (int j = 0; j < COLONNE; j++) {

		    if(board[j][i] == null)
		     s += String.format("|%3s", "-" + " ");
		    else
		     s += String.format("|%3s", board[j][i] + " ");
		   }
		   s += "|\n";
		  }
		  s += "\n";

		  return s;
		 }

	@Override
	public boolean insertDisc(int c, Player pippo) {
		int i = 0;

		for (i = 0; i < RIGHE; i++) {
			if (this.board[c][i] != null) {// se ? diverso da null entra nell'if senno continua il for
				i--;

				this.board[c][i] = pippo.getDisco();
				return true;

			}

		}

		i--;

		this.board[c][i] = pippo.getDisco();

		return true;

	}

	@Override
	public String checkWinner(Player pippo) {


	     if (checkVertical(pippo) == true) {
	   return "with a vertical combination";
	  }

	  if (checkHorizontal(pippo) == true) {
	   return "with an horizontal combination";
	  }
	 
	   if (checkDiagonalLowerLeft(pippo) == true) { 
	      return "with a diagonalLeft combination";
	   } 
	   if (checkDiagonalLowerRight(pippo) == true) { 
	   return "with a diagonalRight combination";
	   }
	   
	  return null;
	}

	private boolean checkDiagonalLowerRight(Player pippo) {
		int col;
		int row = 5;

		for (col = 0; col < 4; col++) {

			if (board[col][row] == pippo.getDisco() && board[col + 1][row - 1] == pippo.getDisco()
					&& board[col + 2][row - 2] == pippo.getDisco() && board[col + 3][row - 3] == pippo.getDisco())
				return true;

			if (board[col][row - 1] == pippo.getDisco() && board[col + 1][row - 2] == pippo.getDisco()
					&& board[col + 2][row - 3] == pippo.getDisco() && board[col + 3][row - 4] == pippo.getDisco())
				return true;

			if (board[col][row - 2] == pippo.getDisco() && board[col + 1][row - 3] == pippo.getDisco()
					&& board[col + 2][row - 4] == pippo.getDisco() && board[col + 3][row - 5] == pippo.getDisco())
				return true;

		}
		return false;

	}

	private boolean checkDiagonalLowerLeft(Player pippo) {
		int col;
		int row = 5;

		for (col = 6; col > 2; col--) {

			if (board[col][row] == pippo.getDisco() && board[col - 1][row - 1] == pippo.getDisco()
					&& board[col - 2][row - 2] == pippo.getDisco() && board[col - 3][row - 3] == pippo.getDisco())
				return true;

			if (board[col][row - 1] == pippo.getDisco() && board[col - 1][row - 2] == pippo.getDisco()
					&& board[col - 2][row - 3] == pippo.getDisco() && board[col - 3][row - 4] == pippo.getDisco())
				return true;

			if (board[col][row - 2] == pippo.getDisco() && board[col - 1][row - 3] == pippo.getDisco()
					&& board[col - 2][row - 4] == pippo.getDisco() && board[col - 3][row - 5] == pippo.getDisco())
				return true;

		}
		return false;
	}

	private boolean checkVertical(Player pippo) {
		int col;
		int row;

		for (col = 0; col < COLONNE; col++) {
			for (row = 5; row >= RIGHE - 3; row--) {

				/*
				 * controlla solo le celle del player corrente per non fare due un controllo
				 * inutile
				 */

				if (board[col][row] == pippo.getDisco() && board[col][row - 1] == pippo.getDisco()
						&& board[col][row - 2] == pippo.getDisco() && board[col][row - 3] == pippo.getDisco()) {
					return true;

				}

			}
			row = 5;

		}

		return false;
	}

	private boolean checkHorizontal(Player pippo) {
		int col;
		int row;

		for (row = 5; row >= 0; row--) {
			for (col = 0; col < COLONNE - 3; col++) {

				/*
				 * controlla solo le celle del player corrente per non fare due un controllo
				 * inutile
				 */

				if (board[col][row] == pippo.getDisco() && board[col + 1][row] == pippo.getDisco()
						&& board[col + 2][row] == pippo.getDisco() && board[col + 3][row] == pippo.getDisco()) {
					return true;

				}

				// col++;
			}
			col = 0;
			// row--;
		}

		return false;
	}

	@Override
	public boolean checkColumnFull(int column) {
		// for (int row = 0; row < COLONNE; row++)
		if (board[column][0] != null)
			return true;
		return false;
	}

	public boolean boardIsFull() {
		for (int col = 0; col < COLONNE; col++) {
			if (checkColumnFull(col) == false)
				return false;
		}
		return true;
	}
}