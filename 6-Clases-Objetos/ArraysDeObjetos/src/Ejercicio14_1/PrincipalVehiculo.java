package Ejercicio14_1;

import java.util.Scanner;

/*
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
/*
 * Logica codigo y anotaciones
 * En el 99% de los casos es recomendable insistir en la misma posicion en caso de encontrar un dato no valido 
 * Debido a que los arrays en contexto no es recomendable buscarlos por posicion sino que se usa un dato del objeto para buscarlos 
 * Entonces lo que se hace al menos en este contexto es usar la matricula para buscar el coche si tienen el mismo se intenta posteriormente 
 * verificar en función de la posicion 
 * 
 */
public class PrincipalVehiculo {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	String matricula = " ";
	String modelo;
	String marca;
	int año_mat;
	int cat;
	boolean alquilado;
	int limitador = 0;
	boolean iguales = false;
	boolean validarmat;
	double importe;
	int opc;
		// TODO Auto-generated method stub
	Vehiculo v[] = new Vehiculo[5]; //2 veces 
	for (int i = 0; i<v.length;i++)  {
		System.out.println("Introduce una matricula");
		do {
			//validarmat = false;
			matricula = sc.nextLine();
			validarmat = ValidarMatricula(matricula);
			if(!validarmat) {
				System.out.println("La matricula no es valida vuelva a introducirla");
			}
			else {
				if (i != 0) {
					iguales = BuscarCoincidencias(v,matricula,i);
					//limitador++; Siempre que fallo sumano 1 no quiero eso
					if(iguales)
						System.out.println("2 coches no pueden tener la misma matricula vuelva a intentarlo ");
				}
			}
		} while(!validarmat || iguales);
		System.out.println("Introduce el modelo del coche");
		modelo = sc.nextLine();
		System.out.println("Introduce la marca del coche");
		marca = sc.nextLine();
		System.out.println("Introduce el año de matriculación del coche");
		año_mat = sc.nextInt();
		System.out.println("Introduce la categoría del coche");
		cat = sc.nextInt();
		while(cat != 1 && cat !=2) {
			System.out.println("No es valida esa categoria tiene que ser 1 o 2 vuelva a intentarlo");
			cat = sc.nextInt();
		}
		sc.nextLine(); //Limpia el buffer
		v[i] = new Vehiculo(matricula,modelo,marca,año_mat,cat);
		}
	//La idea es que en funcion de la opcion elegida puedas alquilar devolver etc... un coche distinto a la vez
	//Sin embargo para cumplir esto es necesario tener en cuenta lo siguiente
	//1 Si introduces la matricula antes de elegir una opcion pero dentro del bucle es una mala idea 
	//Ya que cada vez que el usuario quiera hacer cualquier cosa tendria que introducir la matricula
	//Si lo pides antes entonces el usuario solo podría gestionar un unico coche para todas las operaciones
	do {
	System.out.println("Seleccione la opción que desee \n1.Alquile un vehículo \n2.Devuelva un vehículo \n3.Muestre el vehiculo \n4.Terminar");
	opc = sc.nextInt();
	sc.nextLine();
	Vehiculo encontrado = null; //Asegura cosas persistiendo que inicialmente no valga nada el objeto
	switch(opc) {
	case 1: 
		System.out.println("Introduce matricula");
		matricula = sc.nextLine();
		encontrado = buscarVehiculo(v,matricula); //Si lo encuentra apunta a la misma direccion que el objeto
		if(encontrado == null) //Funciona con objetos 
			System.out.println("No se encontro el vehiculo");
		else {
			int dias; 
			System.out.println("Introduce la cantidad de dias que quiere reservar el vehiculo\n");
			dias = sc.nextInt();
			sc.nextLine(); //Limpiar Scanner Lo ideal se ensucia y se limpia inmediatamente
			importe = encontrado.AlquilarVehiculo(dias);
			if(importe == 0) {
				System.out.println("El vehiculo ya esta alquilado\n");
			}
			else if(importe == -1) {
				System.out.println("La cantidad de dias que quiere alquilar no es valida\n");
			}
			else {
				System.out.printf("El importe es de alquiler es de %.3f€ \n",importe);
			}
		}
	break;
	case 2:
		System.out.println("Introduce matricula");
		matricula = sc.nextLine();
		encontrado = buscarVehiculo(v,matricula);
		if(encontrado == null) {
			System.out.println("No se encontro el vehiculo");
		}
		else {
			encontrado.DevolverVehiculo();
		}
	break;
	case 3:
		System.out.println("Introduce matricula");
		matricula = sc.nextLine();
		encontrado = buscarVehiculo(v,matricula);
		if(encontrado == null) {
			System.out.println("No se encontró el vehiculo");
		}
		else {
		System.out.println(encontrado.toString());
		}
	break;
	case 4:
	break;
	default:
		System.out.println("Opción inválida volviendo al menú");
	break;
	}
	} while (opc != 4);
	System.out.println("Alquileres en total "+Vehiculo.getContador_alquileres());
	System.out.println("Ganancias de la empresa "+Vehiculo.getGananciastotales()+"€");
}
	public static boolean ValidarMatricula(String matricula) {
		String regex = "^\\d{4}-[A-Za-z]{3}$";
		return matricula.matches(regex);
	}
	public static Vehiculo buscarVehiculo(Vehiculo v[],String mat) {
		//Cuando se habla de devolver la matricula nos referimos a usar la
		//Matricula para buscar el vehiculo 
		//Se coge el array y se coge la matricula 
		//Si se encuentra devuelve el objeto 
		//Si no devuelve null en el objeto
		for(int i=0;i<v.length;i++) {
			if(v[i].getMatricula().equalsIgnoreCase(mat)) {
				return v[i];
			}
		}
		return null; 
	}
	public static boolean BuscarCoincidencias(Vehiculo v[], String mat,int i) {
		for(int j=0;j<i;j++) {
			if(v[j].getMatricula().equalsIgnoreCase(mat)) {
				return true;
			}
		}
		return false;
	}
}
