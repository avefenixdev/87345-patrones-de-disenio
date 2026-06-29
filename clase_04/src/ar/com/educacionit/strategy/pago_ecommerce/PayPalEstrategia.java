package ar.com.educacionit.strategy.pago_ecommerce;

import ar.com.educacionit.strategy.pago_ecommerce.interfaces.PagoEstrategia;

// Estrategias completas (PayPal)
public class PayPalEstrategia implements PagoEstrategia {
	
	private String email;

	public PayPalEstrategia(String email) {
		this.email = email;
	}

	@Override
	public void pagar(int monto) {
		System.out.println("Pagando $" + monto + " con PayPal: " + this.email);
		
	}

}
