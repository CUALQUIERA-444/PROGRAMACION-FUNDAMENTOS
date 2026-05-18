package Ejercicio13_1;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalSatelite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. La agencia espacial europea guarda para cada satélite la distancia de la tierra a la
		que se encuentra así como el meridano y el paralelo en los que orbita. Diseñar una
		clase que nos permita:
		• Saber si un satélite está en órbita
		• Variar la altura de un satélite (distancia a la tierra)
		• Variar su posición (varían el meridiano y el paralelo)
		Generar satélites en la clase main para comprobar que la clase satélite funciona
*/
/* Creamos objetos de tipo satelite y usamos las distintas funciones 
 * Para corroborar que la clase funciona
 */
	Scanner sc = new Scanner (System.in);
	sc.useLocale(Locale.ENGLISH);
	double d = 20;
	double m = 30;
	double p = 10;
	Satélite sat1 = new Satélite(m,d,p);
	System.out.println(sat1.toString());
	 d = 2;
	 m = 3;
	 p = 1;
	Satélite sat2 = new Satélite(m,d,p);
	System.out.println(sat2.toString());
	 d = 12;
	 m = 20;
	Satélite sat3 = new Satélite(m,d,p);
	System.out.println(sat3.toString());
	System.out.println(sat1.EstaEnOrbita());
	sat2.ModificarAlturaDeUnSatelite(45.8);
	System.out.println(sat2.toString());
	sat3.ModificarPosicion(20.4, 3.3);
	System.out.println(sat3.toString());
	}
}
