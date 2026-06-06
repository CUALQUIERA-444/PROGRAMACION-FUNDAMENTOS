package Ejercicio11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio16_11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Generar archivo original en funcion de las copias
		// Las copias se ven asi
		/*
		 * F1: Etmd eo F2: siaosñr
		 */
		// El resultado debe ser: Estimado señor
		Path p1 = Paths.get("Copia1.txt");
		Path p2 = Paths.get("Copia2.txt");
		Path c1 = Paths.get("Resultado.txt");
		Charset charset = Charset.forName("UTF-8");
		String linea_lecturaA = "";
		String linea_lecturaB = "";
		String linea_nueva = "";
		BufferedReader lectorA = null;
		BufferedReader lectorB = null;
		BufferedWriter constructor = null;
		try {
			lectorA = Files.newBufferedReader(p1, charset);
			lectorB = Files.newBufferedReader(p2, charset);
			constructor = Files.newBufferedWriter(c1, charset);
			// Linea lectura A = Etmd eo //Linea Lectura B = siaosñr
			// Entra en el primero E Segundo s ...
			while ((linea_lecturaA = lectorA.readLine()) != null && (linea_lecturaB = lectorB.readLine()) != null) {
				System.out.println(linea_lecturaA);
				System.out.println(linea_lecturaB);
				String linea_entera = linea_lecturaA + linea_lecturaB;
				System.out.println(linea_entera);
				for (int i = 0; i < linea_lecturaA.length(); i++) {
					char letra_par = linea_entera.charAt(i);
					char letra_impar = linea_entera.charAt(i + linea_lecturaA.length());
					linea_nueva = linea_nueva + letra_par + letra_impar;
				}
				constructor.write(linea_nueva);
				
				System.out.println(linea_nueva);
			}
			lectorA.close();
			lectorB.close();
			constructor.close();
		} catch (IOException e) {
			System.out.println("Error general");
		}
	}
}
