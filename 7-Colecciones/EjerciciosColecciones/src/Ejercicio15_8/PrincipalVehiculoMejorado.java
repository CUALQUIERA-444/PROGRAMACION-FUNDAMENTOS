package Ejercicio15_8;
import java.util.*;
public class PrincipalVehiculoMejorado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 
	 * 8.Hacer el ejercicio 1 de la práctica de clases, de vehículos de alquiler, llevando
los vehículos en un HashMap que tiene como clave la matrícula y como dato el
objeto Vehículo.
	 */

		/*En una empresa de alquiler de automóviles se guarda por cada vehículo la
		siguiente información: matrícula, modelo, marca, año de matriculación, categoría
		(1 ó 2). Crear una clase Vehículo que pueda realizar las siguientes operaciones:
		 * - Alquiler de un vehículo: Se le pasa el número de días que se quiere alquilar
		y se retorna el importe del mismo teniendo en cuenta las siguientes tarifas:
		Tipo		  2 dias        Mas de 
		vehiculo	  o menos		2 días
		1			  45€/día		30 euros/día
		2			  50€/dia		40 euros/día

		Si el vehículo ya está alquilado se retorna 0.
		- Devolver un vehículo. Si no está alquilado da error.
		- Saber si un vehículo está alquilado o no.
		- Saber cuántos vehículos hay alquilados en este momento.
		- Ganancias totales de ese vehículo.
		- Método que me retorne cuáles son las ganancias totales de toda la
		empresa.
		 * Codificar un main con un array en el que almacenaremos 5 vehículos.
 *  El main tiene
que hacer lo siguiente:
1. Leer de teclado los datos de los 5 vehículos, valide que son
 correctos y cree
los 5 vehículos. 
Haced un método que valide una matrícula: 
7 caracteres, 4
dígitos y 3 letras.
2. De la posibilidad de alquilar, devolver, o mostrar la información de
cualquiera de los vehículos del array, anotando la matrícula.
3. Al terminar mostrar cuántos vehículos hay alquilados y las ganancias de
toda la empresa.
 */
	
//Paso 1 Crear el HashMap 
	HashMap<String,VehiculoMejorado> V_m = new HashMap<>();
//Paso 2 Variables 
	Scanner sc = new Scanner (System.in);
	String matricula = " ";
	String modelo;
	String marca;
	int año_mat;
	int cat = 0;
	boolean validarmat;
	boolean iguales = false;
	double importe;
	VehiculoMejorado placeholder = null; //Posteriormente apunta a otro sitio 
	int opc;
	final int limite = 5;
//Paso 3 Rellenar el HashMap de vehiculos hasta llegar a 5...
	do {
	System.out.println("Introduce la matrícula del coche");
	do {
	matricula = sc.nextLine(); 
	validarmat = ValidarMatricula(matricula);
	if(!validarmat) {
		System.out.println("Su matrícula no es válida vuelva a intentarlo");
		}
	else if(V_m.size() != 0) {
		iguales = BuscarCoincidencias(matricula,V_m);
		if(iguales) {
			System.out.println("No pueden ser iguales vuelva a intentarlo");
		}
		}
	}while(iguales || !validarmat);
				System.out.println("Introduce el modelo del vehiculo");
				modelo = sc.nextLine();
				System.out.println("Introduce la marca del vehiculo");
				marca = sc.nextLine();
				System.out.println("Introduce el año de matriculación del vehiculo");
				año_mat = sc.nextInt();
				sc.nextLine();
				while (cat != 1 && cat !=2) {
				System.out.println("Introduce la categoria del vehiculo");
				cat = sc.nextInt();
				sc.nextLine();
				if(cat != 1 && cat !=2 ) {
					System.out.println("Debe ser de la categoría 1 o la 2 obligatoriamente");
				}
				}
				placeholder = new VehiculoMejorado(matricula,modelo,marca,año_mat,cat);
				V_m.put(matricula, placeholder);
				cat = 0;
	} while (V_m.size() < limite);
	do {
	System.out.println("Seleccione la opción que más guste"); 
	System.out.println("1.Alquilar un vehículo");
	System.out.println("2.Devolver un vehiculo");
	System.out.println("3.Mostrar el vehículo");
	System.out.println("4.Terminar");
	opc = sc.nextInt();
	sc.nextLine();
	switch(opc) {
	case 1: 
		System.out.println("Introduce matrícula");
		matricula = sc.nextLine();
		if(!V_m.containsKey(matricula)) {
			System.out.println("No se encontro el vehiculo");
		}
		else {
			int dias;
			System.out.println("Introduce cuantos dias va a alquilar el coche");
			dias = sc.nextInt();
			sc.nextLine();
			importe = V_m.get(matricula).AlquilarVehiculo(dias);
			if(importe == 0) {
				System.out.println("El vehiculo ya está alquilado");
			}
			else if (importe == -1) {
				System.out.println("La cantidad de días que quiere alquilar no es válida");
			}
			else {
				System.out.printf("El importe del alquiler es de %.2f€ ",importe);
			}
		}
	break;
	case 2:
		System.out.println("Introduce matricula");
		matricula = sc.nextLine();
		if(!V_m.containsKey(matricula)) {
			System.out.println("No se encontro el vehiculo");
		}
		else {
			V_m.get(matricula).DevolverVehiculo();
		}
	break;
	case 3:
		System.out.println("Introduce matrícula");
		matricula = sc.nextLine();
		if(!V_m.containsKey(matricula)) {
			System.out.println("No se encontro el vehiculo");
		}
		else {
			System.out.println(V_m.get(matricula).toString());
		}
	break;
	case 4:
	break;
	default:
	break;
	}
	} while(opc != 4);
	System.out.println("Gracias por ejecutarme");
	System.out.println("Total alquileres"+" "+VehiculoMejorado.getContador_alquileres());
	System.out.printf("Gancias totales %.3f€",VehiculoMejorado.getGananciastotales());
	}
	public static boolean ValidarMatricula(String mat) {
		String regex = "^[0-9]{4}-[A-Za-z]{3}$";
		return mat.matches(regex);
	}
	public static boolean BuscarCoincidencias(String matricula,HashMap<String,VehiculoMejorado> V_m) {
		return V_m.containsKey(matricula);
	}
}
