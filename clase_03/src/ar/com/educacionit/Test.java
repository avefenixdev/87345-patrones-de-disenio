package ar.com.educacionit;

import ar.com.educacionit.builder.usuario.Usuario;
import ar.com.educacionit.command.editor_texto.CommandManager;
import ar.com.educacionit.command.editor_texto.EditorTexto;
import ar.com.educacionit.command.editor_texto.EscribirComando;
import ar.com.educacionit.command.editor_texto.interfaces.Command;
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
		
		// Recibe (Receiver)
		
		EditorTexto editor = new EditorTexto();
		
		// Invoca (Invoker)
		
		CommandManager manager = new CommandManager();
		
		// Comandos Concretos
		Command escribirHola = new EscribirComando(editor, "Hola ");
		manager.ejecutarComando(escribirHola);
		Command escribirMundo = new EscribirComando(editor, "Mundo");
		manager.ejecutarComando(escribirMundo);
		
		System.out.println("Texto actual: " + editor.getTexto()); // Hola Mundo
		
		manager.deshacerUltimo();
		
		System.out.println("Texto luego del borrar: " + editor.getTexto()); // Hola
		
		Command escribirChau = new EscribirComando(editor, "Chau");
		manager.ejecutarComando(escribirChau);
		
		System.out.println("Texto al final: " + editor.getTexto()); // Hola Chau
		
		// ---------------------------------
		System.out.println("-------------------------");
		// ---------------------------------
		
		// Patrón Builder (Creacional)
		// Lo que queremos evitar con este patrón son los constructres con múltples parametros.
		// Construir un objeto paso a paso de forma legible, controlada para obtener un objeto completo.
		
		// Usuario usuario = new Usuario("Maximiliano", "Principe", "15-5555-8568", 22, "max@gmail.com");
		
		Usuario u = new Usuario.Builder("Maxi", "Princi")
									.edad(22)
									.email("max@gmail.com")
									.telefono("15-5555-2535")
									.build();
		
		System.out.println(u);
		
	}

}
