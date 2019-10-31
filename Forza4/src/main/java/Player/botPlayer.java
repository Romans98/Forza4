/**
 * 
 */
package Player;

import Model.Disco;

/**
 * <b>Responsabilità :</b> Definisce un player bot controllato dalla CPU 
 * 
 * @author Matteo
 *
 */
public class botPlayer implements Player{
	/**
	 * Identificativo del bot
	 */
	String id;
	/**
	 * Disco del bot
	 */
	Disco disco;
	
	/**
	 * Costruttore di un giocatore bot
	 * @param id
	 * @param disco
	 */
	public botPlayer(String id , Disco disco) {
		this.disco=disco;
		this.id=id;
		
	}

	@Override
	public Disco getDisco() {
		// TODO Auto-generated method stub
		return this.disco;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	
	

}
