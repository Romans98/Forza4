/**
 * 
 */
package Game;

/**
 * <b>Responsabilità :</b> Definisce un vincitore 
 * 
 * @author Matteo
 *
 */
public class Winner implements GameResult {
	
	/**
	 * Identificativo del giocatore
	 */
	private final String winnerID;
	/**
	 * Costruttore
	 * @param string
	 */
	public Winner(String string) {
		this.winnerID = string;
	}
	/**
	 * Restituisce il nome del vincitore
	 */
	@Override
	public String toString() {
		return "il vincitore è : " + winnerID;
	}

}
