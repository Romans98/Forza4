package Player;

import java.util.HashMap;
import java.util.Map;



public class playerRegistry {
	private Map<String, playerFactory> registry;
	private static final playerRegistry instance = new playerRegistry();
	
	private playerRegistry() {
		registry = new HashMap<String, playerFactory>();
		insertNewPlayerFactory("bot", new botPlayerFactory());
	}
	
	public static playerRegistry getInstance() {
		return instance;
	}
	
	public void insertNewPlayerFactory(String name, playerFactory playerFactory) {
		registry.put(name, playerFactory);
	}
	
	public playerFactory getPlayerFactoryFromString(String name) {
		if(registry.containsKey(name)) {
			return registry.get(name);
		}
		
		return new interactivePlayerFactory();
	}

}
