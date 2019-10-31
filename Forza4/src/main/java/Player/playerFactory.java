/**
 * 
 */
package Player;

import Model.Disco;

/**
 * <b>Responsabilità :</b> Definisce un costruttore di player 
 * 
 * @author Matteo
 *
 */
public interface playerFactory {
	/**
	 * Costruttore di un giocatore
	 * @param id
	 * @param disco
	 * @return player
	 */
	public Player createPlayer(String id , Disco disco);
	

}
