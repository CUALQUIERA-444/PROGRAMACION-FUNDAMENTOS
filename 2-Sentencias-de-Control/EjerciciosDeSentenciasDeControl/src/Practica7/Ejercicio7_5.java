package Practica7;

import java.util.Scanner;

public class Ejercicio7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 5. En un cine las entradas cuestan 5 euros. Se hace el 50% de descuento los
martes a los mayores de 65 años, los miércoles el 20% a todos los públicos y el
fin de semana el 15% a los menores de 18 años. Hacer un programa que simule
el siguiente proceso : se pide por teclado el día de la semana , se valida que sea
correcto (L,M,X,J,V,S o D). Se van pidiendo las edades de la gente que llega a la
taquilla, si es necesario, y se muestra el precio de la entrada.
 */
	/*
	 * Lógica 
	 * Por defecto las entradas cuestan 5 euros y se va a haciendo descuento en función de diferentes condiciones
	 * Si es martes y hay mayores de 65 años se les hace descuento 
	 * Los miercoles se hace descuento para todos los públicos sin importar la edad 
	 * Si es fin de semana y hay menores de 18 años Se les hace descuento 
	 * 
	 * 
	 */
		/*
		 * Variables sentencias funciones etc...
		 * Otra que vaya guardando el dia de la semana el cual deberá ser validado 
		 * Otro que vaya guardando las edades de las personas en caso de ser algun dia en particular
		 * "Se van pidiendo las edades de la gente que llega a la taquilla" 
		 * Al final se muestra el precio de su entrada 
		 * Funcion que se encarge de validar el dia y repetir la validación en caso de no ser correcto se pasa el dato pedido del char
		 * Funcion que se encarge de calcular el precio de entrada en base a 
		 */
		Scanner sc = new Scanner (System.in);
		final double precio_inical = 5, desc1 = 50, desc2 = 20, desc3 = 15;
		int edad;
		char día;
		boolean validar;
		double precio_final;
		do { //Este do-while trabaja en conjunto con la función
		System.out.println("Bienvenido al cine por favor introduzca con una letra el día en el que nos encontramos");
		día = sc.nextLine().charAt(0);
		día = Character.toUpperCase(día); //Si no se escribe nada habrá error pero por ahora no lo controlaremos (Excepción)
		validar = ValidarDía(día); //Función correcta
		if (validar == false) {
			System.out.println("Lo siento ese día no es valido vuelva a intentarlo");
		}
		} while (validar == false);
		//Función que dependido del día que sea se pida edad o no
	    if(PedirEdad(día) == true) {
	    	System.out.println("Introduzca su edad");
	    	edad = sc.nextInt();
	    }
	    else {
	    	edad = 0;
	    }
	  	precio_final = CalcularTotal(edad,día,desc1,desc2,desc3,precio_inical);
		System.out.println("Su entrada costará en total "+precio_final+" euros");
	}
	public static boolean ValidarDía (char d) {
		if (d != 'L' && d != 'M' && d != 'X' && d != 'J' && d != 'V' && d != 'S' && d != 'D') { //Se puede retornar ya que java evalua prinmero si la condicion se cumple o no y dependiendo el resultado devulve
			//una cosa u otra pero por ahora mejor asi
		return false;	
		}
		else {
			return true;
		}
	}
	public static boolean PedirEdad(char d) {
		return (d == 'M' || d == 'S' || d=='D' ); //Si se cumple true si no false 
	}
	public static double CalcularTotal (int e, char d, double de1, double de2, double de3, double precio_inicial) { //Los parametros DEBEN estar en el mismo orden y este influye en el tipo de resultado que se te pueda devolver
		//Por lo que es importante que las variables se entiendan
		double precio_f;
		if ( d == 'M' && e >= 65) {
			precio_f = precio_inicial - (precio_inicial * de1 / 100); //Formula de descuento 
		}
		else if ( (d == 'S' || d == 'D') && e < 18) {
			precio_f = precio_inicial - (precio_inicial * de3 / 100); //Formula de descuento 
		}
		else if (d == 'X')  {
			precio_f = precio_inicial - (precio_inicial * de2 / 100); //Formula de descuento 
		}
		else {
			precio_f = precio_inicial;
		} 
		return precio_f;
	}
}
