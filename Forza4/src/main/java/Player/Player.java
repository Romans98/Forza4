/**
 * 
 */
package Player;

import Model.Disco;

/**
 * <b>Responsabilità :</b> Definire un giocatore  
 * 
 * @author Matteo
 *
 */
public interface Player {
	
	/**
	 * Metodo per accedere al disco del giocatore
	 * @return disco
	 */
	public Disco getDisco();
	/**
	 * Metodo per accedere all'identificativo del giocatore
	 * @return id
	 */
	public String getId();
	

}
