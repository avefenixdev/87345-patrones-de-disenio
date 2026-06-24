package ar.com.educacionit;

import ar.com.educacionit.decorator.cafeteria.Cafe;
import ar.com.educacionit.decorator.cafeteria.ConChocolate;
import ar.com.educacionit.decorator.cafeteria.ConVainilla;
import ar.com.educacionit.decorator.cafeteria.interfaces.Bebida;
import ar.com.educacionit.decorator.notificador.NotificadorEmail;
import ar.com.educacionit.decorator.notificador.NotificadorTikTok;
import ar.com.educacionit.decorator.notificador.NotificadorWhatsApp;
import ar.com.educacionit.decorator.notificador.interfaces.Notificador;
import ar.com.educacionit.pasarela.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02");
		
		Pago efe = new Efectivo();
		efe.procesarPago(202.35);
		System.out.println("--------------------------------");
		Pago tc = new TarjetaCredito();
		tc.procesarPago(462.53);
		
		// Patrón Decorador
		// Sirve para agregar funcionalidades a un objeto sin modificar el objeto base
		// La idea es envolver un objeto con otro objeto que le suma (funcionalidades) comportamientos
		
		// SIN EL PATRÓN
		// Tengo un Cafe (Cafe)
		// Tengo un café con chocolate (CafeConChocolate)
		// Tengo un café con chocolate (CafeConLeche)
		// Tengo un café con chocolate (CafeConLecheAzucar)
		
		// Con el patrón (El objeto base y los decoradores "implementan" la interfaz
		// Interfaz en común
		// Objeto base y los decoradores...
		
		System.out.println("--------------------------------");
		
		Cafe c = new Cafe();
		System.out.println(c.getDescripcion());
		System.out.println(c.getCosto());
		
		System.out.println("--------------------------------");
		// DECORACION
		Bebida cc = new ConChocolate(c); // Vistiendo al café, agregandole el chocolate
		
		System.out.println(cc.getDescripcion());
		System.out.println(cc.getCosto());
		
		System.out.println("--------------------------------");
		
		Bebida cc2 = new ConChocolate(cc);
		System.out.println(cc2.getDescripcion());
		System.out.println(cc2.getCosto());
		
		Bebida cv = new ConVainilla(cc2);
		System.out.println(cv.getDescripcion());
		System.out.println(cv.getCosto());
		
		System.out.println("-----------------------------------");
		System.out.println("Notificadores");
		System.out.println("-----------------------------------");
		
		Notificador ne = new NotificadorEmail();
		
		ne.enviar("Bienvenido a nuestro newslatter!");
		
		// Decorador
		
		Notificador nwa = new NotificadorWhatsApp(ne); // por email + whatsapp
		
		nwa.enviar("Bienvenido a nuestra comunidad!");
		
		
		Notificador net = new NotificadorTikTok(ne); // por email + tiktok
		
		net.enviar("Bienvenido a nuestro grupo de lectura");
		
		Notificador netwa = new NotificadorWhatsApp(net);
		
		netwa.enviar("Novedades del grupo de lectura!");
		
	}

}
