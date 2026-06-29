package ar.com.educacionit;

import java.io.IOException;
import java.util.List;

import ar.com.educacionit.lectura_escritura.NioFacade;

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
		
		System.out.println("Patrón Observer");
		
		
		
	}

}
