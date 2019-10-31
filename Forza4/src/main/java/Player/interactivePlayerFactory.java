/**
 * 
 */
package Player;

import Model.Disco;

/**
 * <b>Responsabilità :</b> Costruisce un player interattivo 
 * 
 * @author Matteo
 *
 */
public class interactivePlayerFactory implements playerFactory {

	@Override
	public Player createPlayer(String id, Disco disco) {
		// TODO Auto-generated method stub
		return new interactivePlayer(id,disco);
	}
	
	

}
