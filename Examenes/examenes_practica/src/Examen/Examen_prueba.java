package Examen;

import java.util.Scanner;

public class Examen_prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* Un código de seguimiento debe ser una cadena (String) de exactamente 10 caracteres.

Debe comenzar con el prefijo de la ciudad, que puede ser "MAD" (Madrid), "BCN" (Barcelona), o "VAL" (Valencia).

Los siguientes 7 caracteres deben ser dígitos numéricos (del 0 al 9).

Ejemplos Válidos: MAD1234567, BCN9876540.

Definición de Excepciones (2 Ptos): Deberás crear y utilizar las siguientes excepciones personalizadas (dentro de un "paquete" o módulo, si tu lenguaje lo requiere):

CodigoInvalidoException: Excepción base que hereda de la clase estándar Exception.

LongitudIncorrectaException: Se lanza si el código no tiene 10 caracteres.

PrefijoDesconocidoException: Se lanza si los primeros 3 caracteres no son MAD, BCN, o VAL.
*/
	Scanner sc = new Scanner (System.in);
	boolean correcto = false;
	String codigo;
	do {
	try {
		System.out.println("Introduce un código de envío");
		codigo = sc.nextLine();
		{
		correcto = validarCodigo(codigo);
		}
	}
	catch (LongitudInvalidaException e) {
		System.out.println(e.getMessage());
	}
	catch (PrefijoDesconocidoException a) {
		System.out.println(a.getMessage());
	}
	}
	while (correcto == false);
	}
	public static boolean validarCodigo(String codigo) throws LongitudInvalidaException , PrefijoDesconocidoException  {
		String letras = "";
		letras = codigo.substring(0,3);
		if (codigo.length()!=10) {
			throw new LongitudInvalidaException("El codigo debe ser de 10 caracteres");
		}
		if (!letras.equalsIgnoreCase("MAD")&& !letras.equalsIgnoreCase("BCN") && !letras.equalsIgnoreCase("VAL")) 
			throw new PrefijoDesconocidoException ("Solo tenemos envios para los prefijos MAD BCN O VAL");
		System.out.println("miaw");
		return true;
	}
}
