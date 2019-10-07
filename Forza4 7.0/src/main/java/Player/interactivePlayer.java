/**
 * 
 */
package Player;

import Model.Disco;

/**
 * @author matti
 *
 */
public class interactivePlayer implements Player{
	
	private final String id;
	private Disco disco;
	
	
	public interactivePlayer(String id , Disco disco ) {
		this.id=id;
		this.disco=disco;
		
	}

	@Override
	public Disco getDisco() {
		// TODO Auto-generated method stub
		return this.disco;
		
	}

	public String getId() {
		return id;
	}

	

	
	
	

}
