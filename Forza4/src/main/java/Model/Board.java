/**
 * 
 */
package Model;

import Player.Player;

/**
 * <b>Responsabilit�:</b> Costruire ed elaborare i dati un campo da gioco 
 * 
 * @author Matteo
 *
 */
public class Board implements Model {

	/**
	 * Righe di un campo di forza4
	 */
	public static final int RIGHE = 6;
	/**
	 * Colonne di un campo di forza4
	 */
	public static final int COLONNE = 7;
	/**
	 * La matrice del gioco
	 */
	private Pedina[][] board;


	/**
	 * Metodo per accedere all'oggetto board
	 * @return la matrice del campo da gioco
	 */
	public Pedina[][] getBoard() {
		return board;
	}

	/**
	 * Costruttore di un campo da gioco per forza 4
	 * @param colonne
	 * @param righe
	 */
	public Board(int colonne, int righe) {
		this.board = new Pedina[colonne][righe];
	}

	@Override
	public void reset() {
		for (int col = 0; col < RIGHE; col++)
			for (int row = 0; row < COLONNE; row++)

				board[row][col] = null;
	}

	@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < RIGHE; i++) {
			for (int j = 0; j < COLONNE; j++) {

				if (board[j][i] == null)
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
			if (this.board[c][i] != null) {// se � diverso da null entra nell'if senno continua il for
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

	/**
	 * Metodo per il controllo della vittoria tramite una combinazione diagonale bassa destra
	 * @param player
	 * @return true or false
	 */
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
	/**
	 * Metodo per il controllo della vittoria tramite una combinazione diagonale bassa sinistra
	 * @param player
	 * @return true or false
	 */
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

	/**
	 * Metodo per il controllo della vittoria tramite una combinazione verticale
	 * @param player
	 * @return true or false
	 */
	private boolean checkVertical(Player pippo) {
		int col;
		int row;

		for (col = 0; col < COLONNE; col++) {
			for (row = 5; row >= RIGHE - 3; row--) {
				if (board[col][row] == pippo.getDisco() && board[col][row - 1] == pippo.getDisco()
						&& board[col][row - 2] == pippo.getDisco() && board[col][row - 3] == pippo.getDisco()) {
					return true;

				}
			}
			row = 5;
		}

		return false;
	}

	/**
	 * Metodo per il controllo della vittoria tramite una combinazione orizzontale
	 * @param player
	 * @return true or false
	 */
	private boolean checkHorizontal(Player pippo) {
		int col;
		int row;

		for (row = 5; row >= 0; row--) {
			for (col = 0; col < COLONNE - 3; col++) {

				if (board[col][row] == pippo.getDisco() && board[col + 1][row] == pippo.getDisco()
						&& board[col + 2][row] == pippo.getDisco() && board[col + 3][row] == pippo.getDisco()) {
					return true;

				}

			}
			col = 0;

		}

		return false;
	}

	@Override
	public boolean checkColumnFull(int column) {
		if (board[column][0] != null)
			return true;
		return false;
	}

	@Override
	public boolean boardIsFull() {
		for (int col = 0; col < COLONNE; col++) {
			if (checkColumnFull(col) == false)
				return false;
		}
		return true;
	}
	/**
	 * Metodo per l'inserimento di un disco nella riga e colonna desiderata ( per il test )
	 * @param colonna
	 * @param righa
	 * @param player
	 */
	public void setDisco(int c, int r , Player pippo) {
		this.board[c][r]= pippo.getDisco();
	}
}