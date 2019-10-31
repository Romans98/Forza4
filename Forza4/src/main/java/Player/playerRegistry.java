package Player;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>Responsabilità :</b> Costruisce un registro dei giocatori 
 * 
 * @author Matteo
 *
 */

public class playerRegistry {
	
	/**
	 * Registro dei giocatori tramite un HashMap
	 */
	private Map<String, playerFactory> registry;
	/**
	 * Istanza del Player Registry
	 */
	private static final playerRegistry instance = new playerRegistry();
	/**
	 * Costruttore di un Player Registry
	 */
	private playerRegistry() {
		registry = new HashMap<String, playerFactory>();
		insertNewPlayerFactory("bot", new botPlayerFactory());
	}
	/**
	 * Metodo per accedere all'istanza del Player Registry
	 * @return istance
	 */
	public static playerRegistry getInstance() {
		return instance;
	}
	/**
	 * Metodo per l'inserimento di un player nel registry
	 * @param name
	 * @param playerFactory
	 */
	public void insertNewPlayerFactory(String name, playerFactory playerFactory) {
		registry.put(name, playerFactory);
	}
	/**
	 * Metodo per accedere ad un player factory tramite una stringa
	 * @param name
	 * @return
	 */
	public playerFactory getPlayerFactoryFromString(String name) {
		if(registry.containsKey(name)) {
			return registry.get(name);
		}
		
		return new interactivePlayerFactory();
	}

}
