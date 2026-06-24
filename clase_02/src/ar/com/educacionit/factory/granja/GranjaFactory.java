package ar.com.educacionit.factory.granja;

import ar.com.educacionit.factory.granja.interfaces.Animal;

public class GranjaFactory {

	public Animal crearAnimal(String tipoDeAnimal) {
		
		
		switch (tipoDeAnimal) {
		case "VACA": {
			return new Vaca();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + tipoDeAnimal);
		}
	}
	
}
