package Ejercicio13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Charset charset = Charset.forName("UTF-8");
		ArrayList<Alumno> alumnos = new ArrayList<>();
		DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd/LL/yyyy");
		BufferedReader leer = null;
		Alumno al;
		BufferedWriter escribir = null;
		BufferedWriter escribir2 = null;
		Path p;
		Path errores = Paths.get("log.txt");
		Path ordenados = Paths.get("AlumnosOrdenados.txt");
		String fichero;
		System.out.println("Introduce la ruta del fichero");
		fichero = sc.nextLine();
		p = Paths.get(fichero);
		if (Files.isDirectory(p)) {
			System.out.println("Es un directorio no se puede leer");
		} else if (!Files.exists(p)) {
			System.out.println("No existe el fichero");
		}
		try {
			leer = Files.newBufferedReader(p, charset);
			escribir = Files.newBufferedWriter(errores, charset);
			escribir2 = Files.newBufferedWriter(ordenados, charset);
			String line = null;
			while ((line = leer.readLine()) != null) {
				try {
					int posicion;
					String datos[] = line.split(",");
					String nombre = datos[0];
					String apellido = datos[1];
					double nota = Double.parseDouble(datos[2]);
					LocalDate fecha = LocalDate.parse(datos[3], patron);
					al = new Alumno(nombre, apellido, nota, fecha);
					posicion = BuscarPosicion(al, alumnos);
					alumnos.add(posicion, al);
				} catch (DateTimeParseException e) {
					escribir.write(line + " La fecha no es válida");
				} catch (NumberFormatException e) {
					escribir.write(line + " No se pudo parsear el número");
				}
			}
			for (Alumno aux : alumnos) {
				// System.out.println(aux.toString());
				escribir2.write(aux.toString());
				//escribir2.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (leer != null) {
					leer.close();
				}
				if (escribir != null) {
					escribir.close();
				}
				if (escribir2 != null) {
					escribir2.close();
				}
			} catch (IOException e) {
				System.out.println("Error en el cierre");
			}
		}
		System.out.println("Gracias por ejecutarme");
	}

	public static int BuscarPosicion(Alumno al, ArrayList<Alumno> alumnos) {
		for (int i = 0; i < alumnos.size(); i++) {
			if (al.getNota() > alumnos.get(i).getNota()) {
				return i;
			}
		}
		return alumnos.size();
	}
}
