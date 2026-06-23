package ar.com.educacionit.singleton;

public class AppConfig {

	// instancia única
	private static AppConfig instance = null;
	
	private AppConfig() {};
	
	// Punto de acceso global
	public static AppConfig getInstance() {
		if ( instance == null) {
			instance = new AppConfig();
		}
		return instance;
	}
	
	

	
}
