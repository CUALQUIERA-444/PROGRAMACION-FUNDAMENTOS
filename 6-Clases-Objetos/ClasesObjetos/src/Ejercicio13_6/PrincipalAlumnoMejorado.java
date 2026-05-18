package Ejercicio13_6;
/*6. Al ejercicio número 3 añadirle una variable que guarde el número de alumnos con
nota media aprobada.
*/

import java.util.Locale;
import java.util.Scanner;



public class PrincipalAlumnoMejorado {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		AlumnoMejorado alumno1 = new AlumnoMejorado ("1122-DDD");
		AlumnoMejorado alumno2 = new AlumnoMejorado ("2211-DND");
		AlumnoMejorado alumno3 = new AlumnoMejorado("2020-DIC");
		System.out.println(alumno1.toString());
		System.out.println(alumno2.toString());
		System.out.println(alumno3.toString());
		System.out.println("Medias aprobadas "+AlumnoMejorado.getContadorMedias());
		OrdenarMedias(alumno1,alumno2,alumno3); //Necesario pasarlos
		}
		public static void OrdenarMedias(AlumnoMejorado a, AlumnoMejorado b, AlumnoMejorado c) {
		//6 combinaciones 2 pares para los 3 numeros principales pasados
		if(a.getMedia() >= b.getMedia() && a.getMedia() >= c.getMedia()) {
			if(b.getMedia() >= c.getMedia()) {
				imprimir(a,b,c);
			}
			else {
				imprimir(a,c,b);
			}
		}
		else if(b.getMedia() >= a.getMedia() && b.getMedia() >= c.getMedia()) {
			if(a.getMedia() >= c.getMedia()) {
				imprimir(b,a,c);
			}
			else {
				imprimir(b,c,a);
			}
		}
		else {
			if(a.getMedia() >= b.getMedia()) {
				imprimir(c,a,b);
			}
			else {
				imprimir(c,b,a);
			}
		}
	}
		public static void imprimir(AlumnoMejorado a,AlumnoMejorado b, AlumnoMejorado c) {
			System.out.println(a.toString());
			System.out.println(b.toString());
			System.out.println(c.toString());
		}
	}

