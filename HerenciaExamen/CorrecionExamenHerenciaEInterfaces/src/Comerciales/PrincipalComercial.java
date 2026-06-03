package Comerciales;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class PrincipalComercial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	String nombre;
	boolean otro = true;
	String tipo;
	int unidades_vendidas;
	double sueldoFijo;
	ArrayList<Comercial> comerciales = new ArrayList<>();
	System.out.println("Introuce el sudo base de los empleados que trabajan a sueldo fijo:");
	sueldoFijo = sc.nextDouble();
	sc.nextLine(); //Limpiar buffer
	String marca;

	
	Fijo.setFijo(sueldoFijo);
	HashSet<String> marcas = new HashSet<String>();
	marcas.add("A");
	marcas.add("B");
	marcas.add("C");
	do {
		System.out.println("Introduce nombre:");
		nombre = sc.nextLine();
		System.out.println("Es un comercial fijo o con comision (F/C)");
		tipo = sc.nextLine();
		if(tipo.equalsIgnoreCase("F"))
			comerciales.add(new Fijo(nombre));
		else {
			do {
				System.out.println("Marca de la que obtiene beneficios extra:");
				marca = sc.nextLine();
			} while(!marcas.contains(marca));
			Comision p = new Comision(nombre,marca);
			comerciales.add(p);
		}
		if(comerciales.size()>=1 && comerciales.size()<4) {
			System.out.println("Otro comercial (S/N)");
			String seguir = sc.nextLine();
			if(seguir.equalsIgnoreCase("N")) {
				otro = false;
			}
		}
	} while(otro == true);
	//Salgo del bucle porque size>=1 && size<=4
	
	//Paso 1 Anotar el numero de empleado y la marca y verificar si existen 

	int numero_temporal;
	String marca_temporal;
	do {
	System.out.println("Introduce el número de empleado ");
	numero_temporal = sc.nextInt();
	sc.nextLine(); //Limpiar buffer 
	if(numero_temporal != -1) {
	Comercial c = BuscarObjeto(comerciales,numero_temporal);
	if(c == null) {
		System.out.println("No se encontro el numero");
	}
	else {
		System.out.println("Introduce la marca y te la validamos");
		marca_temporal = sc.nextLine();
		String buscar_marca = BuscarMarca(marcas,marca_temporal);
		if(buscar_marca == null) {
			System.out.println("No se encontro la marca");
		}
		else {
			System.out.println("Introduce las unidades vendidas");
			unidades_vendidas = sc.nextInt();
			sc.nextLine();
			c.vender(buscar_marca, unidades_vendidas);
		}
	}
	}
	} while(numero_temporal != -1);
	}
	public static Comercial BuscarObjeto(ArrayList <Comercial> comerciales,int numero) {
		for (Comercial aux :comerciales) {
			if(aux.getNumero() == numero) { //Aux representa el objeto 
				return aux; //Da igual si es fijo o de comision puesto a que este dato es comun a todos
			}
}
		return null;
}
	public static String BuscarMarca(HashSet <String> marcas, String m) {
		for (String aux: marcas) {
			if(aux.equalsIgnoreCase(m)) {
				return aux;
			}
		}
		return null;
	}
}
//interfaz clase con funciones sin codigo.