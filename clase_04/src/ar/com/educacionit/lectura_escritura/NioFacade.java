package ar.com.educacionit.lectura_escritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioFacade {
	
	// Atributo -> final -> rutaArchivo es una constante
	private final Path rutaArchivo;

	public NioFacade(String rutaArchivo) {
		this.rutaArchivo = Paths.get(rutaArchivo);
	}
	
	// Creamos el archivo si no existe
	public void crearArchivoSiNoExiste() throws IOException {
		if ( Files.notExists(rutaArchivo)) {
			Files.createFile(rutaArchivo);
			System.out.println("Archivo creado: " + rutaArchivo.toAbsolutePath());
		}
	}
	
	// Escribir líneas en una archivo
	// Leer líneas de una cadena (stream)
	// Copiar archivo a destino
	// Eliminar archivo
	
	

}
