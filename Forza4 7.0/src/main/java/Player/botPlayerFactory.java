/**
 * 
 */
package Player;

import Model.Disco;

/**
 * @author matti
 *
 */
public class botPlayerFactory implements playerFactory{

	@Override
	public Player createPlayer(String id, Disco disco) {
		// TODO Auto-generated method stub
		return new botPlayer(id,disco);
	}

}
