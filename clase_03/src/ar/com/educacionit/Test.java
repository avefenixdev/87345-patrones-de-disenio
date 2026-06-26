package ar.com.educacionit;

import ar.com.educacionit.factory.medios_pago.PaymentFactory;
import ar.com.educacionit.factory.medios_pago.interfaces.Payment;

public class Test {

	public static void main(String[] args) {
	
		PaymentFactory pf = new PaymentFactory();

		// cp tengo la instancia de tarjeta crédito
		Payment cp = pf.createPayment("CARD");
		cp.pay(222.3);
		
		Payment crypto = pf.createPayment("CRYPTO");
		crypto.pay(333.2);
		
		Payment pp = pf.createPayment("PAYPAL");
		pp.pay(888.5);
	}

}
