/**
 * 
 */
package Player;

import Model.Disco;

/**
 * <b>Responsabilità :</b> Costruisce un player bot 
 * 
 * @author Matteo
 *
 */
public class botPlayerFactory implements playerFactory{

	@Override
	public Player createPlayer(String id, Disco disco) {
		// TODO Auto-generated method stub
		return new botPlayer(id,disco);
	}

}
