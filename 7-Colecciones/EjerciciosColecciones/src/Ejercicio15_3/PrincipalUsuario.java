package Ejercicio15_3;

import java.util.Scanner;
import java.util.*;
public class PrincipalUsuario {
	/*
	 * 3. Simulad el comportamiento de una cola de usuarios en la taquilla de un cine
	usando una linkedList. Inicialmente se anotan el número de entradas disponibles.
	Haced un menú con tres opciones:
	1. Llegada de un usuario a la cola del cine. Se le pide el nombre y el número de
	entradas, se le guarda el usuario al final de la cola.
	2. Un usuario compra sus entradas. Se saca el primer usuario de la cola. El
	usuario o compra todas las entradas que tenía pensado comprar o ninguna,
	es decir, si no quedan suficientes entradas disponibles se va sin comprar
	ninguna. Si después de comprar se agotan las entradas, se eliminan a todos
	los usuarios de la cola y se sale del menú.
	3. Un usuario random abandona la cola
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int entradas_disponibles;
	String nombre;
	int entradas_solicitadas = 0; 
	int clientes_cont;
	boolean vacio = false;
	int contador_con = 0;
	int opc;
	Scanner sc = new Scanner(System.in);
	LinkedList<Usuario> usuarios = new LinkedList <Usuario>(); //Lista en donde se guardan los usuarios
	System.out.println("Introduce la cantidad de entradas disponibles");
	do {
		entradas_disponibles = sc.nextInt();
		sc.nextLine(); //Limpiar Buffer
	if(entradas_disponibles <= 0) {
		System.out.println("Lo siento pero no es numero valido de entradas vuelve a intentarlo");
	}
	} while(entradas_disponibles <=0);
	do {
		for(Usuario aux: usuarios) {
			System.out.println(aux.toString());
		}
		System.out.println("Seleccione la opción que desee");
		System.out.println("1.Añadir usuarios al final de la cola");
		System.out.println("2.Comprar entradas");
		System.out.println("3.Matar a alguien aleatorio");
		opc = sc.nextInt();
		sc.nextLine(); //Limpiar Buffer
	switch(opc) {
	//PASO 1 AÑADIR USUARIOS AL FINAL DE LA COLA 
	case 1: 
	System.out.println("Cuantas personas van a acceder a la cola?");
	clientes_cont = sc.nextInt();
	sc.nextLine(); //Limpia el buffer
	do {
		System.out.println("Introduzca su nombre");
		nombre = sc.nextLine();
		System.out.println("Introduzca la cantidad de entradas que quiera comprar");
		entradas_solicitadas = sc.nextInt(); 
		sc.nextLine(); //Limpiar buffer
		Usuario u = new Usuario(entradas_solicitadas,nombre);
		usuarios.addLast(u); //Lo añade al final de la cola
		contador_con++; //En funcion de los clientes que se hayan puesto que van a entrar 
	} while(contador_con < clientes_cont);
	contador_con = 0;
	break;
	//PASO 2 SACAR AL PRIMER USUARIO DE LA COLA COMPRANDO LAS ENTRADAS SIEMPRE Y CUANDO HAYA ENTRADAS SUFICIENTES
	case 2:
		if(!usuarios.isEmpty()) {
		int entradas = usuarios.getFirst().getEntradas_solicitadas();
		if(entradas > entradas_disponibles) {
			System.out.println("Lo siento no hay suficientes entradas vayase");
			Usuario perdedor = usuarios.getFirst();
			BorrarPerdedor(perdedor,usuarios);
		}
		else {
			entradas_disponibles = entradas_disponibles - entradas;
			usuarios.getFirst().Compra();
			System.out.println(usuarios.getFirst());
			usuarios.removeFirst();
			System.out.println("Compra realizada");
			if(entradas_disponibles == 0) {
				System.out.println("Ya no hay nada que hacer vayanse todos");
				usuarios.clear();
				vacio = true;
			}
		}
		}
	break;
	case 3:
		if(!usuarios.isEmpty()) {
		Random r = new Random();
		int aleatorio = r.nextInt(usuarios.size()); //Por defecto el valor es cualquiera entre 4 millones XD
		//Entre 0 y size 
		usuarios.remove(aleatorio);
		}
	break;
	default:
		System.out.println("Opción no valida volviendo al menú");
	break;
	}
	} while(vacio == false);
	for(Usuario aux: usuarios) {
		System.out.println(aux.toString());
	}
	}
	public static void BorrarPerdedor(Usuario perdedor,LinkedList<Usuario> usu) {
		Iterator<Usuario> it = usu.iterator();
		while(it.hasNext()) {
			Usuario u = it.next();
			if(perdedor.equals(u)) {
				it.remove();
			}
		}
	}
}
	
