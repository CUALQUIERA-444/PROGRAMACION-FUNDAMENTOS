package práctica6;

import java.util.Scanner;

public class Ejercicio3_Práctica6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//En una empresa de fruta se seleccionan 3 categorias dependiendo de su calibre: 
	//	A ( de 1 a 3 cm)
	 // B (de 3 a 5 cm)
	 // C (más de 5) 
	 // Anotar el grosos de cada fresa hasta anotar 0
	// Decir cuantas hay de cada categoría y si no ha habido fresas de alguna categoría
	 int calibre;
	 int contador_A = 0;
	 int contador_B = 0;
	 int contador_C = 0;
	 Scanner sc = new Scanner(System.in);
	 do {
		 System.out.println("Introduce el grosor de su fresa");
		 calibre = sc.nextInt();
		 if ( calibre != 0) {// Para que el cero no entre
		 if ( calibre <=2) // Menores o iguales a 2 sin incluir 0
			 contador_A++;
		 else if (calibre == 3) { // 3 necesito ejecutar 2 instrucciones por lo que hacemos esto
			 contador_A++;
			 contador_B++;
		 }
		 else if (calibre > 5)  // Mayores que 5 
			 contador_C++;
		 else  // Lo demas
			 contador_B++;
	 }
	 }
	while (calibre != 0);
	 System.out.println("La cantidad de fresas de la categoría A son:"+contador_A);
	 System.out.println("La cantidad de fresas de la categoría B son:"+contador_B);
	 System.out.println("La cantidad de fresas de la categoría C son:"+contador_C);
	 if ( contador_C == 0 && contador_B == 0)
		 System.out.println("No ha habido fresas en la categoría C ni en la B");
	 else if ( contador_C == 0 && contador_A == 0)
		 System.out.println("No ha habido fresas en la categoría C ni en la A");
	 else if ( contador_B ==  0 && contador_A == 0)
		 System.out.println("No ha habido fresas en la categoría B ni en la A");
	 else  if (contador_A == 0) 
		 System.out.println("No ha habido fresas en la categoría A");
	 else if ( contador_B == 0 )
		 System.out.println("No ha habido fresas en la categoría B");
	 else if ( contador_C == 0)
		 System.out.println("No ha habido fresas en la categoría C");
	}
}
