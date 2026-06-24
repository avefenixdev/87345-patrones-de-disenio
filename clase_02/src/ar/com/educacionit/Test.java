package ar.com.educacionit;

import ar.com.educacionit.pasarela.*;

public class Test {

	public static void main(String[] args) {
		System.out.println("Clase 02");
		
		Pago efe = new Efectivo();
		efe.procesarPago(202.35);
		System.out.println("--------------------------------");
		Pago tc = new TarjetaCredito();
		tc.procesarPago(462.53);
	}

}
