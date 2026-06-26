package ar.com.educacionit;

import ar.com.educacionit.factory.medios_pago.PaymentFactory;
import ar.com.educacionit.factory.medios_pago.enums.MediosPago;
import ar.com.educacionit.factory.medios_pago.interfaces.Payment;

public class Test {

	public static void main(String[] args) {
	
		PaymentFactory pf = new PaymentFactory();

		// cp tengo la instancia de tarjeta crédito
		Payment cp = pf.createPayment(MediosPago.CARD);
		cp.pay(222.3);
		
		Payment crypto = pf.createPayment(MediosPago.CRYPTO);
		crypto.pay(333.2);
		
		Payment pp = pf.createPayment(MediosPago.PAYPAL);
		pp.pay(888.5);
		
		// ---------------------------------
		System.out.println("-------------------------");
		// ---------------------------------
		
		// Patrón command (Comportamiento)
		
		// El patrón command sirve para separar quién pide una acción de quién ejecuta la acción
		// O sea nos obliga a no mezclar la lógica del botón/shorcut con la lógica de ejecución
		
		// Comando concreto -> EscribirComando
		// RECEIVER -> Recibe la tarea a realizar -> EditorTexto
		// INVOKER -> Invoca -> CommandManager
		
	}

}
