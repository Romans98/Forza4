/**
 * 
 */
package Player;

import Model.Disco;

/**
 * @author matti
 *
 */
public interface playerFactory {
	
	public Player createPlayer(String id , Disco disco);
	

}
