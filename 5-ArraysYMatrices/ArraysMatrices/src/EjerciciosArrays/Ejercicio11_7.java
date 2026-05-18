package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11_7 {
static Scanner sc= new Scanner(System.in); //Declara el objeto para usarlo globalmente
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 7. Leed de teclado 2 arrays de 5 números. Decid:
a. Qué números están en los dos arrays.
b. Qué números aparecen sólo en el primer array.
 */
/* Lógica anotaciones y código
 * La idea es leer 2 arrays de 5 números introducidos por el array y usando un mismo for 
 * tras rellenar el segundo tenemos que hacer comparaciones En el primer caso se recorren los 2 arrays y comparandolos
 * por valor si son iguales se muestran si no no
 * En el segundo se recorre una posicion del primer array y usando un bucle interno Se compara esa posicion 
 * Si lo encuentra 
 * Ejemplo de incrementos 
 * int i = 10 
 * int calculo = ++i * 2 = 11 * 2 = 22 Primero incrementa 
 * i-- 
 * calculo = i++ * 2 = 10 * 2 = 20 
 * i = 11
 * calculo = 20 Aja
 * No se puede hacer i++5 se hace i+=5
 */
//Generalmente para recorrer un array con posicion """"MODIFICABLE""""" Lo que se suele hacer es
//Cortar el bucle cuando el usuario pida y usar un contador para ir variando (La longitud que se quiere correr)
//Sigue existiendo en memoria de todas formas
	
	String continuar;
	do {
		System.out.println("Desea empezar/continuar? (SI|NO)");
		continuar = sc.nextLine();
		while(!continuar.equalsIgnoreCase("SI") && !continuar.equalsIgnoreCase("NO")) {
			System.out.println("Debe Introducir (SI|NO)");
			continuar = sc.nextLine();
		}
		if(!continuar.equalsIgnoreCase("NO")) {
			int primerArray[] = new int[5];
			int segundoArray[] = new int[5];
			int Caso1[] = new int[segundoArray.length]; //Se usa como maximo el numero posible
			int Caso2[] = new int[primerArray.length]; //Se usa como maximo el numero posible 
			//Los Arrays casi siempre se declaran de forma local y dandoles el tamaño por defecto 
			//El truco es buscar realmente la conveniencia de que numero/variable o lo que sea se use como tamaño
			//Se reinician los Arrays TODOS POR CUESTIONES DE SEGURIDAD
			RellenarPrimerArray(primerArray);
			RellenarSegundoArray(segundoArray);
		//For multiple (EL mismo numero puede estar en posiciones distintas por lo que es necesario sacar 
		//El primer número del primer Array se compara con todos y si encuentra su pareja se crea otro 
		//Array Para no alterar la Paz de los otros y se va rellenando con el valor correspondiente en funcion de la posicion
		int control;
		for (int i = 0; i<segundoArray.length ; i++) {
			control = 0;
			for(int j= 0; (j<primerArray.length) && control == 0; j++) {
				if(segundoArray[i] == primerArray[j]) {
				Caso1[i] = primerArray[j];
				//Caso1 = new int[contador]; No vale porque machaca lo creado previamente además de no poder tener consistencia
				control = -1 ;
				}
		}
		if(control == -1)
		System.out.print(Caso1[i]+" ");
		}
	System.out.println(" ");
	control = 0;
	for (int i = 0; i<primerArray.length; i++) {
		control = 0;
		for (int j = 0; (j<segundoArray.length && control == 0);j++) {
		if(primerArray[i] == segundoArray[j]) {
			control = -1;
		}
		}
		if(control == 0) {
			Caso2[i] = primerArray[i];
			System.out.print(Caso2[i]+" ");
		}
		}
	}
		//For multiple 
		//Se recorre todo el primer array en cada vuelta si encuentra el número se termina el bucle 
		//Caso contrario se guarda en el segundo bucle
	/*
		System.out.println(" ");
	*/
		sc.nextLine(); //Limpiar buffer
		System.out.println(" "); //Salto de linea
	} while (!continuar.equalsIgnoreCase("NO"));
	System.out.println("Gracias por ejecutarme");
	}
	public static void RellenarPrimerArray(int primerArray[]) {
		for (int i = 0; i<primerArray.length;i++) {
		System.out.println("Introduzca números para el array");
		primerArray[i] = sc.nextInt();
		}
	}
	public static void RellenarSegundoArray(int segundoArray[]) {
		for (int i = 0; i<segundoArray.length;i++) {
		System.out.println("Introduzca números para el segundo array");
		segundoArray[i] = sc.nextInt();
		}
	}
}
