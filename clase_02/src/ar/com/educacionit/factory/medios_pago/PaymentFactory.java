package ar.com.educacionit.factory.medios_pago;

public class PaymentFactory {

	
	public Payment createPayment(String payment) {
		switch (payment) {
		case "CARD": {
			return new CardPayment();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + payment);
		}
	}
}
