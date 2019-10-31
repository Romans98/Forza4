/**
 * 
 */
package Model;

/**
 * @author matti
 *
 */
public class Disco extends Pedina {
	
	String forma;
	
	public Disco() {
		
	}

	public Disco(String string) {
		this.forma=string;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}
	@Override
	public String toString() {
		return this.forma;
	}

}
