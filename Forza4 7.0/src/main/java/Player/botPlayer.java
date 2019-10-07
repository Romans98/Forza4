/**
 * 
 */
package Player;

import Model.Disco;

/**
 * @author matti
 *
 */
public class botPlayer implements Player{
	
	String id;
	Disco disco;
	
	
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
