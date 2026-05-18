package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio11_1 {
static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 1. Leed 10 números en un array. Una vez leídos todos recorred el array y mostrad los
que son pares, recorredlo de nuevo para mostrar los impares.
 */
/* Lógica código necesario y anotaciones
 * La idea es sencilla hacemos un array que se encarge de leer 10 numeros y en cada posición va rellenando uno 
 * usando un bucle mientras que hacemos otros 2 bucles adicionales que se encargen de mostrar los pares 
 * e Impares respectivamente.
 * Por seguridad usare un try-catch para excepciones de ArrayIndexOutOfBounds
 * Enviare el array por parametro a 2 funciones una que saque los pares y otra los impares
 * Necesitamos un array de enteros que independientemente del numero lo haremos de tipo int 
 * InputMisMatchException
 * El proceso termina cuando complete de rellenar el array
 */
	int numeros[] = new int[10]; //DEFINE LONGITUD
	sc = new Scanner(System.in);
		/*	int i = 0; SE CONSERVA EL VALOR DEL QUE SALE DEL BUCLE
	 * for (; i< numeros.length; i++) {
	 * }
	 */
	/*	int i; LA VARIABLE TODAVIA EXISTE PERO EL VALOR NO 
		 * for (i = 0 ; i< numeros.length; i++) {
		 * }
	 */

	int i; //SE GUARDA LA VARIABLE PARA QUE? EM APRENDER
	for (i = 0; i<numeros.length;i++) { //UNA VARIABLE VIVE DENTRO DE DONDE HA NACIDO Y EL FOR SIN COSAS ADICIONALES ES MUY ESTRICTO
		System.out.println("Introduce un número entero \"Tienen que ser 10 Contador numeros "+(i+1)+"\"");
		numeros[i] = sc.nextInt();
	}
	BuscarPares(numeros); //NO HACE FALTA PASAR LAS LLAVES NI LA LONGITUD
	BuscarImpares(numeros); //NO HACE FALTA PASAR LAS LLAVES NI LA LONGITUD
 }
	public static void BuscarPares (int numeros[]) {//TIENE LA LONGITUD GUARDADA EN MEMORIA
	int j; 
	System.out.print("[");
	for (j = 0; j<numeros.length;j++) {//DE 0 + 9 = 10 NUMEROS POR AHORA VALIDAMOS CON UN IF
		if(numeros[j] % 2 == 0)
			System.out.print(+numeros[j]+" "); //No necesario el espacio
	}
	System.out.print("]");
}
	public static void BuscarImpares (int numeros[]) {
	int k;
	System.out.print("[");
	for (k = 0; k<numeros.length;k++) {//DE 0 + 9 = 10 NUMEROS POR AHORA VALIDAMOS CON UN IF AUNQUE TEORICAMENTE SE PUEDE REDUCIR LA LONGITUD Y YA 
		//PERO ES MAS COMPLEJO
		if(numeros[k] % 2 != 0)
			System.out.print(numeros[k]+" ");
}
	System.out.print("]");
	}
}
