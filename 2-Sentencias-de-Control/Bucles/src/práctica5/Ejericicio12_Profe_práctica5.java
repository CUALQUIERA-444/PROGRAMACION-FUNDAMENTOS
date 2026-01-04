package práctica5;

import java.util.Locale;
import java.util.Scanner;
import java.util.random.*;
public class Ejericicio12_Profe_práctica5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int contador_nota;
       double n_nota = 0;
       int contador = 0;
       int contador_2 = 0;
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.ENGLISH);
       System.out.println("Introduce cuantas notas quiere leer");
       contador_nota = sc.nextInt();
       for ( int i = 0 ; i < contador_nota; i++) {
    	   n_nota = Math.round((Math.random()*1000))/ 100;
    	   System.out.println(n_nota);
    	   if ( n_nota >= 5 )
    		   contador++;
    	  // else 
    		  //  contador_2++; //Primera opcion
       }
       System.out.println("La cantidad de alumnos que han aprobado son"+" "+contador);
       System.out.println("La cantidad de alumnos que han desaprobado son"+" "+(contador_nota - contador));
	}
}
