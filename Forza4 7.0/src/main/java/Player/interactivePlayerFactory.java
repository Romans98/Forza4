/**
 * 
 */
package Player;

import Model.Disco;

/**
 * @author matti
 *
 */
public class interactivePlayerFactory implements playerFactory {

	@Override
	public Player createPlayer(String id, Disco disco) {
		// TODO Auto-generated method stub
		return new interactivePlayer(id,disco);
	}
	
	

}
