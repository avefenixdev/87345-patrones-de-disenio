package ar.com.educacionit;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.lectura_escritura.NioFacade;
import ar.com.educacionit.observer.youtube.CanalYoutube;
import ar.com.educacionit.observer.youtube.Usuario;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 04");
		
		// Patrón Facade (Fachada) -> Patrón de diseño estructural
		// Sirve para simplificar -> Te da una única interfaz simple 
		// para usar un sistema complejo que 
		// por detrás tiene muchas clases, metodos y dependencias
		
		NioFacade nf = new NioFacade("usuarios.txt");
		
		
		try {
			nf.crearArchivoSiNoExiste();
			/* nf.escribirLineas(List.of(
					"1,Maximiliano,activo",
					"2,Martin,activo",
					"3.Laura,activo",
					"4.Ana,novisible"
			)); */
			System.out.println("\n--- Usuarios activos ---");
			nf.leerLineasContenidas("activo");
			
			nf.copiarA("backups/usuarios_backup.txt");
			
			nf.borrar();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		// Patrón Observer (Patrón Comportamiento)
		// Una forma prolija, estructura y ordenada de avisar cambios sin andar preguntado 
		// todo el tiempo.
		// 1. Un objeto cambia
		// 2. otros objetos se enteran automaticamente.
		// 3. sin que el primero tenga que conocerlos uno por uno.
		// https://refactoring.guru/es/design-patterns/observer
		
		System.out.println("Patrón Observer");
		
		CanalYoutube canal = new CanalYoutube();
		
		Usuario u1 = new Usuario("Ana");
		Usuario u2 = new Usuario("Lorena");
		Usuario u3 = new Usuario("Debora");
		
		canal.suscribir(u1);
		canal.suscribir(u2);
		canal.suscribir(u3);
		
		canal.subirVideo("Patrón Observer explicado en 10 segundos");
		
		Usuario u4 = new Usuario("Luis");
		
		canal.suscribir(u4);
		
		canal.subirVideo("Patrón Strategy explicado en 10 segundos");
		
		// Patrón Memento (Patrón Comportamiento)
		// Sirve para guardar y restaurar el estado interno de un objeto sin violar la encapsulación.
		// GestorPartidas (Caretaker) -> gestor de checkpoints (Cuidador)
		// Jugador (Originador)
		// Memento (interfaz) // Contrato del memento
		// MementoConcreto (Memento)
		// https://refactoring.guru/es/design-patterns/memento
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
